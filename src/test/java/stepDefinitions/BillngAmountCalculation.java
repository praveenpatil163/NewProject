package stepDefinitions;

import org.junit.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//Given is for Pre-condition.
//When is for action
//Then is for validation
//Here they have taken the numbers as string and after that they have converted it into the double. and that variable are pointed to the global variable which is declared in the class.
public class BillngAmountCalculation {
	
	
	double billingAmount;
	double taxAmount;
	double finalAmount;
	
	@Given("User is on billing page")
	public void user_is_on_billing_page() {
	    System.out.println("User is on billing page");
	}

	@When("User enters the billing amount {string}")
	public void user_enters_the_billing_amount(String billingAmount) {
	    this.billingAmount=Double.parseDouble(billingAmount);
	}

	@When("User enters the tax Amount {string}")
	public void user_enters_the_tax_amount(String taxAmount) {
	    this.taxAmount=Double.parseDouble(taxAmount);
	    
	}

	@When("User clicks on the calculate button")
	public void user_clicks_on_the_calculate_button() {
		
		System.out.println("Click on the calculate button");
	    
	}

	
	@Then("it gives the final Amount {int}")
	public void it_gives_the_final_amount(String expectedFinalAMount) {
	    this.finalAmount=this.billingAmount+this.taxAmount;
	    System.out.println("Expected final amount is :"+ expectedFinalAMount);
	    Assert.assertTrue(this.finalAmount==Double.parseDouble(expectedFinalAMount));
	}

	
}
