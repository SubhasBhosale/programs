package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class interview_Q {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.xpath("//input[@id='email"));
	String Z=ele.getText();
	System.out.println(Z);
	String Q = ele.getAttribute("class");
	System.out.println(Q);
	String p = ele.getAttribute("name");
	System.out.println(p);
	String R = ele.getAttribute("value");
	System.out.println(R);
}
}
