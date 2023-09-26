package Demo1;

import org.testng.annotations.Test;

public class differentAnnotations {
	

	 @Test(enabled=false)
	 public void method1() {
	  
	  System.out.println("hello");
	 }
	 
	 
	 

	 //Set timeout in testng
	 
	 @Test(timeOut=400)
	 public void test() {
	  
	  
	 }
	 
	 //Invocation count--
	 //If we want to run same test multiple times with same data
	 
	 @Test(invocationCount = 10)
	 public void test2() {
	  
	  System.out.println("hello");
	 }
	 
	 
	 

}
