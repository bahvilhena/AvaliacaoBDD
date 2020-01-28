package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class DriverFactory {

	static WebDriver driver;

	public static WebDriver inicializarChromeCadastro() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", HomePage.novaconta(driver));

		{
			return driver;

		}

	}

	public static WebDriver inicializarChromeProdutos() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com/");
		driver.manage().window().maximize();
		if (driver == null) {
			driver = new ChromeDriver();
		}

		{
			return driver;

		}
	}
	
	public static WebDriver inicializarChromeBusca() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com/");
		driver.manage().window().maximize();
		if (driver == null) {
			driver = new ChromeDriver();
		}

		{
			return driver;

		}
	}
}