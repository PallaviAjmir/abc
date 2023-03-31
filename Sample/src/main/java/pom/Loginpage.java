package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
@FindBy (xpath = "//div[@class=\"mat-select-arrow-wrapper ng-tns-c203-5\"]") private WebElement drop;	
@FindBy(xpath = "(//span[@class=\"mat-option-text\\\"])[1]")private WebElement admin;
@FindBy (xpath = "(//input[@name=\"username\\\"])[2]")private WebElement username;
@FindBy (xpath = "(//input[@name=\"password\\\"])[2]")private WebElement pass;
@FindBy (xpath ="(//button[@type=\"submit\\\"])[2]")private WebElement login;

public Loginpage(WebDriver driver) {
	PageFactory.initElements(driver ,this);
	
}

public void clickondrop() {
	drop.click();
}
public void clickonadmin() {
	admin.click();
}
public void senduser() {
	username.sendKeys("info@4ibiz.in");
}
public void sendonpass() {
	pass.sendKeys("Newpass@21");;
}

public void clickonlogin() {
	login.click();
}
}
