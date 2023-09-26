package Demo1;

import org.testng.annotations.Test;

public class dependsOnDemo {
	

	  @Test(dependsOnMethods={"EnterPRoductInSearchBox","ClickOnSearchBox"})
	  public void addTocart() {

	   System.out.println("addToCart"); 
	  }

	  @Test(priority =2)
	  public void EnterPRoductInSearchBox() {

	   System.out.println("Enterproduct");
	   
	  }
	  
	  @Test(priority =3)
	  public void ClickOnSearchBox() {

	   System.out.println("clicon seatrch");
	   
	  
	  }
	  
	  
	 

}
