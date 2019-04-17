package br.gov.serpro.combustivel;

import java.util.Random;

public class PrecoCombustivelRandomico implements PrecoCombustivel{

	@Override
	public double obterPrecoCombustivel(String siglaCombustivel) {
		Random randomNumber = new Random();
		
		boolean ocorreuErro = (randomNumber.nextInt(100) == 0);

	    if (ocorreuErro) {
	       throw new IntegracaoConsultaCombustivelIndisponivelException("999", "Problema na chamada do serviço de comparação de preços");
	    }

	    randomNumber = new Random();
	    return 10 * randomNumber.nextDouble();
	}
}
