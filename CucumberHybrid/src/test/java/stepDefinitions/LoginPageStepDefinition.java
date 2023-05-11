package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinition {

	@Given("User enters the swag labs url")
	public void user_enters_the_swag_labs_url() {
	 System.out.println("This call is from user_enters_the_swag_labs_url ");
	}

	@Then("User navigates to the Swag labs login page")
	public void user_navigates_to_the_swag_labs_login_page() {
	    
	}

	@Given("User is on the Swag labs login page")
	public void user_is_on_the_swag_labs_login_page() {
	    
	}

	@When("User enters correct username")
	public void user_enters_correct_username() {
	  
	}

	@When("User enters correct password")
	public void user_enters_correct_password() {
	  
	}

	@Then("User is taken to swag labs home page with the title {string}")
	public void user_is_taken_to_swag_labs_home_page_with_the_title(String string) {
	 
	}

	@When("User enters incorrect username")
	public void user_enters_incorrect_username() {
	    
	}

	@Then("There is a error message displayed")
	public void there_is_a_error_message_displayed() {
	   
	}

	@When("User enters incorrect password")
	public void user_enters_incorrect_password() {
	    
	}

	
}
