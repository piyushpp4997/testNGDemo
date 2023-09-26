package Demo2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test2 {
	
	@Test
	 public void method1() {
	  System.out.println("test2method1");
	 }
	 
	 @BeforeClass
	 public void method2() {
	  System.out.println("test2method2beforeclass");
	 }
	 
	 @AfterClass
	 public void method3() {
	  System.out.println("test2method3afterclass");
	 }
	 

}
