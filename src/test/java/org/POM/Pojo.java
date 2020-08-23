package org.POM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Base{
	
	public Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8'] ")
	private WebElement search;
	@FindBy(xpath="//input[@class='LM6RPg'] ")
	private WebElement searchbox;
	@FindBy(xpath="//button[@class='vh79eN'] ")
	private WebElement Button1;
	@FindBy(xpath="//div[@class='_3wU53n']")
	private List<WebElement> product;
	public WebElement getSearch() {
		return search;
	}
	public void setSearch(WebElement search) {
		this.search = search;
	}
	public WebElement getSearchbox() {
		return searchbox;
	}
	public void setSearchbox(WebElement searchbox) {
		this.searchbox = searchbox;
	}
	public WebElement getButton1() {
		return Button1;
	}
	public void setButton1(WebElement button1) {
		Button1 = button1;
	}
	public List<WebElement> getProduct() {
		return product;
	}
	public void setProduct(List<WebElement> product) {
		this.product = product;
	}
	

}
