@sprint 
Feature: Applicaltion Validation 

Scenario: Verify loading of documentation page 

	Given URL is lunched 
	When compare the title actual with expected 
	Then validations are "true" 
	
	
	
Scenario: Verify status code of the documentation page 

	Given Tester is on documentation page 
	When Verify status code of documentation page having URL "https://developer.here.com/documentation" 
	Then validation are as per expected "true" 
	
	
Scenario: Verify all internal links in documentation page 

	Given documention page containing links 
	When click on each links it navigate appropriate page and check status code 
	Then validation as per expected "true" 
	And close the driver instance 
	
	
	
	
	
	
	
	
	
	
	
	
