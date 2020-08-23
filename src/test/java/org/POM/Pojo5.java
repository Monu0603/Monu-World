package org.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pojo5 extends Base{
	
	public Pojo5() {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getPayment() {
		return payment;
	}

	public void setPayment(WebElement payment) {
		this.payment = payment;
	}


	@FindBy(xpath="//button[@class='_2AkmmA _I6-pD _7UHT_c']")
	private WebElement address;
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Q4i61 _7UHT_c']")
	private WebElement payment;

}
