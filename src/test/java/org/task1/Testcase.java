package org.task1;

import org.mavbas.Baseclass;

public class Testcase extends Baseclass{
	public static void main(String[] args) {
		browcherlaunch();
		launchUrl("https://adactinhotelapp.com/");
		
		POJOhomepage p=new POJOhomepage();
		sendkey(p.getUsername(), "AhanaAshu");
		
		sendkey(p. getPassword(),"QSV2K7" );
		refresh();
        sendkey(p.getUsername(), "AhanaAshu");
		
		sendkey(p. getPassword(),"QSV2K7" );
	}
	
	
	

}
