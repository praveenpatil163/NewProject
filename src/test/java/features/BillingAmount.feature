Feature: Calculate Billing Amount


#if you want to declare an integer or double as string then we have to make a double qote to it.

Scenario Outline: Billing Amount
Given User is on billing page 
When User enters the billing amount "<billingAmount>"
When User enters the tax Amount "<taxAmount>" 
And User clicks on the calculate button
Then it gives the final Amount "<finalAmount>"


 Examples:
    |billingAmount|taxAmount|finalAmount|
    |1000         |10       |1010       |
    |500          |20       |520        |
    |100          |5.5      |105.5      |
    
