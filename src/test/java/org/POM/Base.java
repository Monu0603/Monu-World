package org.POM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Base {
	public static WebDriver driver;
	public static void Launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Flipcart\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		

	}
	
	public static void url(String url) {
		driver.get(url);

	}
	public static void Fill(WebElement e, String s1) {
		e.sendKeys(s1);

	}
	
	public static void Click(WebElement e) {
		
		e.click();
	

	}
	public static void wait(int d) {
		FluentWait<WebDriver> f = new  FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(d)).
				pollingEvery(Duration.ofSeconds(5)).ignoring(Throwable.class);
	}
	
	public static void screenshot(String name) throws IOException
	{
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src= tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File f1= new File("D:\\Workspace\\Screenshot\\Cucumber\\"+name+".png");
		FileUtils.copyFile(src, f1);
		
	}
	

}
