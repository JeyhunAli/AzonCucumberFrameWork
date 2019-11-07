@Actual
Feature: login to Amazon

Scenario: Testing Amazon Webpage

Given When I am On Amazon Web page 
When user able to sign in
And user enter username 
And user click to continue button
And user enter password
And user click to sign in button
Then user able successfully log in 




