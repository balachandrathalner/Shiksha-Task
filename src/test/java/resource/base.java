package resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public static WebDriver driver;

	public WebDriver intializeDriver() throws IOException {

		//proerties file object
		Properties prop = new Properties();

		//to generate path
		String path = System.getProperty("user.dir");

		//to access properties file
		FileInputStream fis = new FileInputStream(path + "\\src\\test\\java\\resource\\data.properties");

		prop.load(fis);

		//getting browser name
		String browserName = prop.getProperty("browser");

		System.out.println(browserName);

		//for chrome browser
		
		if (browserName.contains("chrome")) {

			System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\java\\resource\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			if (browserName.contains("headless")) {

				options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
			
			//for Firefox browser
			
		} else if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", path + "\\src\\test\\java\\resource\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		//implicit wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//pageload time
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		//maximize the window
		driver.manage().window().maximize();
		return driver;

	}

}
