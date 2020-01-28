package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import pageObjects.DriverFactory;
import pageObjects.PageObjectPesquisa;

public class StepsPesquisa {

	PageObjectPesquisa pageobjectpesquisa;
	
	public static WebDriver driver;
	
	@Dado("^que entro na pagina inicial$")
	public void que_entro_na_pagina_inicial() throws Throwable {
		
		driver = DriverFactory.inicializarChromeProdutos();
		
	}

	@Dado("^pesquiso o produto localizo com sucesso$")
	public void pesquiso_o_produto_localizo_com_sucesso() throws Throwable {
	 
	
	    
		pageobjectpesquisa.busca_positivo(driver);
		driver.quit();
		
	}

	

	@Dado("^pesquiso o produto não localizo o produto$")
	public void pesquiso_o_produto_não_localizo_o_produto() throws Throwable {
	  
	pageobjectpesquisa.busca_negativo(driver);
	driver.quit();
	}

	
}
