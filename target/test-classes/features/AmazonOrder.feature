Feature: Amazon order Page

In Order to check my order details
As Registered user I want to specify the features of order details page.

Background:
Given a registered user exists
Given User in amazon login page
When user enters the username 
And User enters the password
And User clicks on the login button
Then Use navigate to order details page


Scenario: Check Previous order details

When User Click on the order link
Then User checks the previous order details page



Scenario: Check open order details

When User clicks on the open order details
Then User checks the open order details


Scenario: Check Cancelled order details

When User clicks on the cancelled order details
Then User check the cancelled orders details
