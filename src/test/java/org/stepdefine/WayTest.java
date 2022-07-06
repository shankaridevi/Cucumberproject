package org.stepdefine;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.PojoWell;

import io.cucumber.java.en.*;


public class WayTest extends BaseClass{
	@Given("user should launch the chrome and load the url")
	public void user_should_launch_the_chrome_and_load_the_url() {
		
	   
	}

	@When("user should enter the valid product in the search box")
	public void user_should_enter_the_valid_product_in_the_search_box() {
		PojoWell w=new PojoWell();
		fill(w.getEnter(),"furniture");
	  
	}

	@When("user should enter the click or enter")
	public void user_should_enter_the_click_or_enter() throws AWTException {
		PojoWell w=new PojoWell();
		robotkeypress(KeyEvent.VK_ENTER);
		robotkeyrelease(KeyEvent.VK_ENTER);
		
	    
	}

	@Then("user could be see searched product or not")
	public void user_could_be_see_searched_product_or_not() throws InterruptedException {
		Thread.sleep(10);
		
		String title = driver.getTitle();
		System.out.println(title);
		
	Assert.assertEquals("give correct product", "Love",title.contains("Home"));
	}

	@When("user should click the menu button")
	public void user_should_click_the_menu_button() throws InterruptedException {
		Thread.sleep(10);
		PojoWell w=new PojoWell();
		btnClick(w.getMenu());
		
		
	    
	}

	@Then("user should see the dropdown list or not")
	public void user_should_see_the_dropdown_list_or_not() {
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, url);
	}
	@When("user should enter invalid product and numbers")
	public void user_should_enter_invalid_product_and_numbers() throws AWTException, InterruptedException {
		PojoWell w=new PojoWell();
		Thread.sleep(10);
		fill(w.getEnter(),"gfdfkhguhgeri1234");
		robotkeypress(KeyEvent.VK_ENTER);
		robotkeyrelease(KeyEvent.VK_ENTER);
		
	    
	}

	

	@Then("user should check incorrect credential page")
	public void user_should_check_incorrect_credential_page() {
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertTrue("incorrect page",title.contains("Home"));
		
	    
	}




}
