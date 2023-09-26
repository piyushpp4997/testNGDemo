package Demo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parameterizationDemo {
	
	 @Test
	 @Parameters({"url","username","password"})
	 public void method1(String url,String Uname, String password) {
	  System.out.println(url);
	  System.out.println(Uname);
	  System.out.println(password);
	 }

}
