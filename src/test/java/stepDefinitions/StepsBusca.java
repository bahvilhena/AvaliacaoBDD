package stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Screenshoot;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageObjects.DriverFactory;
import pageObjects.PageObjectBusca;


public class StepsBusca {
	
	WebDriver driver;
	PageObjectBusca page;

	@Dado("^que entro na home inicial$")
	public void que_entro_na_home_inicial() throws Throwable {
	  
		driver= DriverFactory.inicializarChromeProdutos();
		page = PageFactory.initElements(driver, PageObjectBusca.class);
	}

	@Quando("^clico no produto com sucesso$")
	public void clico_no_produto_com_sucesso() throws Throwable {
	 page.categoria();	
	}

	@Entao("^localizarar o produto$")
	public void localizarar_o_produto() throws Throwable {
	    page.clicaProduto();
	   String produtocerto =driver.getCurrentUrl();
	    Assert.assertEquals("https://www.advantageonlineshopping.com/#/product/32", produtocerto);
	    WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("save_to_cart")));
	    Screenshoot.getScreenshot(driver);
	}

	@Entao("^nao achara o produto$")
	public void nao_achara_o_produto() throws Throwable {
	page.clicaDetalhe();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mainImg")));
	Assert.assertTrue(driver.getPageSource().contains("Introducing the next generation"));
Screenshoot.getScreenshot(driver);
	}
	
}
