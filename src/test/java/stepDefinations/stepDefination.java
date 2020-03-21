
package stepDefinations;

import static org.junit.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resource.base;

//@RunWith(Cucumber.class)

public class stepDefination extends base {

	String pageurl;

	ArrayList<String> hit = new ArrayList<String>();

	@Given("^URL is lunched$")
	public void url_is_lunched() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		driver = intializeDriver();

		pageurl = "https://developer.here.com/documentation";

		driver.get(pageurl);

	}

	@When("^compare the title actual with expected$")
	public void compare_the_title_actual_with_expected() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		String title = driver.getTitle();
		System.out.println("Title of page :" + title);
		assertEquals("Documentation, Code Examples and API References - HERE Developer", title);

	}

	@Then("^validations are \"([^\"]*)\"$")
	public void validations_are(String arg1) throws Throwable {

		System.out.println("Test case passed :" + arg1);

	}

	@Given("^Tester is on documentation page$")
	public void tester_is_on_documentation_page() throws Throwable {

		System.out.println("Page title:" + driver.getTitle());

	}

	@When("^Verify status code of documentation page having URL \"([^\"]*)\"$")
	public void verify_status_code_of_documentation_page_having_URL(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		URL url = new URL(arg1);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		int code = connection.getResponseCode();

		assertEquals(200, code);

		System.out.println("Response code of the page is " + code);
		if (code == 200) {
			System.out.println("OK");
		}

	}

	@Then("^validation are as per expected \"([^\"]*)\"$")
	public void validation_are_as_per_expected(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("status code of the documentation page is as per expected: " + arg1);

	}

	@Given("^documention page containing links$")
	public void documention_page_containing_links() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// get the documention menu using xpath
		WebElement docDriver = driver.findElement(By.xpath("(//ul[@class='menu menu--primary']/li[2]/div/div/div)[1]"));

		// Collect all links from documentation sub-menu
		List<WebElement> links = docDriver.findElements(By.tagName("a"));

		System.out.println("Total Links on Documentaion page menu :" + links.size());

	}

	@When("^click on each links it navigate appropriate page and check status code$")
	public void click_on_each_links_it_navigate_appropriate_page_and_check_status_code() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		WebDriverWait wait = new WebDriverWait(driver, 300);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//div[@class='right-side']//span[@data-title='Documentation']")));

		System.out.println("Tile Of Documentation page :" + driver.getTitle());

		// Creating action class for mouse/keybord interation
		Actions a = new Actions(driver);

		// path of documention
		WebElement document = driver
				.findElement(By.xpath("//div[@class='right-side']//span[@data-title='Documentation']"));

		// get the documention menu using xpath
		WebElement docDriver = driver.findElement(By.xpath("(//ul[@class='menu menu--primary']/li[2]/div/div/div)[1]"));

		// hover on documentation menu
		a.moveToElement(document).build().perform();

		// Collect all links from documentation sub-menu
		List<WebElement> links = docDriver.findElements(By.tagName("a"));

		// Total links
		System.out.println("Total Links :" + links.size());

		System.out.println("=============Links & Response=============");

		String pageURL = null;
		int count = 1;
		int icount = 0;
		int eCount = 0;
		// loop through anchor elements and get corresponding href (links)
		for (WebElement s : links) {

			System.out.println(count + ")");

			// invoke function to click on a link

			if (s.getAttribute("href").startsWith("https://developer.here.com/documentation")) {
				System.out.println("Link Type :Internal Link(Navigate to same page)");

				icount++;

				// Get link
				pageURL = s.getAttribute("href");
				System.out.println("Link =>" + pageURL);

				// clicking on link
				a.moveToElement(s).click().perform();

				// get title
				System.out.println("Title: " + driver.getTitle());

			}

			// To manage the links that navigate to different page

			else if ((s.getAttribute("href").startsWith("https://developer.here.com/"))
					&& (!s.getAttribute("href").contains("https://developer.here.com/documentation"))) {

				icount++;

				System.out.println("Link Type :Internal Link(Navigate to different page)");

				// Get link
				pageURL = s.getAttribute("href");
				System.out.println("Link =>" + pageURL);

				// for clicking
				String tab = Keys.chord(Keys.CONTROL, Keys.ENTER);

				s.sendKeys(tab);

				Thread.sleep(5000);

				Set<String> id = driver.getWindowHandles();

				Iterator<String> it = id.iterator();
				String parentid = it.next();

				while (it.hasNext()) {

					String sw = it.next();
					driver.switchTo().window(sw);

					// get title
					System.out.println("Title: " + driver.getTitle());

					driver.close();
				}

				// navigate back(documentation)
				driver.switchTo().window(parentid);

				a.moveToElement(document).build().perform();

			}

			else if (!s.getAttribute("href").startsWith("https://developer.here.com/")) {
				System.out.println("---------External Link----------");

				eCount++;

				// link type
				System.out.println("Link Type :External Link");

				// Get link
				pageURL = s.getAttribute("href");
				System.out.println("Link =>" + pageURL);

				String tab = Keys.chord(Keys.CONTROL, Keys.ENTER);

				s.sendKeys(tab);

				Thread.sleep(5000);

				Set<String> id = driver.getWindowHandles();

				Iterator<String> it = id.iterator();
				String parentid = it.next();

				while (it.hasNext()) {

					String sw = it.next();
					driver.switchTo().window(sw);

					// get title
					System.out.println("Title: " + driver.getTitle());

					driver.close();
				}

				// navigate back(documentation)
				driver.switchTo().window(parentid);

				a.moveToElement(document).build().perform();

			}

			// To Check the response

			URL url = new URL(pageURL);

			// Create a connection using URL object (i.e., link)
			HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();

			// Set the timeout for 2 seconds

			httpConn.setConnectTimeout(2000);

			// connect using connect method

			httpConn.connect();

			// use getResponseCode() to get the response code.

			if (httpConn.getResponseCode() == 200) {
				System.out.println("Link Response is 200 :" + " - " + httpConn.getResponseMessage());
			}
			if (httpConn.getResponseCode() == 404) {
				System.out.println("Link Response is Not 200 :" + " - " + httpConn.getResponseMessage());
			}

			count++;

			System.out.println("============================================");
			System.out.println("============================================");

		} // end of loop

		System.out.println("Total Internal Links :" + icount);
		System.out.println("Total external Links :" + eCount);

	}

	@Then("^validation as per expected \"([^\"]*)\"$")
	public void validation_as_per_expected(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("validation_as_per_expected :" + arg1);

	}

	@Then("^close the driver instance$")
	public void close_the_driver_instance() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		driver.close();

	}

}