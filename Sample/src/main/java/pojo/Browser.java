package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver OpenBrowser (String url) {
		System.setProperty("Webdriver.chromedriver","C:\\Users\\fouri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//driver.get("https://staging.fytrack.com/#/login");
		 return driver;
			}
}
