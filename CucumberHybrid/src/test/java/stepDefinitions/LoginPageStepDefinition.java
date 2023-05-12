package stepDefinitions;

import com.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinition {

	LoginPage loginPage = new LoginPage();
	
	@Given("User enters the swag labs url")
	public void user_enters_the_swag_labs_url() {
	 System.out.println("This call is from user_enters_the_swag_labs_url ");
	 loginPage.enterURL();
	}

	@Then("User navigates to the Swag labs login page where the title of the page is {string}")
	public void user_navigates_to_the_swag_labs_login_page_where_the_title_of_the_page_is(String string) {
	  
	}

	@Given("User is on the Swag labs login page")
	public void user_is_on_the_swag_labs_login_page() {
	    
	}

	@When("User enters correct username {string}")
	public void user_enters_correct_username(String string) {
	   
	}
	
	@When("User enters correct password {string}")
	public void user_enters_correct_password(String string) {
	  
	}
	
	@Then("User is taken to Swag labs home page with the title {string}")
	public void user_is_taken_to_swag_labs_home_page_with_the_title(String string) {
	  
	}
	@When("User enters incorrect username {string}")
	public void user_enters_incorrect_username(String string) {
	}

	@Then("There is a error message displayed {string}")
	public void there_is_a_error_message_displayed(String string) {
	    
	}


	@When("User enters incorrect password {string}")
	public void user_enters_incorrect_password(String string) {
	  
	}

}
