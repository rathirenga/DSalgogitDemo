package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import Configuration.Config;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public static WebDriver driver;

	@BeforeSuite
	
		public static void InitializeDriver() {

		System.out.println("Started herere 11111111111111");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get(Config.URL);
		driver.findElement(By.linkText("Get Started")).click();
		System.out.println("Started herere 333333333333333333333");
		
		
	}
	
}
