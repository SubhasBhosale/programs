package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Subhas%20bhosale/OneDrive/Desktop/selenium%20files/dropdown.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//select[@id='mtr']"));
	Select sel=new Select(ele);
	List<WebElement> Z = sel.getOptions();
	int a=0;
	for(WebElement Q:Z)
	{
		System.out.println(Q.getText());
		a++;
	}
	System.out.println(a);
}
}
