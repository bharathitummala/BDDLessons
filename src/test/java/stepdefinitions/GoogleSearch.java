package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {

	WebDriver driver = new ChromeDriver();

	@Given("I am on the google search page")
	public void i_am_on_the_google_search_page() {
		// System.setProperty("Webdriver.chrome.driver",
		// "src/main/resources/driver/chromedriver");
		// driver = new ChromeDriver();

		driver.get("https://www.google.com/ ");
		driver.manage().window().maximize();
	}

	@When("I enter any search keyword on search textbox")
	public void i_enter_any_search_keyword_on_search_textbox() {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Numpy Ninja");
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
		driver.findElement(By.xpath("//input[@aria-label='Google Search']")).click();
	}

	@Then("I should be redirected to search results page")
	public void i_should_be_redirected_to_search_results_page() {
		if (driver.findElement(By.id("result-stats")).getText().contains("results")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		driver.close();
		driver.quit();
	}

}
