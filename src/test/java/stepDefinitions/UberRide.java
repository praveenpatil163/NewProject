package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberRide {
	
	@Given("User wants to select a car type {string} from uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User Selected the car :"+ carType);
	    
	}

	@When("User selects the car {string} and pickup point {string} and drop location {string}")
	public void user_selects_the_car_and_pickup_point_and_drop_location(String carType, String Bangalore, String Pune) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User selected the car"+ carType +" and pickup point :"+ Bangalore + "and drop point is :"+ Pune);
	    
	}

	@Then("driver starts the journey")
	public void driver_starts_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Driver started the journey");
	    
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Ended the Journey");
	    
	}

	@Then("user Pays {int} dollar")
	public void user_pays_dollar(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User paid the amount of :"+ 1000 +"dollar");
	}


}
