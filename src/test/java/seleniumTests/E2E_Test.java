package seleniumTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E_Test {
	private static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\ToolsQA\\Libs\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com/#/");

		driver.navigate().to("https://www.advantageonlineshopping.com/#/register");

	
		Thread.sleep(5000);
		WebElement usuario = driver.findElement(By.name("usernameRegisterPage"));
		usuario.sendKeys("Lakshay");
		
		WebElement email = driver.findElement(By.name("emailRegisterPage"));
		email.sendKeys("Sharma@ovo.com");
		
		WebElement senha = driver.findElement(By.name("passwordRegisterPage"));
		senha.sendKeys("Abc123");
		
		WebElement senhaconfirma = driver.findElement(By.name("confirm_passwordRegisterPage"));
		senhaconfirma.sendKeys("Abc123");
				
		WebElement primeironome = driver.findElement(By.name("first_nameRegisterPage"));
		primeironome.sendKeys("07438862327");
		
		WebElement ultimonome = driver.findElement(By.name("last_nameRegisterPage"));
		ultimonome.sendKeys("07438862327");
		
		WebElement telefone = driver.findElement(By.name("phone_numberRegisterPage"));
		telefone.sendKeys("123456456");
		
		
		Select oSelect = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
		oSelect.selectByVisibleText("Brazil");
						
		WebElement cidade = driver.findElement(By.name("cityRegisterPage"));
		cidade.sendKeys("Delhi");
		
		WebElement endereco = driver.findElement(By.name("addressRegisterPage"));
		endereco.sendKeys("Shalimar Bagh");
		
		WebElement estado = driver.findElement(By.name("state_/_province_/_regionRegisterPage"));
		estado.sendKeys("110088");
		
		WebElement codigopostal = driver.findElement(By.name("postal_codeRegisterPage"));
		codigopostal.sendKeys("110088");
		
		WebElement aceite = driver.findElement(By.cssSelector("div#formCover > sec-view > div > input"));
		aceite.click();
		Thread.sleep(3000);
		
		List<WebElement> registra = driver.findElements(By.id("register_btnundefined"));
		registra.get(0).click();
		
		
		
		//driver.quit();

	}

}