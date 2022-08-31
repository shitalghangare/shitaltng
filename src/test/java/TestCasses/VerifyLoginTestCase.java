package TestCasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;


public class VerifyLoginTestCase extends BaseClass{
	//we have acheived inheritance here
	@Test
	public void login() throws IOException {
		
		
		
		LoginPageObject Lpo=new LoginPageObject(driver);
		Lpo.EnterUserName().sendKeys(TestCaseData.username);
		Lpo.EnterPassword().sendKeys(TestCaseData.password);
		Lpo.ClickLogin().click();
		
		
		String expectedString="Please check your username and password. If you still can't log in, contact your Salesforce administrator";
		
		String actualString=driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		
		CommonUtilities. handleAssertions(actualString,expectedString);
	}

}
