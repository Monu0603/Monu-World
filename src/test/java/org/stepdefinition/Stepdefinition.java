package org.stepdefinition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.POM.Base;
import org.POM.Pojo;
import org.POM.Pojo2;
import org.POM.Pojo3;
import org.POM.Pojo4;
import org.POM.Pojo5;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ScreenshotException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.Timeout;

public class Stepdefinition extends Base {
	
	@Given("User should oen the broeser and provide URL of Flipcart")
	public void user_should_oen_the_broeser_and_provide_URL_of_Flipcart() throws IOException {
		Launch();
	    url("https://www.flipkart.com/");
	    wait(2);
	    screenshot("URL Launched");
	}
	@When("user has to search the desired product in search bar and click on search")
	public void user_has_to_search_the_desired_product_in_search_bar_and_click_on_search() throws IOException, InterruptedException {
	    Pojo p = new Pojo();
	   Click(p.getSearch());
	   Fill(p.getSearchbox(), "IPhone X");
	   Click(p.getButton1());
	   wait(2);
	   screenshot("Product search");  
	}

	@When("user has to check the list of item searched")
	public void user_has_to_check_the_list_of_item_searched() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   List<WebElement> pr = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
			for (WebElement li : pr) {
				
				System.out.println(li.getText());
				if (li.getText().equals("Apple iPhone SE (Black, 64 GB)")) {
				li.click();	
				wait(2);
				screenshot("Product1 New");
				}
				if (li.getText().equals("Apple iPhone SE (Red, 64 GB)")) {
					li.click();
					wait(2);
					screenshot("Product2 New ");
				}
			}
	    }
	@Then("user has to handle the window after clicking on desired product")
	public void user_has_to_handle_the_window_after_clicking_on_desired_product() throws IOException, InterruptedException {
		String child = driver.getWindowHandle();
		Set<String> parent = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(parent);
		for (int i = 0; i < li.size(); i++) {
			if (!child.equals(parent)) {
				driver.switchTo().window(li.get(1));
				Pojo2 pb = new Pojo2();
				Fill(pb.getPincode(), "851216");
				Click(pb.getPinsearch());
		
		}
		}		}
	@Given("user has to check the Pin for delivery")
	public void user_has_to_check_the_Pin_for_delivery() throws IOException, InterruptedException {
		Thread.sleep(5000);
		Set<String> parent1 = driver.getWindowHandles();
		List<String> li1 =new ArrayList<String>(parent1);
		li1.addAll(parent1);
		driver.switchTo().window(li1.get(2));
		Pojo2 p2 = new Pojo2();
		Fill(p2.getPincode(), "600073");
		Click(p2.getPinsearch());
		wait(10);
			Click(p2.getAddtocart());
			wait(2);
			screenshot("product 2 order");
		}
	@When("user has to check the number of product selected")
	public void user_has_to_check_the_number_of_product_selected() { 
	}
	@When("user has to Click on Add to cart option for all selected product")
	public void user_has_to_Click_on_Add_to_cart_option_for_all_selected_product() throws InterruptedException {
		Set<String> parent2 = driver.getWindowHandles();
		List<String> li2 =new ArrayList<String>(parent2);
		li2.addAll(parent2);
		Thread.sleep(3000);
		driver.switchTo().window(li2.get(0));
	}
	@When("user has to click the cart from home page")
	public void user_has_to_click_the_cart_from_home_page()  {
	Pojo3 p3 = new Pojo3();
	Click(p3.getCheckcart());
	}

	@Then("user has to click  on continue for shopping")
	public void user_has_to_click_on_continue_for_shopping() throws InterruptedException {
		Thread.sleep(5000);
		Pojo3 p3 = new Pojo3();
		Click(p3.getCart());
	}

	@Given("user has to provide valid username and password")
	public void user_has_to_provide_valid_username_and_password() throws InterruptedException {
		Pojo4 p5= new Pojo4();
	    Thread.sleep(7000);
	    Click(p5.getUsername());
	    Fill(p5.getUsername(),"9110025795");
	    Click(p5.getUserbtn());
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	}
	@When("user has to click on the login")
	public void user_has_to_click_on_the_login() {
		Pojo4 p5= new Pojo4();
		 Fill(p5.getPass(), "Test@1234");
		    Click(p5.getPassbtn());  
	}
	@When("user has to click on the selected address and click on proceed")
	public void user_has_to_click_on_the_selected_address_and_click_on_proceed() throws InterruptedException {
	    Pojo5 p5= new Pojo5();
	    wait(3);
	    Click(p5.getAddress());  
	}
	@Then("user should move on the payment page")
	public void user_should_move_on_the_payment_page() {
		Pojo5 p5= new Pojo5();
	    Click(p5.getPayment());
	}
}
