package adactin;

import org.junit.Test;
import org.mavbas.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.task1.POJOhomepage;

import com.google.common.annotations.VisibleForTesting;

public class TestLogin extends Baseclass{

	@Test
	public void validateLoginValidCredentials() {
		browcherlaunch();
		launchUrl("https://adactinhotelapp.com/");
		POJOhomepage p=new POJOhomepage();
		p.getUsername().sendKeys("AhanaAshu");
		p.getPassword().sendKeys("QSV2K7");
		p.getLogin().click();
	}
	@Test
	public void validateLoginByInValidCredentials1() {
		browcherlaunch();
		launchUrl("https://adactinhotelapp.com/");
		POJOhomepage p=new POJOhomepage();
		p.getUsername().sendKeys("AhanaAshu");
		p.getPassword().sendKeys("QSV2");
		p.getLogin().click();
	}
	@Test
	public void validateLoginByInValidCredentials2() {
		browcherlaunch();
		launchUrl("https://adactinhotelapp.com/");
		POJOhomepage p=new POJOhomepage();
		p.getUsername().sendKeys("Ahana");
		p.getPassword().sendKeys("QSV2K7");
		p.getLogin().click();
	}
	public void validateLoginByInValidCredentials3() {
		browcherlaunch();
		launchUrl("https://adactinhotelapp.com/");
		POJOhomepage p=new POJOhomepage();
		p.getUsername().sendKeys("Ahana");
		p.getPassword().sendKeys("QSV2");
		p.getLogin().click();
	}
	
	

}
