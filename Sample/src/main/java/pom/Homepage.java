package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
@FindBy(xpath ="(//span[text()=\" PREVIOUS \"]") private WebElement previous;
@FindBy (xpath = "(//mat-card[@style=\"height: 40px;\"])[1]")private WebElement newenquiry;
@FindBy(xpath = "(//button[@type=\"button\"])[3]")private WebElement Addnew;
@FindBy(xpath = "//input[@name=\"searchBox\"]")private WebElement searchbox;
@FindBy(xpath ="//img[@type=\"submit\"]")private WebElement searclick;
@FindBy(xpath = "//span[text()=\"ADD MEMBER\"]" )private WebElement addmember ;
@FindBy(xpath = "//input[@name=\"fullname\"]")private WebElement name;
@FindBy(xpath = "//input[@name=\"emailId\"]")private WebElement email;
@FindBy(xpath = "//div[@class=\"mat-select-arrow-wrapper ng-tns-c203-202\"]")private WebElement drop;
@FindBy(xpath = "//span[text()=\" Aishwarya\")")private WebElement staff;
@FindBy(xpath ="//div[@class=\"mat-select-arrow-wrapper ng-tns-c203-206\"]")private WebElement dropdown;
@FindBy (xpath ="//span[text()=\"Female\"]")private WebElement gender;


public Homepage(WebDriver driver) {
	PageFactory.initElements(driver , this);
}
public void clickonpreviou() {
	previous.click();
}
public void clickonenquiry() {
	newenquiry.click();
}
public void clickonaddnew() {
	Addnew.click();
}
public void clickonsearchbox() {
	searchbox.sendKeys("0215478000");;
}
public void clickonsearch() {
	searclick.click();
}
public void clickonaddmember() {
	addmember.click();
}
public void clickonname() {
	name.sendKeys("Riya");;
}
public void clickonemail() {
	email.sendKeys("riya@gmail.com");
}
public void clickondrop() {
	drop.click();
}
public void clickonstaff() {
	staff.click();
}
public void clickondropdown() {
	dropdown.click();
}
public void clickongender() {
	gender.click();
}
}