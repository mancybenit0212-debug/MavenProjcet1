package org.mavbas;
import java.awt.AWTException;
import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Mainpgm extends Baseclass {
public static void main(String[] args) throws AWTException {
	browcherlaunch();
	launchUrl("https://www.snapdeal.com/");
	WebElement search = d.findElement(By.id("search-box-input"));
	sendkey(search,"T shirts" );
	enter();
	WebElement shirtClick = d.findElement(By.xpath("(//img[@class='product-image wooble'])[2]"));
	click(shirtClick);
	childid(1);
	WebElement cart = d.findElement(By.id("add-cart-button-id"));
	click(cart);
	WebElement scrollupmeth = d.findElement(By.xpath("//p[text()='Payment']"));
	scrollup(scrollupmeth);
	     WebElement scrolldownmeth = d.findElement(By.className("mess-text"));
	    scrollDown(scrolldownmeth);
}
}
