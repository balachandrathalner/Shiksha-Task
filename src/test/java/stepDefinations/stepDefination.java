
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resource.base;

//@RunWith(Cucumber.class)

public class stepDefination extends base {

	String pageurl;

	List<String> links;

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
		System.out.println(title);
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

		System.out.println("links count in documentaion page  :" + driver.findElements(By.tagName("a")).size());

	}

	@When("^click on each links it navigate appropriate page and check status code$")
	public void click_on_each_links_it_navigate_appropriate_page_and_check_status_code() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// driver.get("https://developer.here.com/documentation");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (int i = 1; i < links.size(); i++) {

			WebDriverWait wait = new WebDriverWait(driver, 100);

			if (links.get(i).getAttribute("href").contains("javascript")) {
				wait.until(ExpectedConditions.elementToBeClickable((By.tagName("a"))));
				;

				String tab = Keys.chord(Keys.CONTROL, Keys.ENTER);
				driver.findElement(By.tagName("a")).sendKeys(tab);

				Thread.sleep(5000);

				Set<String> id = driver.getWindowHandles();

				Iterator<String> it = id.iterator();
				String parentid = it.next();

				while (it.hasNext()) {

					String s = it.next();
					driver.switchTo().window(s);
					String windowURL = driver.getCurrentUrl();

					hit.add(windowURL);
					driver.close();

				}
				driver.switchTo().window(parentid);

			}

			else {
				hit.add(links.get(i).getAttribute("href"));
			}

		}

		int count = 1;

		for (String url_links : hit) {

			System.out.println(count + ")");

			System.out.println("Link========>" + url_links);

			// To check URL
			driver.get(url_links);

			Thread.sleep(3000);

			System.out.println("Link Navigation page Title :" + driver.getTitle());

			// To Check the response

			URL url = new URL(url_links);

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

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			count++;
		}

	}

	@Then("^validation as per expected \"([^\"]*)\"$")
	public void validation_as_per_expected(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("validation_as_per_expected :" + arg1);

	}

	@Then("^Iterate all documention section link one by one$")
	public void iterate_all_documention_section_link_one_by_one() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("=======List of documentation section links=====");

		for (String url_links : hit) {

			System.out.println("Link========>" + url_links);

		}

	}

	@Then("^close the driver instance$")
	public void close_the_driver_instance() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		driver.close();

	}

}