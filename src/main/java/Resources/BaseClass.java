package Resources;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;
	public WebDriver browserLaunch() throws IOException {
		
		//this will help us to read data.properties file
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
		//C:\\Users\\User\\eclipse-workspace\\ProjectTestNgFramework\\src\\main\\java\\Resources\\data.properties
		//this will access the data.properties
		 prop=new Properties();
		
		prop.load(fis);
		
		String browserName= prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome") ){
			
	    WebDriverManager.chromedriver().setup();//this wiil run with latest chrom browser in your syatem
	    //dependency is mandatory 
	  //  WebDriverManager.chromedriver().version("102.1.0").setup()//this will run with
			 driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			//firefox code
		}else if(browserName.equalsIgnoreCase("Edge")) {
			//edge code
		}else {
			System.out.println("please select valid browser");
		
		}
		return driver;
	}
	@BeforeMethod
	public void LaunchBrowser() throws IOException {
		browserLaunch();
		driver.get(prop.getProperty("url"));
	}
	@AfterMethod
	public void tearDown() throws IOException {
		driver.quit();
	}
}
