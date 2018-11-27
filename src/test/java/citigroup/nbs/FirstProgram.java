package citigroup.nbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstProgram {
	@Test
	public void sample() {
		System.setProperty("webdriver.chrome.driver", ".//Resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.close();
		driver.quit();
	}

}
