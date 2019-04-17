package br.gov.serpro.combustivel;

public class PrecoCombustivelDuble implements PrecoCombustivel{

	@Override
	public double obterPrecoCombustivel(String siglaCombustivel) {
		double preco;
		
		if(siglaCombustivel.equals("Etanol")) {
			preco = 7.00;
		}else {
			preco = 10.00;
		}
		return preco;
	}
}
