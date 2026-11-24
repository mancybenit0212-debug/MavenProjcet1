package adactin;

import org.mavbas.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOhodel extends Baseclass{
	public POJOhodel()
	{
		PageFactory.initElements(d, this);

	}
	@FindBy(id="location")
	private WebElement location;
	public WebElement getLocation() {
		return location;
	}
	@FindBy(id="hotels")
	private WebElement hotels;
	public WebElement getHotels() {
		return hotels;
	}
	@FindBy(id="room_type")
	private WebElement roomtype;
	public WebElement getRoomtype() {
		return roomtype;
	}
	@FindBy(id="room_nos")
	private WebElement roomnos;
	public WebElement getRoomnos() {
		return roomnos;
	}
	@FindBy(id="datepick_in")
	private WebElement datepickin;
	public WebElement getDatepickin() {
		return datepickin;
	}
	@FindBy(id="datepick_out")
	private WebElement datepickout;
	public WebElement getdatePickout() {
		return datepickout;
	}
	@FindBy(id="adult_room")
	private WebElement adultroom;
	public WebElement getAdultroom() {
		return adultroom;
	}
	@FindBy(id="child_room")
	private WebElement childroom;
	public WebElement getChildroom() {
		return childroom;
	}
	@FindBy(id="Submit")
	private WebElement Submit;
	public WebElement getSubmit() {
		return Submit;
	}

}
