package br.gov.serpro.combustivel;

public class IntegracaoConsultaCombustivelIndisponivelException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	String erro;

	IntegracaoConsultaCombustivelIndisponivelException(String erro, String message){
		super(message);
		this.erro = erro;
	}
}
