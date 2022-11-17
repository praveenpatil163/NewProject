package stepDefinitions;

import Implementations.Product;
import Implementations.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {
	
	Product product;
	Search search;
	@Given("I have search field on amazon")
	public void i_have_search_field_on_amazon() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I am in the search page");
	}

	@When("I search for the product with name {string} and price {int}")
	public void i_search_for_the_product_with_name_and_price(String ProductName, Integer price) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Entering the product name :"+  ProductName + "Price :"+ price  );
		
		product=new Product(ProductName,price);
	    
	}

	@Then("product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String ProductName) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Product name is displayed :"+ ProductName);
	    search=new Search();
	    String name=search.DisplyProduct(product);
	    System.out.println("Searched Product name is :"+name);
	    Assert.assertEquals(product.getProductName(), name);
	    
	}

}
