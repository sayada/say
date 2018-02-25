Feature: logng funtion validation
Scenario: Successful login with valid Credentials
	Given user able to open the browser
	And go to UPS home page
	When user navigate to login button link
	And user able to put valid user name- Sarower2017
	And user able to put valid passwords- Ttch123$
	Then Login Successful
	