package org.task;

import java.util.List;

import org.mavbas.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOhome extends Baseclass{
	public POJOhome()
	{
		PageFactory.initElements(d, this);
	}
	@FindBy(id="ucity")
	private WebElement city;
	public WebElement getCity() {
		return city;
	}
	@FindBy(xpath="(//input[@class='ver_btn'])[1]")
	private WebElement chennai;
	public WebElement getChennai() {
		return chennai;
	}
	@FindBy(xpath="//span[@class='cardTitle font-muli']")
	private List<WebElement> car;
	public List<WebElement> getCar() {
		return car;
	}
	
	@FindBy(xpath="(//div[@class='cr_prc'])")
	private List<WebElement> price;
	public List<WebElement> getPrice() {
		return price;
	}
	
	
	
	
	
	
	
	
	
 
}
