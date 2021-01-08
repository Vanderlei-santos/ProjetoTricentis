@CT0001
Feature: Solicita seguro	
  Scenario: Validar solicitação de seguro veicular
		Given Que estou na pagina de solicitacao de seguro 
		When Quando preencho os dados do veiculo
		And E preencho os dados do seguro
		And E preencho os dados do produto
		And E seleciono as opcoes de preco
		And E envio a cotacao 
		Then Visualizo mensagem email enviado com sucesso