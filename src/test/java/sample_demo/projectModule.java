package sample_demo;  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
public class projectModule{
    
    public WebDriver driver;
    @Test
    void testlogin() {
        // Exercise
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
        driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
        driver.findElement(By.id("admin_password")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
        driver.quit();
    }
    
    
    @Test
    void ViewCompaniesAllocated() {
        // Exercise
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
        driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
        driver.findElement(By.id("admin_password")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul/li[7]/a")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[2]")).click();
        driver.quit();
    }
    
    @Test
    void addProject() {
        // Exercise
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
        driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
        driver.findElement(By.id("admin_password")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
        driver.get("https://tms.pisystindia.com/admin/project");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"project_name\"]")).sendKeys("TestingMaven1");
        driver.findElement(By.xpath("//*[@id=\"project_code\"]")).sendKeys("001");
        driver.findElement(By.xpath("//*[@id=\"project_description\"]")).sendKeys("No description");
        driver.findElement(By.xpath("//*[@id=\"start_date\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"start_date\"]")).sendKeys("08-01-2022");
        driver.findElement(By.xpath("//*[@id=\"end_date\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"end_date\"]")).sendKeys("09-02-2022");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[6]/button")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
    }
    
    @Test
    void UpdateProject() {
        // Exercise
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
        driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
        driver.findElement(By.id("admin_password")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
        driver.get("https://tms.pisystindia.com/admin/project");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[8]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"project_code\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"project_code\"]")).sendKeys("abcdef");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[6]/button")).click();
        driver.quit();
    }
    
    @Test
    void status() {
        // Exercise
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
        driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
        driver.findElement(By.id("admin_password")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
        driver.get("https://tms.pisystindia.com/admin/project");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[7]/div/label/span")).click();
        driver.quit();
    }
    
    //Previous Page
    @Test
    void entries() {
        // Exercise
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
        driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
        driver.findElement(By.id("admin_password")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
        driver.get("https://tms.pisystindia.com/admin/project");
        Select select = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div[1]/label/select")));        
        select.selectByIndex(2);
        driver.quit();
    }
    
 
    
    @Test
    void SearchBar() {
        // Exercise
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
        driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
        driver.findElement(By.id("admin_password")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
        driver.get("https://tms.pisystindia.com/admin/project");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div/label/input")).sendKeys("Test1234");
        driver.quit();
    }
    
    @Test
    void NextAndPrevious() {
        // Exercise
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
        driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
        driver.findElement(By.id("admin_password")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
        driver.get("https://tms.pisystindia.com/admin/project");  
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[3]/div[2]/div/ul/li[8]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"example_previous\"]")).click();
        driver.quit();
    }
    
    @Test
    void AllocateProject() {
        // Exercise
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
        driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
        driver.findElement(By.id("admin_password")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
        driver.get("https://tms.pisystindia.com/admin/project");  
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")).click();
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"project_id\"]")));        
        select.selectByIndex(2);
        driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"postme1\"]")).click();
        driver.quit();
    }
    
}
