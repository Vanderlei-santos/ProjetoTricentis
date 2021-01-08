package projetotricentis;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SolicitaSeguroSteps {
	SolicitaSeguroPage solicitaseguro = new SolicitaSeguroPage();
	private String MARCA, MODELO, CILINDRO, DESMOTOR, FABRICACAO, ASSENTOS, DIRDIREITA, NUMASSENTOS, COMBUSTIVEL, CARGA, PESO, PRECOTAB, MATRICULA, MILHAGEMANUAL;
	private String NOME, SOBRENOME, NASCTO, GENERO, ENDERECO, PAIS, CEP, CIDADE, OCUPACAO, HOBIE, DOMINIO, CENARIO;
	private String INICIO, SOMASEGURO, BONUS, COBERTURA, OPCIONAIS, CARRORESERVA;
	private Integer OPCAO;
	private String EMAIL, TELEFONE, USUARIO, SENHA, CONFSENHA, COMENTARIO;
	
	@Given("^Que estou na pagina de solicitacao de seguro$")
	public void Que_estou_na_pagina_de_solicitacao_de_seguro() throws Throwable {		
		solicitaseguro.AcessarSite();
	}
	@When ("^Quando preencho os dados do veiculo$")
	public void preencho_os_dados_do_veiculo() throws Throwable {	
		MARCA = "Ford";
		DESMOTOR = "1.0";
		FABRICACAO = "01/01/2010";
		ASSENTOS = "2";
		COMBUSTIVEL = "Petrol";
		PRECOTAB = "23000";
		MATRICULA = "545545455";
		MILHAGEMANUAL = "4568";
		
		solicitaseguro.PreencherDadosVeiculo(MARCA, DESMOTOR, FABRICACAO, ASSENTOS, COMBUSTIVEL, PRECOTAB, MATRICULA, MILHAGEMANUAL);
		solicitaseguro.AvancarDadosVeiculo();
	}
	@And ("^E preencho os dados do seguro$")
	public void preencho_os_dados_do_seguro() throws Throwable {
		
		NOME = "jose";
		SOBRENOME = "sanches";
		NASCTO = "10/10/1980";
		GENERO = "Male";
		ENDERECO = "rua do teste";
		PAIS = "Brazil";
		CEP = "06341000";
		CIDADE = "Carapicuiba";
		OCUPACAO = "Employee";
		HOBIE = "Other";
		DOMINIO = "teste.com.br";
		solicitaseguro.PreencherDadosSeguro(NOME, SOBRENOME, NASCTO, GENERO, ENDERECO, PAIS, CEP, CIDADE, OCUPACAO, HOBIE, DOMINIO);
		solicitaseguro.AvancarDadosSeguro();
	}
	@And ("^E preencho os dados do produto$")
	public void preencho_os_dados_do_produto() throws Throwable {	
		
		INICIO = "10/01/2021";
		SOMASEGURO = "3.000.000,00";
		BONUS = "Super Bonus";
		COBERTURA = "Full Coverage";
		OPCIONAIS = "Euro Protection";
		CARRORESERVA = "Yes";
		solicitaseguro.PreencherDadosProduto(INICIO, SOMASEGURO, BONUS, COBERTURA, OPCIONAIS, CARRORESERVA);
		solicitaseguro.AvancarDadosProduto();
	}
	@And ("^E seleciono as opcoes de preco$")
	public void seleciono_as_opcoes_de_preco() throws Throwable {
		
		OPCAO = 2;
		solicitaseguro.SelecionaPreco(OPCAO);
		solicitaseguro.AvancarPreco();
	}
	@And ("^E envio a cotacao$")
	public void envio_a_cotacao() throws Throwable {	
		
		EMAIL = "teste@teste.com.br";
		TELEFONE = "5511999999999";
		USUARIO = "teste";
		SENHA = "Teste123";
		CONFSENHA = "Teste123";
		COMENTARIO = "teste";
		solicitaseguro.PreencherDadosPessoais(EMAIL, TELEFONE, USUARIO, SENHA, CONFSENHA, COMENTARIO);
		solicitaseguro.EnviarCotacao();
	}
	@Then ("^Visualizo mensagem email enviado com sucesso$")
	public void Visualizo_mensagem_email_enviado_com_sucesso() throws Throwable {		
		solicitaseguro.ValidaEnvio();
	}
	
	@Before
	public void iniciar(Scenario scenario) throws Exception {
		
		
	}

	@After
	public static void cleanup(Scenario scenario) throws Exception {
		
	}


}
