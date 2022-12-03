package org.stepdefinition;

import org.baseclass.baseclass;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pojoclass.pojoclass_bb;

public class ourstory_bb extends baseclass {
	pojoclass_bb p;
	@When("click the ourstory option in homepage")
	public void click_the_ourstory_option_in_homepage() {
	   p=new pojoclass_bb();
	   WebElement story = p.getOurstory();
		story.click();
	}

	@When("check the spelling mistakes")
	public void check_the_spelling_mistakes() {
		System.out.println("check the spelling mistakes : pass");
	    	}

	@Then("close the browsers")
	public void close_the_browsers() {
		close();
	    
	}
	
	
	
}
