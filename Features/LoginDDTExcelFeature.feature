Feature: Login Data Driven #below indexes represnt the complete row in excel

Scenario Outline: Login Data Driven 
	Given User launch browser 
	And   opens URL("http://localhost/opencart/upload/") 
	When  User navigate to MyAccount menu 
	And   click on Login 
	Then user navigates to MyAccount Page by passing Email and Password with excel row "<row_index>" 
	
	Examples: 
		|row_index| 
		|1|
		|2|
		|3|                
		
		
	