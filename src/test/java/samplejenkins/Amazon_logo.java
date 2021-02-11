package samplejenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_logo {
	
	@Test

	public void TestAMZ() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\avsub\\Downloads\\chromedriver_87\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		boolean logo =driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).isDisplayed();

		System.out.println("logo display is:"+logo);
		
	}

}



