package testing_scripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitimelogin_refresh_clickonlogin 
{
@Test
public void test() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://localhost/login.do");
	WebElement ele1=driver.findElement(By.xpath("//div[.='Login']"));
	ele1.click();
     Thread.sleep(2000);

	driver.navigate().refresh();
	Thread.sleep(2000);
	ele1.click();
}
}