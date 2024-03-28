package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class trainTicket {
	
	WebDriver driver;
	@Given("the user is on redRail booking app homepage")
	public void the_user_is_on_red_rail_booking_app_homepage() {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);		
		   driver.get("https://www.redbus.in/railways/");
		   driver.manage().window().maximize();

	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user enters departure city")
	public void user_enters_departure_city() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("src")).sendKeys("New Delhi");
		driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div[3]/div[2]/div/div/div/div/div[2]")).click();

	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user enters destination city")
	public void user_enters_destination_city() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.id("dst")).sendKeys("Chennai");
		driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div[3]/div[2]/div/div/div/div/div[3]")).click();

	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user wants to select date")
	public void user_wants_to_select_date() {
		
		//driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div[3]/div[2]/div/form/div[3]/div/img")).click();

	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("clicks on the search Trains button")
	public void clicks_on_the_search_trains_button() {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div[3]/div[2]/div/form/button")).click();


	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the user should see a list of available trains")
	public void the_user_should_see_a_list_of_available_trains() {
		
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Given("the user wants to check the status of a train")
	public void the_user_wants_to_check_the_status_of_a_train() {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);			
		   driver.get("https://www.redbus.in/railways/train-running-status?from=Home%20Dweb");
		   driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("the user enters the train number or name in the search bar")
	public void the_user_enters_the_train_number_or_name_in_the_search_bar() {
		
		WebElement x = driver.findElement(By.name("pnrNo"));
		x.sendKeys("12862 | Visakhapatnam SF Express");
        //driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div[2]/div[4]/button"));
      //x.sendKeys(Keys.ENTER);

	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user click on the check status")
	public void user_click_on_the_check_status() {
		
		driver.findElement(By.xpath("//button[@class=' button false']")).click();
		
		//WebElement status = driver.findElement(By.xpath("//button[@class=\' button  button pnr_disabled1\']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].click();",status);

	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("the system displays the schedule and current status of the train")
	public void the_system_displays_the_schedule_and_current_status_of_the_train() {
		
		//driver.get("//div[@class=\'lts_desktop\']");

	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user enters both source and destination city same")
	public void user_enters_both_source_and_destination_city_same() {
		
		driver.findElement(By.id("src")).sendKeys("New Delhi");
		driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div[3]/div[2]/div/div/div/div/div[2]")).click();
		driver.findElement(By.id("dst")).sendKeys("New Delhi");
		driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div[3]/div[2]/div/div/div/div/div[2]")).click();

	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user click on search button")
	public void user_click_on_search_button() {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div[3]/div[2]/div/form/button")).click();

	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("the user should get alert message")
	public void the_user_should_get_alert_message() {
		
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	@When("user clicks on Help")
	public void user_clicks_on_help() {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/nav/div/div[2]/div[1]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("It shows the Help Topic options")
	public void it_shows_the_help_topic_options() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


}
