Feature: Login with valid credentials 
#hash is used to comment out in feature file	
#to justify all lines in feature file we use Ctrl +shift+f(pretty format)

@sanity   #in test ng we have grouping in cucumber we call it as tagging	
Scenario: Successful login with valid credentials 
	Given User launch browser 
	And   opens URL("http://localhost/opencart/upload/") 
	When  User navigate to MyAccount menu 
	And   click on Login 
	And enter Emails as:"arvindpractice@gmail.com" and Password as "test@123" 
	And click on Login button 
	Then user navigates to myAccount Page 