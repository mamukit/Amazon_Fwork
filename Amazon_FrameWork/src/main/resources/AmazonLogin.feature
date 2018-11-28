@smoke @TS_2011
Feature: Amazon Login function validation 

Description: User able to login into the application with valid username and password

Scenario Outline: Successful Login with Valid Credentials 

	Given User able to open any browser 
	And  Put URL and go to login page 
	When User able to click my account 
	And User able to use valid user name "<userName>" 
	And User able to put valid password "<password>" 
	And User able to click submit button 
	Then User able to validate Login status 
	And close the browser 
	
	Examples:
		|userName				|password	|
		|dutta1deb@gmail.com	|amazon2018	|
		|dutta1deb@gmail.com	|amazon		|	
		|dutta1deb@gmail.com	|2011amazon	|