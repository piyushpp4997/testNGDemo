package Demo1;

import org.testng.annotations.Test;

public class priorityDemo {
	
	 @Test(priority = 2)
	 public void method1() {

	  System.out.println("method1");
	 }

	 @Test(priority = 1)
	 public void method2() {

	  System.out.println("method2");
	 }

	 @Test
	 public void method3() {

	  System.out.println("method3");
	 }

	 @Test(priority=-1)
	 public void method4() {

	  System.out.println("method4");
	 }

}
