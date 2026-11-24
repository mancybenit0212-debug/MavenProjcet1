package org.test;

import java.awt.AWTException;

import org.mavbas.Baseclass;
import org.openqa.selenium.WebElement;
import org.pojohome.POJOHomePage;
import org.search.POJOSearchpage;

public class TestPom extends Baseclass{
public static void main(String[] args) throws InterruptedException, AWTException {
	browcherlaunch() ;
	launchUrl("https://www.flipkart.com/");
	POJOHomePage p=new POJOHomePage();

	WebElement searchEle = p.getSearchBx();
	searchEle.sendKeys("iphone16");
	
	d.navigate().refresh();
	
	Thread.sleep(2000);
	p.getCloseLogin().click();
	searchEle.sendKeys("iphone16");
	
	enter();
	
	Thread.sleep(2000);
//	String actualUrl = d.getCurrentUrl();
	
	if (getUrl().contains("iphone16")) 
	{
		System.out.println("Verified");
	}
	else {
		System.out.println("Not verified");
		System.exit(0);
	}
	gettitle();
	
	POJOSearchpage p2 = new POJOSearchpage();
	p2.getIphone16ELe().click();
	
	

}	
	


}
