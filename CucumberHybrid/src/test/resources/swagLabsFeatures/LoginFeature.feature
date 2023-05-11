Feature: Login Page features testing 

Background:
Given User enters the swag labs url 
Then User navigates to the Swag labs login page 


Scenario: Successful login 
Given User is on the Swag labs login page 
When User enters correct username 
When User enters correct password 
Then User is taken to swag labs home page with the title "Swag Labs"



Scenario: Unsuccessful login with incorrect username 
Given User is on the Swag labs login page 
When User enters incorrect username 
When User enters correct password 
Then There is a error message displayed 

Scenario: Unsuccessful login with incorrect password 
Given User is on the Swag labs login page 
When User enters correct username 
When User enters incorrect password 
Then There is a error message displayed 