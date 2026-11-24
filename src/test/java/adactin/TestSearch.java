package adactin;

import org.junit.Before;
import org.junit.Test;
import org.mavbas.Baseclass;
import org.task1.POJOhomepage;

public class TestSearch extends Baseclass {

	@Before
	public void validateLoginValidCredentials() {
		browcherlaunch();
		launchUrl("https://adactinhotelapp.com/");
		POJOhomepage p=new POJOhomepage();
		p.getUsername().sendKeys("AhanaAshu");
		p.getPassword().sendKeys("QSV2K7");
		p.getLogin().click();
	}
	@Test
	public void validateHpodelValidCredentials() {
		POJOhodel p1 =new POJOhodel();
		selindx(p1.getLocation(), 2);
		
		
		
	}
}
