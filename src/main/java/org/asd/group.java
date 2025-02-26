package org.asd;

import org.testng.annotations.Test;

public class group {
  
 @Test (groups = {"login", "sanity"})

 public void f() 
  
  {
	  System.out.println("Valid Login Test"); 
	  
  }
 
 @Test(groups = {"login", "regression"})
 public void testInvalidLogin() {
    
	 System.out.println("Invalid Login Test");
 }
 
 @Test(groups = {"cart", "sanity"})
 public void testAddToCart() {
     System.out.println("Add to Cart Test");
 }

 @Test(groups = {"cart", "smoke"})
 public void testRemoveFromCart() {
     System.out.println("Remove from Cart Test");
 }

 @Test(groups = {"checkout", "regression"})
 public void testCheckoutProcess() {
     System.out.println("Checkout Process Test");
 }


 
}
