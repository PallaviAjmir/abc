package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.Loginpage;

public class LoginTest {
WebDriver driver;
	@BeforeMethod
	public void callBrowser() {
		driver =Browser.OpenBrowser("https://staging.fytrack.com/#/login");
	}
	
	@Test
	public void LoginWithvalidcredential() {
		Loginpage login = new Loginpage(driver);
		login.clickondrop();
		login.clickonadmin();
		login.senduser();
		login.sendonpass();
		login.clickonlogin();
	}
	@Test
	Homepage home = new Homepage(driver);
	home.
	
}
