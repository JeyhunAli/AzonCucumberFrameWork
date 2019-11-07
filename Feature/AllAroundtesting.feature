Feature: log in into aplication
@InvalidLogin
Scenario: To test log in functionality with invalid credentials

Given I am on main page 
When user enter invalid username 
And user enter invalid password
 