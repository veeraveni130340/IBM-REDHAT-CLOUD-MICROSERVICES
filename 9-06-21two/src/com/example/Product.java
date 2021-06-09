package com.example;

public class Product {
	
	private String productId;
	private String productName;
	private Double productPrice;
	private static Integer numberOfProduct;
	
	static
	{
		numberOfProduct=0;
	}
	
	public  void  createProduct(String id, String name, Double price) {
		numberOfProduct++;
		productId = id;
		productName = name;
		productPrice = price;
	}
	
	
	public static Integer getNumberOfProduct()
	{
		return numberOfProduct;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	public double getDiscount()
	{
		return this.productPrice-((this.productPrice*2)/100);
		
	}
	public Double getPrice() {
		return this.productPrice;
		
	}
	
	
}