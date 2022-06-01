package sample_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class warehouse_inventory{
	
	public WebDriver driver;
 	//Login
    @Test
    void test0() {
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.quit();
    }
 	
 	//Download Excel file
    @Test
    void test1() {
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/inventory");	
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[2]")).click();
		driver.quit();
    }
    
    
  //Download PDF file
    @Test
    void test2() {
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/inventory");	
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[3]")).click();
		driver.quit();
    }
    
    //Search
    @Test
    void test3() {
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/inventory");	
		driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input")).sendKeys("scr");
		driver.quit();
    }
    
    //Next Page
    @Test
    void test4() {
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/inventory");	
		driver.findElement(By.xpath("//*[@id=\"example_next\"]")).submit();		
		driver.quit();
    }
    
    //Previous Page
    @Test
    void test5() {
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/inventory");	
		driver.findElement(By.xpath("//*[@id=\"example_previous\"]")).submit();	
		driver.quit();
    }
 
    
  //Update and add comment
    @Test
    void test6() {
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/inventory");	
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[5]/a")).click();
		driver.findElement(By.id("tool_quantity")).clear();	
		driver.findElement(By.id("tool_quantity")).sendKeys("5");
		driver.findElement(By.id("tool_comment")).sendKeys("Updates value");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[4]/button")).click();
		driver.quit();
    }
    
}
