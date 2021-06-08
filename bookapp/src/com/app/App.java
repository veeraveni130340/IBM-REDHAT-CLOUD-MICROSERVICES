package com.app;
import com.demo.*;

public class App{

	public static void main(String[] args){                  
		// Main Method - Only this method gets executed
		//Create a Book object
		Book book1 = new Book("Gary", 8.99, 19.99, "How to get rich", 100);  
		//Fetch Book Class specific fields from this book
		System.out.println(" Book Details 1a) Author: " + book1.getAuthorname() + " | cost price: "+ book1.getCostprice() +" | sale price:"
				+ book1.getSaleprice() +" | pages: "+ book1.getPages()  +" | title: " + book1.getTitle()+"\n");
		//Get Profit and Tax
		System.out.println(" 1a) Author " + book1.getAuthorname() + " nets a per-book profit of $" + book1.netProfit() + " and a tax of $" + book1.getTax());
		//Create an e-book object
		Ebook book2 = new Ebook("Seth Devilin", 10.0, 23.0, "Bad habits that lead to success", 200, "Amazon", 80.0);
		//Fetch Book Class specific fields from this ebook
		System.out.println(" EBook Details 2a) Author: " + book2.getAuthorname() + " | cost price: "+ book2.getCostprice() +" | sale price:"
				+ book2.getSaleprice() +" | pages: "+ book2.getPages() +" | title: " + book2.getTitle()+"\n");
		//Get Profit and Tax
		System.out.println(" 2b) Author " + book2.getAuthorname() + " nets a per-book profit of $" + book2.netProfit() + " and a tax of $" + book2.getTax());
		//Get per page size
		System.out.println(" 2c) Book: "+ book2.printTitle() + " has a per-page size of " + book2.pageSize() +" MB\n");
	}
}