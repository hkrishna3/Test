package guru99.test;

import org.testng.Assert;		
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;

public class AppTest {
ChromeDriver driver;	
@Test				
public void testEasy() {
	driver.navigate().to("http://demo.guru99.com/test/guru99home/");
	String title = driver.getTitle();				 
	Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
}	
@BeforeTest
public void beforeTest() {	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}		
@AfterTest
public void afterTest() {
	driver.quit();			
}		
}	

