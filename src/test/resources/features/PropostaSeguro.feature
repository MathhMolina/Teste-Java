# language: pt

	Funcionalidade: Solicitação de seguro
		Sendo um usuario do sistema
		Posso preencher o formulario com os dados necessarios
		Para solicitar uma proposta de seguro
		
		@CadastroSeguroComSucesso
		Cenário: Cadastro com sucesso
			Dado que estou na pagina de cadastro da proposta de seguro
			Quando preencho todos os formulários corretamente
			Então vejo a mensagem "Sending e-mail success!"