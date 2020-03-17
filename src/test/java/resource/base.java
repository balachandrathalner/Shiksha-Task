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

		Properties prop = new Properties();

		String path = System.getProperty("user.dir");

		FileInputStream fis = new FileInputStream(path + "\\src\\test\\java\\resource\\data.properties");

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		System.out.println(browserName);

		if (browserName.contains("chrome")) {

			System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\java\\resource\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			if (browserName.contains("headless")) {

				options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
		} else if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", path + "\\src\\test\\java\\resource\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

}
