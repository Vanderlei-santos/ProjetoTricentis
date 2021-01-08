package projetotricentis;


import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


public class SolicitaSeguroPage extends SolicitaSeguroObjetosPagina{
	
	public void AcessarSite( ) throws Throwable {
		
		String strURL = "http://sampleapp.tricentis.com/101/app.php";
		
		URL url = new URL(strURL);
        URLConnection connection = url.openConnection();
		}

	public void PreencherDadosVeiculo(String MARCA, String DESMOTOR, String FABRICACAO, String ASSENTOS, 
			String COMBUSTIVEL,String PRECOTAB, String MATRICULA, 
			String MILHAGEMANUAL) throws Throwable {
		

        entervehicledata.click();
				
		try {
			Select cmbmarca = new Select(make);
			cmbmarca.selectByVisibleText(MARCA);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Marca'", false);
		}
		
		try {
			engineperformance.sendKeys(DESMOTOR);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Desempenho do motor'", false);
		}
		
		try {
			dateofmanufacture.sendKeys(FABRICACAO);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Data de fabricação'", false);
		}
		
		try {
			Select cmbassentos = new Select(numberofseats);
			cmbassentos.selectByVisibleText(ASSENTOS);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Direção à direita'", false);
		}
		
		
		try {
			Select cmbcombustivel = new Select(fuel);
			cmbcombustivel.selectByVisibleText(COMBUSTIVEL);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Número de assentos'", false);
		}
		
		try {
			listprice.sendKeys(PRECOTAB);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Preço de tabela'", false);
		}
		
		try {
			licenseplatenumber.sendKeys(MATRICULA);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Número da matrícula'", false);
		}
		
		try {
			annualmileage.sendKeys(MILHAGEMANUAL);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Milhagem anual'", false);
		}
		
	}
	
	public void AvancarDadosVeiculo( ) throws Throwable {
		try {
			nextenterinsurantdata.click();
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível clicar no botão 'Próximo'", false);
			
		}
	}

	public void PreencherDadosSeguro(String NOME, String SOBRENOME, String NASCTO, String GENERO, String ENDERECO, 
			String PAIS, String CEP, String CIDADE, String OCUPACAO, String HOBIE, String DOMINIO) throws Throwable  {
		
		enterinsurantdata.click();
		

		
		try {
			firstname.sendKeys(NOME);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Primeiro nome'", false);
		}
		
		try {
			lastname.sendKeys(SOBRENOME);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Último nome'", false);
		}
		
		try {
			birthdate.sendKeys(NASCTO);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Data de nascimento'", false);
		}
		
		try {
			if (GENERO == "masculino") {				
				gendermale.click();
			} else {
				genderfemale.click();
			}
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Gênero'", false);
		}
		
		try {
			streetaddress.sendKeys(ENDERECO);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Endereço'", false);
		}
		
		try {
			country.sendKeys(PAIS);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'País'", false);
		}
		
		try {
			zipcode.sendKeys(CEP);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'CEP'", false);
		}
		
		try {
			city.sendKeys(CIDADE);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Cidade'", false);
		}
		
		try {
			occupation.sendKeys(OCUPACAO);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Ocupação'", false);
		}
		
		try { // ajustar para listar hobbies
			if (HOBIE == "Excesso de velocidade") {				
				speeding.click();
			} else if (HOBIE == "Bungee jumping") {
				bungeejumping.click();
			} else if (HOBIE == "Queda livre") {
				cliffdiving.click();
			} else if (HOBIE == "Paraquedismo") {
				skydiving.click();
			} else if (HOBIE == "De outros") {
				other.click();
			}
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Hobbies'", false);
		}
		
		try {
			website.sendKeys(DOMINIO);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Domínio'", false);
		}
		
	}
	
	public void AvancarDadosSeguro( ) throws Throwable {
		try {
			nextenterproductdata.click();
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível clicar no botão 'Próximo'", false);
			
		}
	}
	
	public void PreencherDadosProduto(String INICIO, String SOMASEGURO, String BONUS, String COBERTURA, 
			String OPCIONAIS, String CARRORESERVA) throws Throwable  {
		
		try {
			startdate.sendKeys(INICIO);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Data de início'", false);
		}
		
		try {
			insurancesum.sendKeys(SOMASEGURO);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Soma do seguro'", false);
		}
		
		try {
			meritrating.sendKeys(BONUS);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Bônus'", false);
		}
		
		try {
			damageinsurance.sendKeys(COBERTURA);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Cobertura'", false);
		}
		
		if (OPCIONAIS == "Euro protection") {				
				EuroProtection.click();
		}
		if (OPCIONAIS == "Seguro defesa legal") {
			LegalDefenseInsurance.click();
		}
		
		try {
			Select cmbcarroreserva = new Select(courtesycar);
			cmbcarroreserva.selectByVisibleText(CARRORESERVA);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível selecionar a opção 'Carro reserva'", false);
		}
		
	}
	
	public void AvancarDadosProduto( ) throws Throwable {
		try {
			enterproductdata.click();
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível clicar no botão 'Próximo'", false);
			
		}
	}
	
	public void SelecionaPreco(Integer OPCAO) throws Throwable {
		
				
		switch(OPCAO) {
		case 1:
			selectsilver.click();
			break;
		case 2:
			selectgold.click();
			break;
		case 3:
			selectplatinum.click();
			break;
		case 4:
			selectultimate.click();
			break;
		}
	}
	
	public void AvancarPreco( ) throws Throwable {
		try {
			selectpriceoption.click();
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível clicar no botão 'Próximo'", false);
			
		}
	}
	
	public void PreencherDadosPessoais(String EMAIL, String TELEFONE, String USUARIO, String SENHA, String CONFSENHA, 
			String COMENTARIO) throws Throwable  {

		
		try {
			email.sendKeys(EMAIL);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Email'", false);
		}
		
		try {
			phone.sendKeys(TELEFONE);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Telefone'", false);
		}
		
		try {
			username.sendKeys(USUARIO);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Usuario'", false);
		}
		
		try {
			password.sendKeys(SENHA);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Senha'", false);
		}
		
		try {
			confirmpassword.sendKeys(CONFSENHA);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Confirme a senha'", false);
		}
		
		try {
			Comments.sendKeys(COMENTARIO);
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível preencher o campo 'Comentário'", false);
		}
	}
	
	public void EnviarCotacao( ) throws Throwable {
		try {
			sendemail.click();
		} catch (Exception e) {
			Assert.assertTrue("Não foi possível clicar no botão 'Enviar'", false);
			
		}
	}
	
	public void ValidaEnvio( ) throws Throwable {
//		
//		try {
//			msg.exist();
//			btnok.exist();
//			Assert.assertTrue("Cotação enviada com sucesso", true);
//		} catch (Exception e) {
//			Assert.assertTrue("Não foi possível preencher o campo 'Comentário'", false);
//		}
	}
}
