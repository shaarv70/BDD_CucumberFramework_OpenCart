Feature: Login Data Driven
	
Scenario Outline: Login Data Driven          #If we have less data for data driven then we can use this approach by Scenario Outline
										#Whenever we are using Scenario Outline we have to use Examples alongwith it
	Given User launch browser 
	And   opens URL("http://localhost/opencart/upload/") 
	When  User navigate to MyAccount menu 
	And   click on Login 
	And enter Emails as:"<email>" and Password as "<pass>" 
	And click on Login button 
	Then user navigates to myAccount Page 
	
	Examples:
	|email                		| pass    |
	|arvindtest@gmail.com 		|test@123 |
	|lakshmi@yahoo.com    		|Laxmi    |
	|arvindpractice@gmail.com 	|test@123 |
	
	