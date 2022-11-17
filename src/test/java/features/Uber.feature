@All
Feature: Uber Ride

@Smoke
Scenario: Booking Uber Ride seadan
Given User wants to select a car type "seadan" from uber app
When User selects the car "seadan" and pickup point "Bangalore" and drop location "Pune"
Then driver starts the journey 
And Driver ends the journey
Then user Pays 1000 dollar 


@Regression
Scenario: Booking Uber Ride SUV
Given User wants to select a car type "SUV" from uber app
When User selects the car "SUV" and pickup point "Bangalore" and drop location "Pune"
Then driver starts the journey 
And Driver ends the journey
Then user Pays 1000 dollar 


@Prod
Scenario: Booking Uber Ride mini SUV
Given User wants to select a car type "mini SUV" from uber app
When User selects the car "mini SUV" and pickup point "Bangalore" and drop location "Pune"
Then driver starts the journey 
And Driver ends the journey
Then user Pays 1000 dollar 

