package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//In Scenario outline we can do the data driven testing. we can test the script with set of different data.

public class LoginUsingScenarioOutline {
	
	@Given("User is in application landing page")
	public void user_is_in_application_landing_page() {
	    System.out.println("User is in landing page");
	}

	@When("User clicked on the sign in button")
	public void user_clicked_on_the_sign_in_button() {
	    System.out.println("User clicked on the sigin button");
	}

	@Then("User is Displayed login screen")
	public void user_is_displayed_login_screen() {
	    System.out.println("User is displayed login screen");
	}

	@When("User enters the {string} in the username field")
	public void user_enters_the_in_the_username_field(String string) {
	    
	}

	@When("User enters the {string} in the password field")
	public void user_enters_the_in_the_password_field(String string) {
	    
	}

	@When("user clicks on the SignIn button")
	public void user_clicks_on_the_sign_in_button() {
	    
	}

	@Then("User gets the error message")
	public void user_gets_the_error_message() {
	    
	}


}
