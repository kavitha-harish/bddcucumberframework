//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import com.pages.Vtigerloginpage;
//import com.qa.factory.DriverFactory;
//
//import io.cucumber.java.en.*;
//
//public class Vtigerloginsteps {
//	
//	private Vtigerloginpage page=new Vtigerloginpage(DriverFactory.getDriver());
//	
//	@Given("I want to launch the browser and I will enter the url")
//	public void i_want_to_launch_the_browser_and_i_will_enter_the_url() {
//		DriverFactory.getDriver().get("http://localhost:8888/");
//		DriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	   
//	}
//
//	@When("login page is displayed I will enter username and password")
//	public void login_page_is_displayed_i_will_enter_username_and_password() {
//		page.enterusername("admin");
//		page.enterpassword("admin");
//	    	}
//
//	@When("click on login button")
//	public void click_on_login_button() {
//		
//		page.clickloginbtn();
//	   	}
//
//	@Then("It should navigate me to Home page")
//	public void it_should_navigate_me_to_home_page() {
//		System.out.println("you are in homepage");
//	    
//	}
//
//
//}
