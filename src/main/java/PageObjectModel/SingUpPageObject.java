package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingUpPageObject {
	//this driver dont have scope
	public WebDriver driver;
	//driver.findElement(By.xpath("")).sendKeys();
//we have achieved encapsulation here
	private By Firstname=By.xpath("//input[@name='UserFirstName']");
	private By Lastname=By.xpath("//input[@name='UserLastName']");
	private By WorkEmail=By.xpath("//input[@name='UserEmail']");
	private By Jobtitle=By.xpath("//select[@name='UserTitle']");
	private By Employees=By.xpath("select[@name='CompanyEmployees']");
	private By Phone=By.xpath("//input[@name='UserPhone']");
	private By CompanyName=By.xpath("//input[@name='CompanyName']");

	public SingUpPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement EnterFirstName() {
		return driver.findElement(Firstname);
	}
	public WebElement EnterLastName() {
		return driver.findElement(Lastname);
		
	}
	public WebElement EnterWorkEmail() {
		return driver.findElement(WorkEmail);
		
	}
	public WebElement SelectJobTitle() {
		return driver.findElement(Jobtitle);
	
}
	public WebElement EnterCompanyEmployees() {
		return driver.findElement(CompanyName);
		
	}
public WebElement EnterPhone() {
	return driver.findElement(Phone);
	
}
	public WebElement SelectEmployees() {
		return driver.findElement(Employees);
		}
	
}
