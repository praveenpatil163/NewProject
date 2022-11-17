Feature: Registration 

Scenario: Registration using title name 
Given User should be in the registration page
When User enter the details with the following coloumn name
   |firstName|lastName|mailID                   |state     |Country|
   |Praveen  |Patil   |praveenpatil163@gmail.com|Karnataka |India  |
   |Vinayak  |P       |vpatil@gmail.com         |Karnataka |India  |
   |Gouri    |K       |Gouripatil@gmail.com     |Karnataka |India  |
   |Vishal   |Pa      |Vishalakshi@gmail.com    |Karnataka |India  |
   
Then User should register successfully
   
 