package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screen {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	TakesScreenshot tss=(TakesScreenshot) driver;
	File scr = tss.getScreenshotAs(OutputType.FILE);
	File f2=new File("D:\\you.jpeg");
FileUtils.copyFile(scr, f2);
}
}
