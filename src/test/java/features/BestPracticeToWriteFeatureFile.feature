Feature: Login Page.

Scenario: Amazon login page.

Given User is on amazon lading page
And sign in button is present in the page
When user clicks ont the sigin in button
Then user can able to see the login page
When user enters the username "praveenpatil163@gmail.com" in username field
And enters the password "praveen" in the password field
And user clicks on t he signIn button
Then user is in homePage
And title of the homePage is "Amazon"
But signIn button is not present