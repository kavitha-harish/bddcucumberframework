package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.pages.Vtigerloginpage;
import com.qa.factory.DriverFactory;
import com.qa.util.FileUtility;
import com.qa.util.WebDriverUtility;

import io.cucumber.java.en.*;



public class VtigerLoginStep {
		FileUtility fu;
		WebDriverUtility wu;
			
		private Vtigerloginpage page=new Vtigerloginpage(DriverFactory.getDriver());
		
		@Given("I want to launch the browser and I will enter the url")
		public void i_want_to_launch_the_browser_and_i_will_enter_the_url() throws Throwable {
			fu=new FileUtility();
			wu=new WebDriverUtility();
			String url = fu.getPropertyKeyValue("url");
			System.out.println( "weburl of  page is "+url);
			
			DriverFactory.getDriver().get(url);
			wu.Wait20(DriverFactory.getDriver());
			
			
		   
		}
		

		@When("login page is displayed I will enter username and password")
		public void login_page_is_displayed_i_will_enter_username_and_password() throws Throwable {
			fu=new FileUtility();
			String un = fu.getPropertyKeyValue("username");
			String pw = fu.getPropertyKeyValue("password");
			page.enterusername(un);
			page.enterpassword(pw);
		    	}

		@When("click on login button")
		public void click_on_login_button() {
			
			page.clickloginbtn();
		   	}

		@Then("It should navigate me to Home page")
		public void it_should_navigate_me_to_home_page() {
			
			String actualtitle = DriverFactory.getDriver().getTitle();
			String expectedtitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
			System.out.println("homepage title is "+actualtitle);
			Assert.assertEquals(expectedtitle, actualtitle);
		    
		}
		@When("login page is displayed I will enter {string} and {string}")
		public void login_page_is_displayed_i_will_enter_and(String un, String pw) {
			page.enterusername(un);
			page.enterusername(pw);
			page.clickloginbtn();
		    
		}

		@Then("It should Not navigate me to Home page")
		public void it_should_not_navigate_me_to_home_page() {
			System.out.println("not navigated to homepage");
			


		}

		@Then("Error message should be displayed")
		public void error_message_should_be_displayed() {
			String errmsg = page.errormessage();
			System.out.println("error message is   =============>"+errmsg);
			String expectederror="You must specify a valid username and password.";
			Assert.assertEquals(expectederror, errmsg);
		   
		}
		@Then("login page is display username textfield and password textfield")
		public void login_page_is_display_username_textfield_and_password_textfield() {
		    boolean booleanun = page.usernametf();
		    System.out.println("username text field is visible=====>"+booleanun);
		    boolean booleanpw = page.passwordtf();
		    System.out.println("password text field is visible========>"+booleanpw);
		    Assert.assertEquals(booleanun, false);
		    Assert.assertEquals(booleanpw, false);
		
}
}


