package appHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
	private ConfigReader configReader;
	private DriverFactory driverFactory;
	private Properties prop;
	private String browserName;
	private WebDriver driver;

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_Prop();
	}

	@Before(order = 1)
	public void launch_browser() {
		driverFactory = new DriverFactory();
		browserName = prop.getProperty("browser");
		System.out.println("the browser name is " + browserName);
		driver = driverFactory.init_driver(browserName);

	}
	
	@After(order=0)
	public void tear_down() {
		driver.quit();
	}
}
