package sample_demo;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class enquiryModuleTests {
	
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
	        Thread.sleep(6000); 
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
	    public void DownloadEnquiryShiftDetails() throws InterruptedException {
	    	
	    	Login();
	    	driver.findElement(By.linkText("Enquiry")).click();
	    	Thread.sleep(3000); 
	    	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul/li[6]/ul/li[2]/a")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div[2]/button[2]")).click();
	    	
	    	
	    }
	    
	    @Test
	    public void createEnquiry() throws InterruptedException {
	    	
	    	Login();
	    	driver.findElement(By.linkText("Enquiry")).click();
	    	Thread.sleep(3000); 
	    	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul/li[6]/ul/li[1]/a")).click();
	    	///html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a"));
	    	Thread.sleep(1000);
	    	//Create new Enquiry
	    	driver.findElement(By.linkText("Create new Enquiry")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.linkText("Add New Tool Enquiry")).click();
	    	Thread.sleep(3000);
	    	WebElement op_type = driver.findElement(By.id("select_operation_type"));
	    	Select op_select = new Select(op_type);
	    	op_select.selectByIndex(2);
	    	
	    	//select_tool_type
	    	WebElement tool_type = driver.findElement(By.id("select_tool_type"));
	    	Select tool_select = new Select(tool_type);
	    	tool_select.selectByIndex(2);
	    	
	    	//select_toolmake_name
	    	WebElement make_type = driver.findElement(By.id("select_toolmake_name"));
	    	Select make_select = new Select(make_type);
	    	make_select.selectByIndex(2);
	    	
	    	
	    	driver.findElement(By.name("addNewToolSubmit")).click();
	    	Thread.sleep(3000);
	    }
	    
	    @Test
	    public void changeEnquiryStatus() throws InterruptedException {
	    	Login();
	    	driver.findElement(By.linkText("Enquiry")).click();
	    	Thread.sleep(3000); 
	    	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul/li[6]/ul/li[3]/a")).click();
	    	///html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a
	    	Thread.sleep(3000);
	    	driver.findElement(By.linkText("View all order details")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[7]/div[2]/div/table/tbody/tr[3]/td[11]/a")).click();
	    	Thread.sleep(3000);
	    	WebElement statusselect = driver.findElement(By.id("taskstatus21"));
	    	Select dropdown = new Select(statusselect);
	    	dropdown.selectByValue("5");
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[6]/div/div/div[2]/div/button")).click();
	    	Thread.sleep(3000);	
	    	
	    	
	    	
	    }
	    
	    @Test
	    public void updateCPCThreshold() throws InterruptedException {
	    	
	    	Login();
	    	driver.findElement(By.linkText("Enquiry")).click();
	    	Thread.sleep(3000); 
	    	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul/li[6]/ul/li[4]/a")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[4]/button"));
	    	Thread.sleep(3000);
	    	driver.findElement(By.id("cpc_threshold1")).clear();
	    	driver.findElement(By.id("cpc_threshold1")).sendKeys("33");
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[4]/button"));
	    	Thread.sleep(3000);
	    	
	    }
	    
	    
	
	    
	   
}
