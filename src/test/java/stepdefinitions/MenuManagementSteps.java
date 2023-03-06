package stepdefinitions;

import bddlearn.course.RestaurantMenuItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuManagementSteps {
	RestaurantMenuItem NewMenuItem;
	RestaurantMenu LocationMenu = new RestaurantMenu();

	public MenuManagementSteps() {
		System.out.println("Constructor called");
	}

	@Given("I setup the test data")
	public void i_setup_the_test_data() {
		System.out.println("i_setup_the_test_data");
	}

	@Given("I setup more test data")
	public void i_setup_more_test_data() {
		System.out.println("i_setup_more_test_data");
	}

	@Given("I have a menu item with name {string} and price {int}")
	public void i_have_a_menu_item_with_name_and_price(String newMenuItemName, Integer price) {

		NewMenuItem = new RestaurantMenuItem("menuItemName", "menuItemName", "price");
		System.out.println("Step 1");
	}

	@When("I add that menu item")
	public void i_add_that_menu_item() {
		LocationMenu.addMenuItem(NewMenuItem);
		System.out.println("Step 2");
	}

	@Then("Menu Item with name {string} should be added")
	public void menu_item_with_name_should_be_added(String string) {
		boolean Exists = LocationMenu.DoesItemExist(NewMenuItem);
		System.out.println("Step 3");
	}

}
