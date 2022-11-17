package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {
	
	@Given("user should be in the registation page")
	public void user_should_be_in_the_registation_page() {
	    System.out.println("user should be in the registration page");
	}

	@When("User enters the following user details")
	public void user_enters_the_following_user_details(DataTable dataTable) {
		List<List<String>> userList=dataTable.asLists(String.class);
		
		for(List<String> e:userList) {
			
			System.out.println(e);
		}
	    
	}

	@Then("User registration should be successfully")
	public void user_registration_should_be_successfully() {
	   System.out.println("user should be registered successfully");
	}


}
