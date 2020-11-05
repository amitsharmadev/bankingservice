package com.example.demo;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DiscountServiceTest {

	DiscountService service=null;
	String percentage="";
	
	@Given("Execute DiscountService Business")
	public void execute_DiscountService_Business() {
	    service=new DiscountService();
	}

	@When("Customer purchase item worth {int}")
	public void customer_purchase_item_worth(Integer price) {
	    percentage=service.getDiscount(price);
	}

	@Then("Should get twenty percent discount")
	public void should_get_twenty_percent_discount() {
		
		Assert.assertEquals("20%", percentage);
	    
	}

	
	@Then("Should get thirty percent discount")
	public void should_get_thirty_percent_discount() {
		Assert.assertEquals("30%", percentage);
	
	}


	@Then("Should get NA as discount")
	public void should_get_NA_as_discount() {
		Assert.assertEquals("NA", percentage);

	}
	
}
