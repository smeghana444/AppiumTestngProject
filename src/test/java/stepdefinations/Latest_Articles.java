package stepdefinations;


import DriverFactory.webdriverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LatestPage;

public class Latest_Articles
{
	private LatestPage latest=new LatestPage(webdriverfactory.getDriver());
	
	
	@Given("Verify the app title")
	public void get_the_app_title() 
	{
		String title=latest.getLoginPageTitle();
		System.out.println("Launch page title is "+title);
		
	}
	@Then("Navigate to championships")
	public void navigate_to_championships() 
	{
		System.out.println("Navigate to Championship");
		latest.navigate_championship();
			
		
		
	}
	
    @Then("select championship {string}")
	public void select_championship(String selectchampionship) throws Exception 
	{
		
		System.out.println("Select the championship");
		Thread.sleep(1000);
		latest.select_championship(selectchampionship);
			
	    
	}

	@Then("click on latest tab")
	public void click_on_latest_tab()
	{
		System.out.println("Click on latest tab");
	}

	@Then("Navigate to Articles section")
	public void navigate_to_articles_section() 
	{
		System.out.println("Navigate to Articles section");
	}

	@Then("Verify left and right navigation in articles")
	public void verify_left_and_right_navigation_in_articles() 
	{
		System.out.println("Verify left and right navigation");
	}

	@Then("verify publish dates available for all articles cards")
	public void verify_publish_dates_available_for_all_articles_cards() 
	{
		System.out.println("Verify publish dates are available");
	}
	
}
