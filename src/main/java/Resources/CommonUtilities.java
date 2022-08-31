package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	public static void dropdwonHandle(WebElement dropdwonXpath,int dropdwonValue) {
		 Select s=new Select(dropdwonXpath);
		 s.selectByIndex( dropdwonValue);
		 
		 
}
	public static void  handleAssertions(String actual,String expected) {
		
		
		
		
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(actual, expected);
		
		assertion.assertAll();  //this is mandotry line
	}
	
	
}
