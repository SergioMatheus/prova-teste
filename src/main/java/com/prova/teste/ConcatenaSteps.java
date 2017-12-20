package com.prova.teste;

import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConcatenaSteps {
	
	private WebDriver navegador;
	
	@BeforeScenario
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pichau\\Desktop\\Selenium\\chromedriver.exe");
		
		 navegador = new ChromeDriver();
		
		navegador.get("C:\\Users\\Pichau\\prova-teste\\src\\main\\java\\com\\prova\\teste\\NewFile.html");
	}
	
	
	@Given("usuario ira escrever nome em um campo e sobrenome em outro campo")
	public void concatenacao(){
		
		navegador.findElement(By.id("nome")).sendKeys("Claudio");
		navegador.findElement(By.id("sobrenome")).sendKeys("Neiva");
		
		
		
	}
	
	@When("ao clicar no botao unir os nomes")
	public void juncao(){
		navegador.findElement(By.id("botao")).click();
	}
	
	@Then("mostrar nome e sobrenome unidos que sera $nomeEsperado $sobrenomeEsperado")
	public void resposta(String nomeEsperado,String sobrenomeEsperado){
		String nomeSobrenomeEsperado=nomeEsperado+" "+sobrenomeEsperado;
		String nomeSobrenome= navegador.findElement(By.id("nomesobrenome")).getText();
		Assert.assertEquals(nomeSobrenomeEsperado, nomeSobrenome);
	}
}
