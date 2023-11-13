package testcicd.testcicd;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
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
		String s= driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		Actions act=new Actions(driver);
		WebElement ele =driver.findElement(By.xpath("//ul[@id=\"library-nav\"]/li/a[@title=\"Java Tutorial\"]"));
		act.moveToElement(ele).build().perform();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
