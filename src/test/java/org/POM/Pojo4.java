package org.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo4 extends Base {
	
	public Pojo4() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@class='_2zrpKA _3X0qwn']")
	private WebElement username;
	@FindBy(xpath="//button[@class='_2AkmmA T7K48m _7UHT_c']")
	private WebElement userbtn;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _3X0qwn']")
	private WebElement pass;
	@FindBy(xpath="//button[@class='_2AkmmA T7K48m _7UHT_c']")
	private WebElement passbtn;
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getUserbtn() {
		return userbtn;
	}
	public void setUserbtn(WebElement userbtn) {
		this.userbtn = userbtn;
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	public WebElement getPassbtn() {
		return passbtn;
	}
	public void setPassbtn(WebElement passbtn) {
		this.passbtn = passbtn;
	}
	
}
