package org.stepdefinition;

import java.util.Date;

import org.POM.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
;

public class Hooks extends Base {
	
	@Before

	public void beforetest() {
		
		Date d = new Date();
		System.out.println(d);
		
		
	}

}
