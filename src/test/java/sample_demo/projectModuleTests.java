package sample_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
	        String title = driver.getCurrentUrl();
	        assert title == "https://tms.pisystindia.com/admin/project/dashboard" ;  

	        
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
	    	driver.findElement(By.id("project_name")).sendKeys("QA-Train-Demo-Project-SIT");
	    	driver.findElement(By.id("project_code")).sendKeys("QATrain03");
	    	driver.findElement(By.id("project_description")).sendKeys("This is an automated selenium test run - 3");
	    	
	    	
	    	
	    	JavascriptExecutor jsex = (JavascriptExecutor) driver;
	    	jsex.executeScript("document.getElementById('start_date').value = '2022-06-29';");	    	
	    	jsex.executeScript("document.getElementById('end_date').value = '2022-06-30';");  	
	    	
	    	
	    	
	    
	    	Thread.sleep(6000);   	   	
	    	
	    	driver.findElement(By.cssSelector("button.btn")).click();
	    	
	    	Thread.sleep(6000);	    	
	    	
	    	
	    	String url_header = driver.getCurrentUrl();  
	    	
	    	System.out.println(url_header);
	    	
	    	assert url_header == "https://tms.pisystindia.com/admin/project" ;  	
	    	
	    	 
	    	
	    }
	    
	    void createDuplicateProject() throws InterruptedException {
	    	
	    	Login();
	    	
	    	//driver.get("http://localhost:5000/");
	    	driver.findElement(By.linkText("Projects")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[1]")).click();
	    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	driver.findElement(By.id("project_name")).sendKeys("QA-Train-Demo-Project-SIT");
	    	driver.findElement(By.id("project_code")).sendKeys("QATrain01");
	    	driver.findElement(By.id("project_description")).sendKeys("This is an automated selenium test run - 3");
	    	
	    	
	    	
	    	JavascriptExecutor jsex = (JavascriptExecutor) driver;
	    	jsex.executeScript("document.getElementById('start_date').value = '2022-06-29';");	    	
	    	jsex.executeScript("document.getElementById('end_date').value = '2022-06-30';");  	
	    	
	    	
	    	
	    
	    	Thread.sleep(6000);   	   	
	    	
	    	driver.findElement(By.cssSelector("button.btn")).click();
	    	
	    	Thread.sleep(6000);	    	
	    	
	    	
	    	String url_header = driver.getCurrentUrl();  
	    	
	    	System.out.println(url_header);
	    	
	    	assert url_header == "https://tms.pisystindia.com/admin/project/add" ;  	
	    	
	    	 
	    	
	    }
	    
	    @Test
	    void downloadProjectList( ) throws InterruptedException {
	    	Login();
	    	driver.findElement(By.linkText("Projects")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div[2]/button[2]/span")).click();
	    	
	    	
	    }
}
