package SelTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class SelTest02 {

  @BeforeClass
  public void beforeClass() {
  }
  
  @Test
  public void f() {
	  String a = this.getClass().getName();
	  String[] b = a.split("\\.");
	  System.out.println(b[0]);
	  System.out.println(b[1]);
	  System.out.println("test");
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
