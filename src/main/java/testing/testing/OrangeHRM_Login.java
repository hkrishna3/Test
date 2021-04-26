package testing.testing;		

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_Login{

	@Test
	public void Login_Successful() throws InterruptedException {
 //Launch the Browser and type the URL
        
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
        //WebDriverManager.edgedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        //Type the URL
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //Enter the User Name and Enter the Password and Click on Login Button
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        String ActElement = driver.findElement(By.linkText("Dashboard")).getText();
        String ExpElement="Dashboard";
        Assert.assertEquals(ActElement, ExpElement);
        System.out.println(ActElement);
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout")).click();
        driver.findElement(By.id("logInPanelHeading")).isDisplayed();
        /*String ExpElement1="LOGIN Panel";
        Assert.assertEquals(ActElement1, ExpElement1);
        System.out.println(ActElement1);*/
        //driver.close();//Close will close only current chrome browser
        driver.quit();//Quit all browser opened by selenium
}
}
