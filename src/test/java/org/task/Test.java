package org.task;

import java.util.List;

import org.mavbas.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test extends Baseclass{
	public static void main(String[] args) {
		browcherlaunch();
		launchUrl("https://www.cartrade.com/");
		
		
		POJOhome p=new POJOhome();
		selectvisibitxt(p.getCity(), "Chennai");
	    click(p.getChennai());
	    
	    for (int i = 1; i <p.getCar().size(); i++) {
	   
			System.out.print(p.getCar().get(i).getText());
			for (int j = i; j==i; j++) {
				System.out.println(":"+p.getPrice().get(j).getText());
			}
	    }
	
	
	
	}

}
