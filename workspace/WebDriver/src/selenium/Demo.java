package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "https://www.google.co.in";
		System.setProperty("webdriver.chrome.driver", "/Users/hadoop/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@title = 'Search']")).sendKeys("Hi");
		driver.findElement(By.xpath("//input[@value = 'Google Search']")).click();
		Thread.sleep(5000, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(5000, 10);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		System.out.println("current title is " + driver.getTitle());

	}

}
