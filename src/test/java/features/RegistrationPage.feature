Feature: User registration 

Scenario: User registration with different data
Given user should be in the registation page
When User enters the following user details
   |Praveen| Gajendragad| praveenpatil163@gmail.com|Karnataka|
   |tom|Hubli|tom@gmail.com|GOA|
   |RAJ|RON|raj@gmail.com|Neregal|

Then User registration should be successfully


