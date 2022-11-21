package Implementations;

public class Search {

	public String DisplyProduct(Product product) {
		// TODO Auto-generated constructor stub
		if(product.getProductList().contains(product.getProductName())) {
			return product.getProductName();
			
		}
		return null;
	}

}
