package org.search;

import org.mavbas.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOSearchpage extends Baseclass{
	
	public POJOSearchpage() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath = "//div[text()='Apple iPhone 16 (Black, 128 GB)']")
	private WebElement iphone16ELe;

	public WebElement getIphone16ELe() {
		return iphone16ELe;
	}
	
	
}
