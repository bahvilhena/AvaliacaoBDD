package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class PageObjectPesquisa {
	
	public static void busca_positivo(WebDriver driver) throws Exception {
		
		String mouse = "mouse" + Keys.ENTER; 
		
		HomePage.busca_produto(driver).sendKeys(mouse);
		driver.findElement(By.id("29")).click();
		//assertTrue(driver.findElement(By.id("29")).isEnabled());
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bunny")));
		
}
	
public static void busca_negativo(WebDriver driver) throws Exception {
		
		String produto_ind = "KingstonMouse" + Keys.ENTER;
		
		HomePage.busca_produto(driver).sendKeys(produto_ind);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("virtualFooter")));
		//assertTrue(driver.getPageSource().contains("No results for"));
}
	
	}

