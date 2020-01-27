package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import pageObjects.DriverFactory;
import pageObjects.PageObjectPesquisa;

public class stepPesquisa {

	PageObjectPesquisa pageobjectpesquisa;
	
	public static WebDriver driver;
	
	@Dado("^que entro na pagina inicial$")
	public void que_entro_na_pagina_inicial() throws Throwable {
		
		driver = DriverFactory.inicializarChromeProdutos();
		
	}

	@Quando("^pesquiso o produto$")
	public void pesquiso_o_produto() throws Throwable {
	    
		pageobjectpesquisa.busca_positivo(driver);
		
	}

	@Quando("^localizo com sucesso$")
	public void localizo_com_sucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^não localizo o produto$")
	public void não_localizo_o_produto() throws Throwable {
	pageobjectpesquisa.busca_negativo(driver);
	}

	
}
