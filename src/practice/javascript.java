package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public interface javascript
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_96612yg6jw_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486387378181&hvpos=&hvnetw=g&hvrand=2861590347266601230&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062054&hvtargid=kwd-296458795081&hydadcr=14452_2154371&gclid=EAIaIQobChMIttze-qPP_AIVrplmAh0zVgWTEAAYASAAEgL4bPD_BwE");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for(int i=0;i<3;i++)
	{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
	}
	
	for(int j=0;j<3;j++)
	{
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
	}
}
}
