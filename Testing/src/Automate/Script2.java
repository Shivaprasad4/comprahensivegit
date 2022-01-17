package Automate;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Script2 {
	public static void testcase4(WebDriver driver) throws InterruptedException
	{
		driver.manage().window().maximize();
        driver.get("https://www.savaari.com/");
        driver.findElement(By.linkText("LOCAL")).click();
        driver.findElement(By.cssSelector("button.book-button.btn")).click();
        System.out.println("testcase4 completed");
        Thread.sleep(2000);
        
	}
	public static void testcase5(WebDriver driver) throws InterruptedException
	{
		driver.manage().window().maximize();
        driver.get("https://www.savaari.com/");
        driver.findElement(By.linkText("LOCAL")).click();
        driver.findElement(By.id("fromCityList")).click();
        driver.findElement(By.id("fromCityList")).sendKeys("Bengaluru");
        Thread.sleep(2000);
        driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        //pick up at
        driver.findElement(By.id("pickUpTime")).click();
        WebElement pick=driver.findElement(By.id("pickUpTime"));
        Select objselect=new Select(pick);
        objselect.selectByIndex(3);
        //select button
        driver.findElement(By.cssSelector("button.book-button.btn")).click();
        System.out.println("testcase5 completed");
        Thread.sleep(2000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1077249\\Documents\\chromedriver.exe");
	        
	    WebDriver driver = new ChromeDriver();
	    testcase4(driver);
	    testcase5(driver);

	}

}
