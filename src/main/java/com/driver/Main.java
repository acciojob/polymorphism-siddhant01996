package com.driver;

public class Main {
 public static class Product{
   public int product(int x, int y) {
     return x*y;
   }
   public int product(int x, int y, int z){
     return x*y*z;
   }
    double product(double x, double y) {
      return x*y;
    } 
}
 public static void main (String[] args) {
		
	    	Product p= new Product();
        System.out.println(p.product(5,8));
        System.out.println(p.product(5,8,9));
        System.out.println(p.product(2.0,9.0));

	} 
}
