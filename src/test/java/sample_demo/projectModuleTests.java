package sample_demo;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class projectModuleTests {

	 WebDriver driver;
	 
	 	@BeforeClass
	    static void setupClass() {
	        WebDriverManager.firefoxdriver().setup();
	    }

	    @BeforeMethod
	    void setupTest() {
	        driver = new FirefoxDriver();
	    }

	    @AfterMethod
	    void teardown() {
	        driver.quit();
	    }

	    @Test(priority = -1 )
	    void loginTest() throws InterruptedException {
	        // Exercise
	        driver.get("https://tms.pisystindia.com/admin/");
	        Thread.sleep(3000); 
	        driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
	        driver.findElement(By.id("admin_password")).sendKeys("123456");
	        driver.findElement(By.className("btn")).click();
	        Thread.sleep(3000); 
	        String title = driver.getTitle();
	        System.out.println(title) ;

	        
	    }
	    
	    
	    public void Login() throws InterruptedException{
	    	
	    	driver.get("https://tms.pisystindia.com/admin/");
	        Thread.sleep(3000); 
	        driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
	        driver.findElement(By.id("admin_password")).sendKeys("123456");
	        driver.findElement(By.className("btn")).click();
	        Thread.sleep(3000); 
	    }
	    
	    @Test
	    void createProject() throws InterruptedException {
	    	
	    	Login();
	    	
	    	//driver.get("http://localhost:5000/");
	    	driver.findElement(By.linkText("Projects")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[1]")).click();
	    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	driver.findElement(By.id("project_name")).sendKeys("Zscaler-Demo-Project-SIT2");
	    	driver.findElement(By.id("project_code")).sendKeys("ZSCALER-SEL-02");
	    	driver.findElement(By.id("project_description")).sendKeys("This is an automated selenium test run - 2");
	    	
	    	
	    	
	    	JavascriptExecutor jsex = (JavascriptExecutor) driver;
	    	jsex.executeScript("document.getElementById('start_date').value = '2022-06-03';");
	    	
	    	jsex.executeScript("document.getElementById('end_date').value = '2022-06-10';");
	    	
	    	
	    	
	    	
	    
	    	Thread.sleep(6000);     	
	    	
	    	
	    	driver.findElement(By.cssSelector("button.btn")).click();
	    	
	    	
	    
	    	
	    }
	    
	    @Test
	    void downloadProjectList( ) throws InterruptedException {
	    	Login();
	    	driver.findElement(By.linkText("Projects")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div[2]/button[2]/span")).click();
	    	
	    	
	    }
}
