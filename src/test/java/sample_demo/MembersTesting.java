package YuvrajMembers;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class MembersTesting {
	ChromeOptions options = new ChromeOptions();
	WebDriver web;
	 @BeforeTest
	  public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		 
		 web = new ChromeDriver();
		  web.get("https://tms.pisystindia.com/admin/login");
		  
		  web.manage().window().maximize();
		  
		  
	  }
  @Test
  public void f() {
	  
	  String title = web.getTitle();
	  Assert.assertEquals(title,"Tool Management System");
  }
  @Test
  public void f1() throws InterruptedException {
	  
	  web.findElement(By.cssSelector("input[type='email']")).sendKeys("sales.infinitycorp@gmail.com");
	  
	  web.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
	  
	  web.findElement(By.cssSelector("button[class*='btn btn-outline-primary btn-flat m-b-30 m-t-30']")).click();
	  Thread.sleep(1000);
  }
  @Test
  public void f2() {
	  Actions a = new Actions(web);
	  	  Action hover=  a.moveToElement(web.findElement(By.cssSelector("a[class*='sidebar-sub-toggle'] i[class*='fa fa-users']"))).build();
	hover.perform();
	a.moveToElement(web.findElement(By.cssSelector("a[class*='sidebar-sub-toggle'] i[class*='fa fa-users']"))).click().perform();

     	Action hover1 = a.moveToElement(web.findElement(By.cssSelector("li a[href*='https://tms.pisystindia.com/admin/subadmin'] "))).build();
		hover1.perform();
//		a.moveToElement(web.findElement(By.cssSelector("ul a[xpath='1']"))).click().perform();
		
		

	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String ano = web.findElement(By.cssSelector("li a[href*='https://tms.pisystindia.com/admin/subadmin'] ")).getText();
	
	Assert.assertEquals(ano, "Sub Admin");
	
	 web.findElement(By.cssSelector("li a[href*='https://tms.pisystindia.com/admin/subadmin'] ")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  @Test
  public void f3() {
	  Actions a = new Actions(web);
	String TheText=web.findElement(By.xpath("//h4[contains(text(),'All Sub Admins')]")).getText();
		Assert.assertEquals(TheText,"All Sub Admins");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		web.navigate().back();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  @Test
  public void f4() {
	  Actions a = new Actions(web);
  	  Action hover=  a.moveToElement(web.findElement(By.cssSelector("a[class*='sidebar-sub-toggle'] i[class*='fa fa-users']"))).build();
hover.perform();
a.moveToElement(web.findElement(By.cssSelector("a[class*='sidebar-sub-toggle'] i[class*='fa fa-users']"))).click().perform();


Action hover1 = a.moveToElement(web.findElement(By.cssSelector("li a[href*='https://tms.pisystindia.com/admin/procurementmember'] "))).build();
hover1.perform();

web.findElement(By.cssSelector("li a[href='https://tms.pisystindia.com/admin/procurementmember']")).click();

web.navigate().back();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}




	
  }
  
  @Test
  public void f5() {
	  Actions a = new Actions(web);
  	  Action hover=  a.moveToElement(web.findElement(By.cssSelector("a[class*='sidebar-sub-toggle'] i[class*='fa fa-users']"))).build();
hover.perform();
a.moveToElement(web.findElement(By.cssSelector("a[class*='sidebar-sub-toggle'] i[class*='fa fa-users']"))).click().perform();


Action hover1 = a.moveToElement(web.findElement(By.cssSelector("li a[href='https://tms.pisystindia.com/admin/siteengineer']"))).build();
hover1.perform();


web.findElement(By.cssSelector("li a[href='https://tms.pisystindia.com/admin/siteengineer]")).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String Procurement = web.findElement(By.xpath("//h4[contains(text(),'Site Engineers')]")).getText();

Assert.assertEquals(Procurement, "Site Engineers");



try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


  }
  
  
  @Test
  public void f6() {
	  web.navigate().back();
	  
	  Actions a = new Actions(web);
  	  Action hover=  a.moveToElement(web.findElement(By.cssSelector("a[class*='sidebar-sub-toggle'] i[class*='fa fa-users']"))).build();
hover.perform();
a.moveToElement(web.findElement(By.cssSelector("a[class*='sidebar-sub-toggle'] i[class*='fa fa-users']"))).click().perform();


Action hover1 = a.moveToElement(web.findElement(By.cssSelector("li a[href*='https://tms.pisystindia.com/admin/admins/fetchMembertype']"))).build();
hover1.perform();


web.findElement(By.cssSelector("li a[href*='https://tms.pisystindia.com/admin/admins/fetchMembertype']")).click();


web.navigate().back();

try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


  }
 
 
 

}
