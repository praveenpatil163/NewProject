Feature: Login


Scenario Outline: Login fail- possible combination
Given User is in application landing page
When User clicked on the sign in button
Then User is Displayed login screen
When User enters the "<userName>" in the username field
And User enters the "<password>" in the password field
And user clicks on the SignIn button
Then User gets the error message

    Examples:
    |userName    |password|
    |inCorUsename| AAA    |
    |Praveen     |PPPP    |
    |Patil       |PAPA    |   
    |Gajendragad |GGG     |
    |RONNN       |RRR     |
    
    


