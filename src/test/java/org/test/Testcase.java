package org.test;

import java.io.IOException;

import org.mavbas.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase extends Baseclass{
	
	public static void main(String[] args) throws IOException {
		browcherlaunch();
		launchUrl("https://www.facebook.com/");
		WebElement e = d.findElement(By.name("email"));
		sendkey(e, readFromExcel("data", 2,3));
	}


}
