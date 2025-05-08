package WebPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
    static WebDriver driver;
    public static void main(String[] args)  throws InterruptedException, AWTException {
		
	WebDriverManager.chromedriver().setup();
	
	driver =  new ChromeDriver();
	
	driver.get("https://www.selenium.dev/selenium/web/web-form.html");
	
	System.out.println("Application is launched successfully");
	
	driver.getTitle();
	
	System.out.println("Please enter the webpage title:" + driver.getTitle());
	
	driver.manage().window().maximize();
	
	driver.findElement(By.className("form-control")).sendKeys("Haripriya");
	
	//driver.findElement(By.id("my-text-id")).sendKeys("welcome");
	
	driver.findElement(By.name("my-password")).sendKeys("12345");
	
	driver.findElement(By.name("my-textarea")).sendKeys("welcome to automation class");
	
	if(driver.findElement(By.name("my-text")).isEnabled()) {
		
		System.out.println("Username Text box is enabled");
		
	}else {
		
		System.out.println("Username Text box is not enabled");
	}
	
	
   if(driver.findElement(By.name("my-password")).isEnabled()) {
		
		System.out.println("Password Text box is enabled");
		
	}else {
		
		System.out.println("Password Text box is not enabled");
	}
	
	
   if(driver.findElement(By.name("my-textarea")).isEnabled()) {
		
		System.out.println("Textarea Text box is enabled");
		
	}else {
		
		System.out.println("Textarea Text box is not enabled");
	}
   
	
   if(driver.findElement(By.name("my-disabled")).isEnabled()) {
		
		System.out.println("Disabled Text box is enabled");
		
	}else {
		
		System.out.println("Disabled Text box is not enabled");
	}
   
   Select dropdown = new Select(driver.findElement(By.name("my-select")));
   dropdown.selectByIndex(1);
	
	
	//select the auto combo box or list box
	
	driver.findElement(By.name("my-datalist")).sendKeys("San Francisco");
	
	//check box

	driver.findElement(By.id("my-check-2")).click();
   
	//radio button
	
	driver.findElement(By.id("my-radio-2")).click();
	
	//file upload directly from download path
	
    driver.findElement(By.xpath("//input[@name=\"my-file\"]"));
    
    WebElement element = driver.findElement(By.xpath("//input[@name=\"my-file\"]"));
    
    element.sendKeys("C:\\Users\\Admin\\Downloads\\download1.jpg");
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
    System.out.println("Form submitted successfully");
    
	Thread.sleep(5000);
	
	driver.quit();
		
	}

}