package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps {
	@Given("I placed an order for following items")
	public void i_placed_an_order_for_following_items(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> Billdata = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> Billitems : Billdata) {
			for (Map.Entry<String, String> Billitem : Billitems.entrySet()) {
				System.out.println("Key: " + Billitem.getKey());
				System.out.println("Value: " + Billitem.getValue());
			}

		}
	}

	@When("I generate the bill")
	public void i_generate_the_bill() {

	}

	@Then("A bill for ${int} should be generated")
	public void a_bill_for_$_should_be_generated(Integer int1) {

	}

}
