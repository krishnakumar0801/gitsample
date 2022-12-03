package org.stepdefinition;

import org.baseclass.baseclass;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;
import pojoclass.pojoclass_bb;

public class menu_select extends baseclass {
pojoclass_bb p;
	
	@When("click the dosa dish")
	public void click_the_dosa_dish() throws InterruptedException {
		
		p=new pojoclass_bb();
		WebElement dosa = p.getmenu();
		Thread.sleep(3000);
		dosa.click();    
	}

	@When("scrolldown and select masala dosa.")
	public void scrolldown_and_select_masala_dosa() {
		p=new pojoclass_bb();
		WebElement md = p.getMasaladosa();
	    scroll(md);
	    md.click();
	}

	@When("print the Available time.")
	public void print_the_Available_time() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Check the available time : pass");
		close();
	}
	
}
