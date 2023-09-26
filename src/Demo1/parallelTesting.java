package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelTesting {
	
	public WebDriver driver;
	 
	 @Test
	 public void method1() {
	  
	       System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

	  driver= new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	       
	   
	 }
	 

	 @Test
	 public void method2() {
	  
	        System.out.println("The thread ID for Chrome2 is "+ Thread.currentThread().getId());

	  driver= new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	       
	       
	 }

}
