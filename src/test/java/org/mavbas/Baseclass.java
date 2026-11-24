package org.mavbas;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.awt.Robot;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver d;
	public static Robot r;
	public static JavascriptExecutor j;
	public static Select s;
	public static Actions a;
	public static TakesScreenshot t;
	public static  Alert ar;
	//1 
	public static void browcherlaunch() {
	 d=new ChromeDriver();
	}
	//2
	public static void launchUrl(String url) {
	d.get(url);
	}
	
	//3
	public static String getUrl() {
	String curUrl = d.getCurrentUrl();
//	System.out.println(curUrl);
	return curUrl;
	
	}

	//4
	public static void gettitle() {
	String title = d.getTitle();
	System.out.println(title);
	}
	//5 sendkeys
	public static void sendkey(WebElement srch,String product) {
	     srch.sendKeys(product);
	}
	// 6 click
	public static void click(WebElement addref) {
	addref.click();
	}
	//robot 7
	public static void enter() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void down() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}

	
	public static void childid(int windowPosition) {
	String parentId = d.getWindowHandle();
	
	Set<String> allid = d.getWindowHandles();
	List<String> l=new ArrayList<>();
	l.addAll(allid);
	String childId = l.get(windowPosition);
	
	d.switchTo().window(childId);
	}

	//10 javascript executor 10
	
	//11 scrolldown
	public static  void scrollup(WebElement scrollUpref) {
		j=(JavascriptExecutor)d;
		j.executeScript("arguments[0].scrollIntoView(true)", scrollUpref);
	}
	// 12 scrollup
	public static void scrollDown(WebElement scrollDownref ) {
		j=(JavascriptExecutor)d;
		j.executeScript("arguments[0].scrollIntoView(false)", scrollDownref);
	}
	//13
	public static void selectClick(WebElement clickref ) {
		j=(JavascriptExecutor)d;
	
		j.executeScript("arguments[0].click()",clickref);
	}
	//14
	public static void jsSend(WebElement pass,String val) {
		j=(JavascriptExecutor)d;
	j.executeScript("arguments[0].setAttribute('value','val')", pass);
	}

	//15
	public static void jxreturn(WebElement ref) {
		j=(JavascriptExecutor)d;
	j.executeScript("return arguments[0]. getAttribute('value')", ref);
	}

	//actions 16
	public static void movetoelem(WebElement move) {
	a=new Actions(d);
	a.moveToElement(move).perform();
	}

	//17
	public static void dragdrop(WebElement drag,WebElement drop) {
	a=new Actions(d);
	a.dragAndDrop(drag, drop).perform();
	}

	//18
	public static void keyup(WebElement up) {
	a=new Actions(d);
	a.keyUp(up, Keys.ENTER).perform();
	}

	//19
	public static void keydown(WebElement down) {
	a=new Actions(d);
	a.keyDown(down, Keys.ENTER).perform();
	}
	//20
	public static void contexClick(WebElement clicka) {
	a=new Actions(d);
	a.contextClick(clicka).perform();;
	}
	//21
	public static void doubleclk(WebElement doubleClik) {
	a=new Actions(d);
	a.doubleClick(doubleClik).perform();
	}

	//dropDown 22
	public static void selectvisibitxt(WebElement webrefsele,String selref) {
	s=new Select(webrefsele);
	s.selectByVisibleText(selref);
	}
	//23
	public static void selectval(WebElement selValue,String val ) {
	s=new Select(selValue);
	s.selectByValue(val);
	}
	//24
	public static void selindx(WebElement selIndex,int val) {
	s=new Select(selIndex);
	s.selectByIndex(val);
	}
	//25
	public static void getopt(WebElement getref) {
	s=new Select(getref);
	List<WebElement> allopts = s.getOptions();
	for (int i = 0; i < allopts.size(); i++) {
	WebElement allText = allopts.get(i);
	System.out.println(allText.getText());
	}
	}
	//26
	public static void getfirstopt(WebElement firstref) {
	s=new Select(firstref);
	WebElement firstOpt = s.getFirstSelectedOption();
	System.out.println(firstOpt.getText());
	}
	//27
	public static void all(WebElement allselRef) {
	s=new Select(allselRef);
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (int i = 0; i < allSelectedOptions.size(); i++) {
	WebElement allText = allSelectedOptions.get(i);
	System.out.println(allText.getText());
	}
	}
	//28
	public void deselectAll(WebElement deref) {
	s=new Select(deref);
	s.deselectAll();
	}
	//29
	public void deselectValue(WebElement deAllref,String value) {
	s=new Select(deAllref);
	s.deselectByValue(value);
	}
	//30
	public void deselectIndex(WebElement deindxref,int id) {
	s=new Select(deindxref);
	s.deselectByIndex(id);
	}

	//31
	public static void deselvisibi(WebElement visiref,String txt) {
	s=new Select(visiref);
	s.deselectByVisibleText(txt);
	}
	//32
	public static void sreenshot() {
	t= (TakesScreenshot)d;
	}

	//33
	public static void takeScreenShotMeth(String screenshot_name) throws IOException {
	sreenshot();
	File take = t.getScreenshotAs(OutputType.FILE);
	File f=new File("D:\\Eclipse Workspace\\MavenPro\\src\\picture"+screenshot_name+".png");
	    FileUtils.copyFile(take, f);
	}
	 
	//34
	public static void getval(WebElement gettxt) {
	String text = gettxt.getText();
	System.out.println(text);
	}

	//35
	private void getvalue(WebElement getval,String val) {
	      String getValueText = getval.getAttribute(val);
	      System.out.println(getValueText);
	}

	//36
	public static void closetab() {
	d.close();
	}
	//37
	public static void quitetab() {
	d.quit();
	}
	//38
	public static void alertSwitch() {
	d.switchTo().alert();
	}
	//39
	public static void alerthand() {
	ar.accept();
	}
	//40
	public static void dis() {
	ar.dismiss();
	}
	 //41
	public static void sendk(String val) {
	ar.sendKeys(val);
	}
	//42
	public static void gettext() {
	String text = ar.getText();
	System.out.println(text);
	}
	//43
	public static void frameswitch(WebElement frameref) {
	d.switchTo().frame(frameref);
	}
	public static String readFromExcel(String st, int rw, int cl) throws IOException 
	{
		File fl = new File("D:\\Eclipse Workspace\\MavenPro\\Excel\\mavenproject.xlsx");

		FileInputStream fis = new FileInputStream(fl);

		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet(st);
		Row r = sheet.getRow(rw);
		Cell c = r.getCell(cl);

//		int type = c.getCellType(); 
		String value = "";
		if (c.getCellType() == 1) {
			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue(); 
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
			value = sdf.format(dd);
		} else {
			double num = c.getNumericCellValue();
			long l = (long) num;
			value = String.valueOf(l);
		}
		
		return value;
	}
	public static void refresh() {
		d.navigate().refresh();

}
	
}


