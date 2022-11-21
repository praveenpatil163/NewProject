package Implementations;

public class Search {

	public String DisplyProduct(Product product) {
		// TODO Auto-generated constructor stub
		if(product.getProductList().contains(product.getProductName())) {
			return product.getProductName();
			
		}
		return null;
	}
	
	public void Register1() {
		System.out.println("Register 1");
	}
	
    public void Register2() {
		System.out.println("Register 2");
	}
    
    public void Register3() {
    	System.out.println("Register 3");
    }

}
