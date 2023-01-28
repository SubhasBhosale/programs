package practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple_dropdown
{
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Subhas%20bhosale/OneDrive/Desktop/selenium%20files/multiselect%20dropdown.html");
    Thread.sleep(2000);
    WebElement ele = driver.findElement(By.xpath("//select[@id='hi']"));
   Select sel=new Select(ele);
   List<WebElement> Z = sel.getOptions();
   for (WebElement X : Z)
   {
	   String Y = X.getText();
	System.out.println(Y);
   }
	}
}

