package org.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo2 extends Base {
	
	public Pojo2() {

	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(className="_3X4tVa")
	private WebElement pincode;
	
	@FindBy(xpath="//span[@class='_2aK_gu']")
	private WebElement pinsearch;
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement addtocart;

	public WebElement getPincode() {
		return pincode;
	}

	public void setPincode(WebElement pincode) {
		this.pincode = pincode;
	}

	public WebElement getPinsearch() {
		return pinsearch;
	}

	public void setPinsearch(WebElement pinsearch) {
		this.pinsearch = pinsearch;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public void setAddtocart(WebElement addtocart) {
		this.addtocart = addtocart;
	}
	

}
