package Implementations;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private String productName;
	private int price;

	public Product(String productName, Integer price) {
		// TODO Auto-generated constructor stub
		productName=productName;
		price=price;
	}
	
	public String setProductName() {
		return productName;
		
	}
	
	public String setProductPrice() {
		return productName;
		
	}
	
	public String getProductName() {
		return productName;
		
	}
	
	public String getProductPrice() {
		return productName;
		
	}
	
	public List<String> getProductList(){
		List<String> productList=new ArrayList();
		productList.add("Apple MacBook Pro");
		productList.add("HP");
		productList.add("Lenovo");
		productList.add("Mi");
		
		return productList;
	}
	
	

}
