package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.baseclass.baseclass;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pojoclass.pojoclass_bb;

public class Getprice_coke extends baseclass {
	pojoclass_bb p;
	@When("click the search button")
	public void click_the_search_button() throws InterruptedException {
		p=new pojoclass_bb();
		WebElement menu = p.getmenu();
		menu.click();
		Thread.sleep(3000);
	    
	}

	@When("Enter the coke in the search box and click enter button")
	public void enter_the_coke_in_the_search_box_and_click_enter_button() throws AWTException {
		WebElement s = p.getSearchbutton();
		s.click();
		s.sendKeys("coke");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("get the price of the coke")
	public void get_the_price_of_the_coke() {
		p=new pojoclass_bb();
		WebElement price = p.getCokeprice();
	   String t = price.getText();
	   System.out.println("price of the coke :"+t);
	}

	@Then("close the browser.")
	public void close_the_browser() {
	    close();
		
	}

}
