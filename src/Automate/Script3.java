package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script3 {
	public static void testcase6(WebDriver driver) throws InterruptedException {
		 driver.manage().window().maximize();
		 driver.get("https://www.savaari.com/");
		 driver.findElement(By.partialLinkText("AIRPORT")).click();
		//from location
         driver.findElement(By.id("fromCityList")).click();
         driver.findElement(By.id("fromCityList")).sendKeys("Bengaluru");
         Thread.sleep(1000);
        driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.book-button.btn")).click(); 
        System.out.println("testcase6 completed");
        Thread.sleep(2000);
	}
	
	public static void testcase7(WebDriver driver) throws InterruptedException {
		driver.manage().window().maximize();
		 driver.get("https://www.savaari.com/");
		 driver.findElement(By.partialLinkText("AIRPORT")).click();
		 driver.findElement(By.id("fromCityList")).click();
         driver.findElement(By.id("fromCityList")).sendKeys("Bengaluru");
         Thread.sleep(1000);
        driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        Select se=new Select(driver.findElement(By.tagName("select")));
        se.selectByIndex(2);
        driver.findElement(By.cssSelector("button.book-button.btn")).click();
        System.out.println("testcase7 completed");
        Thread.sleep(2000);
		
	}
	public static void testcase8(WebDriver driver) throws InterruptedException {
		driver.manage().window().maximize();
		 driver.get("https://www.savaari.com/");
		 driver.findElement(By.partialLinkText("AIRPORT")).click();
		 driver.findElement(By.id("fromCityList")).click();
         driver.findElement(By.id("fromCityList")).sendKeys("Bengaluru");
         Thread.sleep(1000);
        driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        Select se=new Select(driver.findElement(By.tagName("select")));
        se.selectByIndex(1);
        Thread.sleep(1000);
        driver.findElement(By.id("search_places")).click();
        driver.findElement(By.id("search_places")).sendKeys("Majestic");
        Thread.sleep(3000);
        driver.findElement(By.id("search_places")).sendKeys(Keys.ENTER);
        //pickup date
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='dd-mm-yyyy']")).click();
        Thread.sleep(3000);
        try{
        	driver.findElement(By.xpath("//td[@class='ng-tns-c75-3 p-datepicker-today ng-star-inserted']")).click();
            
         }
         catch(Exception e){
            
         }  
        //pick time
        Select s=new Select(driver.findElement(By.tagName("select")));
        s.selectByIndex(2);
        //select button
        driver.findElement(By.cssSelector("button.book-button.btn")).click();
        Thread.sleep(2000);
        System.out.println("testcase8 completed");
        
        
		
	}
	public static void testcase9(WebDriver driver) throws InterruptedException {
		driver.manage().window().maximize();
		 driver.get("https://www.savaari.com/");
		 driver.findElement(By.partialLinkText("AIRPORT")).click();
		 driver.findElement(By.id("fromCityList")).click();
        driver.findElement(By.id("fromCityList")).sendKeys("Bengaluru");
        Thread.sleep(1000);
       driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
       Thread.sleep(2000);
       Select se=new Select(driver.findElement(By.tagName("select")));
       se.selectByIndex(2);driver.findElement(By.id("search_places")).click();
       driver.findElement(By.id("search_places")).sendKeys("Majestic");
       Thread.sleep(3000);
       driver.findElement(By.id("search_places")).sendKeys(Keys.ENTER);
       //pickup date
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@placeholder='dd-mm-yyyy']")).click();
       Thread.sleep(3000);
       try{
       	driver.findElement(By.xpath("//td[@class='ng-tns-c75-3 p-datepicker-today ng-star-inserted']")).click();
           
        }
        catch(Exception e){
           
        }  
       //pick time
       Select s=new Select(driver.findElement(By.tagName("select")));
       s.selectByIndex(2);
       //select button
       driver.findElement(By.cssSelector("button.book-button.btn")).click();
       System.out.println("testcase9 completed");
       Thread.sleep(3000);
		
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1077249\\Documents\\chromedriver.exe");
        
	    WebDriver driver = new ChromeDriver();
	    testcase6(driver);
        testcase7(driver);
        testcase8(driver);
        testcase9(driver);

	}

}
