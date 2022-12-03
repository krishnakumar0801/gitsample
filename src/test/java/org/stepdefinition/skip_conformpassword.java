package org.stepdefinition;

import java.util.List;

import org.baseclass.baseclass;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import pojoclass.pojoclass_bb;

public class skip_conformpassword extends baseclass{
	pojoclass_bb p;

	@When("click the account button present in the top of the webpage")
	public void click_the_account_button_present_in_the_top_of_the_webpage() {
		p=new pojoclass_bb();
		WebElement a = p.getAccount();
		a.click();   
	}

	@When("In the register side enter the name")
	public void in_the_register_side_enter_the_name() {
	    p=new pojoclass_bb();
	    WebElement n = p.getName();
	    n.sendKeys("krishna kuamr ps");
	}

	@When("Enter a invalid email id.")
	public void enter_a_invalid_email_id(DataTable d) {
	  p=new pojoclass_bb();
		WebElement email = p.getEmail();
		List<String> l = d.asList();
		email.sendKeys(l.get(0));
	}

	@When("Enter a invalid phonenumber.")
	public void enter_a_invalid_phonenumber(DataTable d) {
		p=new pojoclass_bb();
		WebElement phone = p.getPhone();
		List<String> l = d.asList();
		phone.sendKeys(l.get(0));
	}

	@When("Enter a invalid password.")
	public void enter_a_invalid_password(DataTable d) {
		p=new pojoclass_bb();
		WebElement pass = p.getPassword();
		List<String> l = d.asList();
		pass.sendKeys(l.get(0));
	}

	@When("click the register button")
	public void click_the_register_button() {
	    p=new pojoclass_bb();
	    WebElement s = p.getSubmit();
	    s.click();
	    close();
	}


}

