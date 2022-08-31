package TestCasses;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SingUpPageObject;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;
@Test

public class VerifySignUpTestCase extends BaseClass {
	@Test
	public void signUp() throws IOException, InterruptedException {
		
		 LoginPageObject Lpo=new LoginPageObject(driver);
		 Lpo.ClickOnTryForFree().click();
		 Thread.sleep(5000);
		 //emplict wait lgana h
		

				 String actualTitle=driver.getTitle();
				 String expectedTitle=TestCaseData.expectedTitle;
				 CommonUtilities.handleAssertions(actualTitle,expectedTitle);
		 
		 SingUpPageObject spo=new SingUpPageObject(driver);
		 spo.EnterFirstName().sendKeys(TestCaseData.firstName);
		// spo.EnterLastName().sendKeys(TestCaseData.lastname);
		// spo.EnterWorkEmail().sendKeys(TestCaseData.workEmail);
		 CommonUtilities.dropdwonHandle(spo.SelectJobTitle(),2);
		//spo.EnterCompanyEmployees().sendKeys(TestCaseData.CompanyEmployees);

		 CommonUtilities.dropdwonHandle(spo.SelectEmployees(),1);
		// spo.EnterPhone().sendKeys("9406785130");
		 
		
		 
		
		
		
	}

}
