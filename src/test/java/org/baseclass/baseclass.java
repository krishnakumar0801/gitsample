package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

	public static WebDriver driver;
	
	public static void browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	public static void url(String url) {

		driver.get(url);
		
	}
	public static void close() {
		driver.close();

	}
	public static void windowhandle() {
		String wh = driver.getWindowHandle();

	}
	public static void windowhandles() {
		 driver.getWindowHandles();
		

	}
	public static void title() {
		driver.getTitle();
	}
	public static void firefoxdriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}
	public static void edgedriver() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}
	public static void scroll(Object ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ref);

	}
	public static void screenshot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sf = ts.getScreenshotAs(OutputType.FILE);
		File ds=new File("D:\\takescreenshot\\screenshots\\functionality.png");
		FileUtils.copyFile(sf, ds);
		
	}
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public static void actions(WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
		

	}
	public static void robotclass() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public static void actions1(WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		
	}
	public static void alert() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}
	

}
