package StepDefinition;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepClass {
	WebDriver driver;
	@Given("^Open paychex application$")
	public void open_paychex_application() throws Throwable {
	 System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe") ;
	 
	 ChromeOptions run = new ChromeOptions();
	 run.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver();
	 driver.get("https://www.paychex.com/login");
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.manage().window().maximize();
	 
	 
	 
	}

	@Then("^click paychex flex login$")
	public void click_paychex_flex_login() throws Throwable {
  /* WebElement h = driver.findElement(By.xpath("//a[text()='Paychex Flex login']"));
   h.click();
   
  Set<String> allwindow = driver.getWindowHandles();
   
   Iterator<String> ite = allwindow.iterator();
 String parentwindow =  ite.next();
 String childwindow =  ite.next();
 
 driver.switchTo().window(childwindow);
 System.out.println("I am in child window");
 Thread.sleep(5000);
 
 driver.switchTo().window(parentwindow);
 System.out.println("I am in parent window");
 Thread.sleep(5000);
 driver.quit();*/
 
   /*  WebElement pay = driver.findElement(By.linkText("Paychex Oasis login"));
		pay.click();
		
	Set<String> allwindow = driver.getWindowHandles();
		
	Iterator <String> ite = allwindow.iterator();
		
   String parent	= ite.next();
   String child  = ite.next();
   
   driver.switchTo().window(child);
   Thread.sleep(5000);
   driver.switchTo().window(parent);
   Thread.sleep(5000);
   driver.quit();   */
   
   
		
		
 /*((JavascriptExecutor)driver).executeScript("scroll(0,600)");
		Thread.sleep(5000);
 WebElement go = driver.findElement(By.linkText("eServices"));
 go.click();
		
	Set<String> window1 = driver.getWindowHandles();
    Iterator <String> it	= window1.iterator();
    String parent = it.next();
    String child = it.next();
    
    driver.switchTo().window(child);
    Thread.sleep(5000);
    
    driver.switchTo().window(parent);
    Thread.sleep(5000);
    driver.quit();*/
    
    
   /* ((JavascriptExecutor)driver).executeScript("scroll(0,600)");
    Thread.sleep(3000);
    
    WebElement er = driver.findElement(By.linkText("Paychex Go"));
    er.click();
   Set<String> mm  = driver.getWindowHandles();
   Iterator<String> nn =  mm.iterator();
   String parent = nn.next();
   String child = nn.next();
 
  driver.switchTo().window(child);
  Thread.sleep(5000);
  driver.switchTo().window(parent);
  Thread.sleep(5000);
  driver.quit(); */
 
 
		
		
		((JavascriptExecutor)driver).executeScript("scroll(0,600)");
		
		Thread.sleep(3000);
		
		WebElement luck = driver.findElement(By.linkText("stratustime"));
		luck.click();
		
	Set<String>	mm = driver.getWindowHandles();
   Iterator<String> nn =	mm.iterator();
   String parent =  nn.next();
   String child = nn.next();
   
   driver.switchTo().window(child);
   Thread.sleep(5000);
   
   driver.switchTo().window(parent);
   Thread.sleep(5000);
   driver.quit();
	}


}
