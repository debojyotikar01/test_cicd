package testcicd.testcicd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclass {
	
	@Test
	public void t() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91980\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.tutorialspoint.com/");
		
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
