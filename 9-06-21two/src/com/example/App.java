package com.example;

import java.util.UUID;

public class App {

	public static void main(String[] args) {
	Product product=new Product();
	product.createProduct(UUID.randomUUID().toString(), "Cell Phone", 2000.0);
	System.out.println(Product.getNumberOfProduct());
	Product product1=new Product();
	product1.createProduct(UUID.randomUUID().toString(), "Laptop", 2000.0);
	System.out.println(Product.getNumberOfProduct());
	Product product2=new Product();
	product2.createProduct(UUID.randomUUID().toString(), "Mobile", 2000.0);
	Product product3=new Product();
	System.out.println(Product.getNumberOfProduct());
	product3.createProduct(UUID.randomUUID().toString(), "Phone", 2000.0);
	System.out.println(Product.getNumberOfProduct());
	
	System.out.println("Current price for Product : "+product.getPrice());
	System.out.println("Total price for product after discount is : "+product.getDiscount());

	System.out.println("Current price for Product1 : "+product1.getPrice());
	System.out.println("Total price for product1 after discount is : "+product1.getDiscount());

	System.out.println("Current price for Product2 : "+product2.getPrice());
	System.out.println("Total price for product2 after discount is : "+product2.getDiscount());

	System.out.println("Current price for Product3 : "+product3.getPrice());
	System.out.println("Total price for product3 after discount is : "+product3.getDiscount());	

	}

}