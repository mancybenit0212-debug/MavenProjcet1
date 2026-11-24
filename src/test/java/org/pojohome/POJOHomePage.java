package org.pojohome;

import org.mavbas.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOHomePage extends Baseclass {
	
	public POJOHomePage() {
//		PageFactory.initElements(driver, this);
		 
	}
	
	@FindBy(xpath = "(//input[@name='q'])[1]")
	private WebElement searchBx;
	
	@FindBy(xpath = "//span[text()='✕']")
	private WebElement closeLogin;

	public WebElement getCloseLogin() {
		return closeLogin;
	}

	public WebElement getSearchBx() {
		return searchBx;

}
}
