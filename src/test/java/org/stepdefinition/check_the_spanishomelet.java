package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.baseclass.baseclass;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pojoclass.pojoclass_bb;

public class check_the_spanishomelet extends baseclass {
	pojoclass_bb p;
	
	@When("click the menu option")
	public void click_the_menu_option() {
	    p=new pojoclass_bb();
	    WebElement m = p.getmenu();
	    m.click();
	    
	}

	@When("In search box type the given food product and enter")
	public void in_search_box_type_the_given_food_product_and_enter() throws AWTException {
	    p=new pojoclass_bb();
	    WebElement b = p.getSearchbutton();
		b.click();
		b.sendKeys("spanish omelet");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("check the overall availability")
	public void check_the_overall_availability() {
		p=new pojoclass_bb();
		WebElement r = p.getResult();
		String t = r.getText();
		System.out.println("To check the probability of the food : pass" +t);
	    
	}

	@When("check the price")
	public void check_the_price() {
	    p=new pojoclass_bb();
	    WebElement pr = p.getPrice();
	    String t = pr.getText();
	    System.out.println("To check the dollar probability : pass "+t);
	}

	@Then("close the browser")
	public void close_the_browser() {
		close();
	    
	}

}
