package org.stepdefinition;

import java.util.List;

import org.baseclass.baseclass;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.*;
import pojoclass.pojoclass_bb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class bistobites_register extends baseclass{
pojoclass_bb p;	


	@Given("Open the browser and enter the url")
	public void open_the_browser_and_enter_the_url(DataTable d) {
		browser();
		List<String> l = d.asList();
		url(l.get(0));
	}
	@When("Click the account button present in the top of the webpage")
	public void click_the_account_button_present_in_the_top_of_the_webpage() {
		
	   p= new pojoclass_bb();
	   WebElement a = p.getAccount();
	   a.click();
		
	}

	@When("In register side enter your name")
	public void in_register_side_enter_your_name() {
	   p=new pojoclass_bb();
	   WebElement name = p.getName();
	   name.sendKeys("krishnakumar.ps");
	}

	@When("Enter the invalid email id.")
	public void enter_the_invalid_email_id(DataTable d) {
	   p=new pojoclass_bb();
	   WebElement email = p.getEmail();
	   List<String> l = d.asList();
		email.sendKeys(l.get(0));
	}

	@When("Enter the invalid phonenumber.")
	public void enter_the_invalid_phonenumber(DataTable d) {
	   p=new pojoclass_bb();
	   WebElement phone = p.getPhone();
	   List<String> l = d.asList();
	   phone.sendKeys(l.get(0));
	}

	@When("Enter the invalid password.")
	public void enter_the_invalid_password(DataTable d) {
		p=new pojoclass_bb();
		WebElement pass = p.getPassword();
		List<String> l = d.asList();
		pass.sendKeys(l.get(0));
	}

	@When("Enter the conform password.")
	public void enter_the_conform_password(DataTable d) {
		p=new pojoclass_bb();
		WebElement con_password = p.getCon_password();
		List<String> l = d.asList();
		con_password.sendKeys(l.get(0));
	}

	@When("click register button")
	public void click_register_button() {
		p=new pojoclass_bb();
		WebElement s = p.getSubmit();
		s.click();
		System.out.println("There is no intimation of invalid mobilenumber ");
		close();
	}

	
		
	}




