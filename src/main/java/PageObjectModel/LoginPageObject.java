package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	// thi driver dont have scope
public WebDriver driver;
	//driver.findElement(By.xpath("")).sendKeys();
//we have achieved encapsulation here
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By LoginButton=By.xpath("//input[@id='Login']");
	private By tryForFree=By.xpath("//a[@id='signup_link']");

	public LoginPageObject(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	public WebElement EnterUserName() {
	
		//driver.findElement(By.xpath)("//input[@id='username']");
		return driver.findElement(username);
		
	}
	public WebElement EnterPassword() {
		
		//driver.findElement(By.xpath)("//input[@id='username']");
		return driver.findElement(password);
		
	}
	public WebElement ClickLogin() {
		
		//driver.findElement(By.xpath)("//input[@id='username']");
		return driver.findElement(LoginButton);
		
	}
	public WebElement ClickOnTryForFree() {
		return driver.findElement(tryForFree);
	}
}
