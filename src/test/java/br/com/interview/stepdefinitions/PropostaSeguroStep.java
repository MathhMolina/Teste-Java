package br.com.interview.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.interview.pages.CadastroPropostaSeguroPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PropostaSeguroStep {
	
	private WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.close();
    }

	
	@Dado("que estou na pagina de cadastro da proposta de seguro")
	public void queEstouNaPaginaDeCadastroDaPropostaDeSeguro() {
	    driver.get("http://sampleapp.tricentis.com/101/app.php");
	}
	
	@Quando("preencho todos os formulários corretamente")
	public void preenchoTodosOsFormuláriosCorretamente() {
		CadastroPropostaSeguroPage cadastroPropostaSeguroPage = new CadastroPropostaSeguroPage(driver);		
		cadastroPropostaSeguroPage.preencherAbaEnterVehicleData();
		cadastroPropostaSeguroPage.preencherAbaEnterInsurantData();
		cadastroPropostaSeguroPage.preencherAbaEnterProductData();
		cadastroPropostaSeguroPage.preenchePriceOption("Ultimate");
		cadastroPropostaSeguroPage.clicarNext();
		cadastroPropostaSeguroPage.preencherAbaSendQuote();
		cadastroPropostaSeguroPage.clicarSend();
	}
	
	@Então("vejo a mensagem {string}")
	public void vejoAMensagemSendingEMailSuccess(String mensagem) {
		CadastroPropostaSeguroPage cadastroPropostaSeguroPage = new CadastroPropostaSeguroPage(driver);	
	    WebElement alerta =  cadastroPropostaSeguroPage.buscarTextoAlerta();
	    Assert.assertEquals(mensagem, alerta.getText());
	}
}
