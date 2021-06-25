package com.mukscode.business;

import java.util.ArrayList;
import java.util.List;

import com.mukscode.model.Product;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl() {
		bookList.add("The Code Breaker");
		bookList.add("The Midnight Library");
		bookList.add("Dangerous");
		
		musicList.add("No Brainer");
		musicList.add("Umbrella");
		musicList.add("Perfect");
		
		movieList.add("Wrath of Man");
		movieList.add("Tokyo Drift");
		movieList.add("Khiladi");
		
	}
	
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");

		return categories;
	}
	
	public List<String> getProducts(String category){
		switch(category.toLowerCase()) {
		
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}

		return null;
	}
	
	public boolean addProduct(String category, String product) {

		switch(category.toLowerCase()) {

		case "books":
			bookList.add(product);
		case "music":
			musicList.add(product);
		case "movies":
			movieList.add(product);
		}

		return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java Brains","1234", 25.00));
		productList.add(new Product("Java 8","abc12", 15.50));
		
		return productList;
	}
	
}
