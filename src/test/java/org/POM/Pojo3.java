package org.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo3 extends Base {
	
	public Pojo3() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='_3ko_Ud']")
	private WebElement checkcart;
	@FindBy(xpath="//button[@class='_2AkmmA iwYpF9 _7UHT_c']")
	private WebElement cart;
	public WebElement getCheckcart() {
		return checkcart;
	}
	public void setCheckcart(WebElement checkcart) {
		this.checkcart = checkcart;
	}
	public WebElement getCart() {
		return cart;
	}
	public void setCart(WebElement cart) {
		this.cart = cart;
	}
	


}
