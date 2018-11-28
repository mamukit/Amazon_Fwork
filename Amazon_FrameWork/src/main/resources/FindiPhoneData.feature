@regression @TS_2012
Feature: Collection product data from the web application

Description: User able to search and find product data

Scenario: Successfully collect data and verify functionalities
	
	Given User able to Signin successfully with valid credential 
	Then Validate Amazon homepage and take screenshot of the homepage
	Given User able to search for 'iphone'
	And sort the price from high to low
	Then Find out the number of 'iphone' and 'iphone' names on the first page
	And Find out the total number of pages
	When User able to search for 'iphone x'
	And sort the price from low to high
	Then User able to find out the highest and lowest 'iphone x' prices on the first page
	When User able to click on one 'iphone'
	Then User able to add the item to cart
 