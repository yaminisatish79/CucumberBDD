Feature: Login Page features testing 

Background:
Given User enters the swag labs url 
Then User navigates to the Swag labs login page where the title of the page is "Swag Labs"


Scenario: Successful login 
Given User is on the Swag labs login page 
When User enters correct username "standard_user"
When User enters correct password "secret_sauce"
Then User is taken to Swag labs home page with the title "Swag Labs"



Scenario: Unsuccessful login with incorrect username 
Given User is on the Swag labs login page 
When User enters incorrect username "standard_user1"
When User enters correct password "secret_sauce"
Then There is a error message displayed "Epic sadface: Username and password do not match any user in this service"

Scenario: Unsuccessful login with incorrect password 
Given User is on the Swag labs login page 
When User enters correct username "standard_user"
When User enters incorrect password "12345"
Then There is a error message displayed "Epic sadface: Username and password do not match any user in this service"