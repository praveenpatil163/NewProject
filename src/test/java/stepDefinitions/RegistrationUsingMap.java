package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationUsingMap {
	
	@Given("User should be in the registration page")
	public void user_should_be_in_the_registration_page() {
	    System.out.println("User should be in the registration page");
	}

	@When("User enter the details with the following coloumn name")
	public void user_enter_the_details_with_the_following_coloumn_name(DataTable dataTable) {
		
		List<Map<String,String>> userList=dataTable.asMaps(String.class, String.class);
		
//		System.out.println(userList);
//		
//		System.out.println("To get the firstName"+userList.get(0).get("firstname"));
		
		for(Map<String,String> e:userList) {
			System.out.println(e.get("firstName"));
			System.out.println(e.get("lastName"));
			System.out.println(e.get("mailID"));
//			System.out.println("state");
//			System.out.println("Country");
			
		}
	    
	}

	@Then("User should register successfully")
	public void user_should_register_successfully() {
	    System.out.println("User should be registered successfully");
	}


}
