package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script1 {
	public static void testcase1(WebDriver driver) throws InterruptedException {
		driver.manage().window().maximize();
        driver.get("https://www.savaari.com/");
        //testcase:TC_OneWay_001
        driver.findElement(By.id("fromCityList")).click();
        driver.findElement(By.id("fromCityList")).sendKeys("Bengaluru");
        Thread.sleep(1000);
        driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.book-button.btn")).click();
        System.out.println("testcase 1 passed");
        
		
	}
	public static void testcase2(WebDriver driver) throws InterruptedException {
		driver.manage().window().maximize();
        driver.get("https://www.savaari.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Start typing city - e.g. Mysore']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Start typing city - e.g. Mysore']")).sendKeys("Mysore");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Start typing city - e.g. Mysore']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.book-button.btn")).click();
        System.out.println("testcase 2 passed");
		
	}
	public static void testcase3(WebDriver driver) throws InterruptedException {
		driver.manage().window().maximize();
        driver.get("https://www.savaari.com/");
        
      //from location
        driver.findElement(By.id("fromCityList")).click();
        driver.findElement(By.id("fromCityList")).sendKeys("Bengaluru");
        Thread.sleep(1000);
        driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        //To Location
        driver.findElement(By.xpath("//input[@placeholder='Start typing city - e.g. Mysore']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Start typing city - e.g. Mysore']")).sendKeys("Mysore");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Start typing city - e.g. Mysore']")).sendKeys(Keys.ENTER);

        //pick up date
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='dd-mm-yyyy']")).click();
        Thread.sleep(3000);
        try{
        	driver.findElement(By.xpath("//td[@class='ng-tns-c75-1 p-datepicker-today ng-star-inserted']")).click();
            
         }
         catch(Exception e){
            
         }     
        //pick up at time
        driver.findElement(By.id("pickUpTime")).click();
        WebElement pick=driver.findElement(By.id("pickUpTime"));
        Select objselect=new Select(pick);
        objselect.selectByIndex(7);
         //select button
        driver.findElement(By.cssSelector("button.book-button.btn")).click();
        System.out.println("testcase 3 passed");
		
	}

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1077249\\Documents\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        testcase1(driver);
        testcase2(driver);
        testcase3(driver);       
	}
}
