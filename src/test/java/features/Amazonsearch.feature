Feature: Amazon search feature

Scenario: Search product

Given I have search field on amazon 
When I search for the product with name "apple MACBook Pro" and price 1000
Then product with name "Apple MacBook Pro" should be displayed