package br.com.interview.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty",
		features = "src/test/resources/features/PropostaSeguro.feature",
		glue = "br.com.interview.stepdefinitions",
		snippets = CucumberOptions.SnippetType.CAMELCASE,
		monochrome = true,
		tags = "@CadastroSeguroComSucesso"
		)
public class PropostaSeguroRunner {

}
