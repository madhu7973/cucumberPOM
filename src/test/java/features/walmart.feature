Feature: Walmart regression test 

Scenario: user login 
	Given user is on sign in page 
	Then user provides valid login and password and clicks on login button
	And validate the account page
	And close the browser