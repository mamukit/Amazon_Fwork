@regression @TS_2013
Feature: Choose product and payment function validation

Description: User able to choose product and pay with valid payment option

Scenario: Successfully collect data and verify functionalities
	Given User Signin successfully with valid credential 
	Then Amazon homepage Validation and catch screenshot of the homepage
	Given User able to search for 'HP laptop'
	And sort the price of HP laptops from high to low
	Then User able to find out the total number of 'HP laptop' and 'HP laptop' names on the first page
	And find out the total page number
	When User sort the price from low to high
	Then User able to find the highest and lowest 'HP laptop' price on the first page
	When User able to select one 'HP laptop'
	Then User able to add the new item to cart 
	When User able to proceed to cart
	And User enters his email and password
	And click on the 'Deliver' button
	And click on the 'Continue' button
	When User enter invalid name on card as "Barak Obama" and card number as "9146784131121181" 
	And select expired month and year
	And User click on the 'Add your card' button
	Then User not able to proceed and payment fails
	And take screenshot of the failed payment
	And Shut the browser
