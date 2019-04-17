package br.gov.serpro.combustivel;

public class ComparadorPrecoCombustivel {
	PrecoCombustivel precoCombustivel;
	
	ComparadorPrecoCombustivel(PrecoCombustivel precoCombustivel){
		this.precoCombustivel = precoCombustivel;
	}
	public String resultadoComparacao() {
		double precoEtanol = precoCombustivel.obterPrecoCombustivel("Etanol");
		double precoGasolina = precoCombustivel.obterPrecoCombustivel("Gasolina");
		if((precoEtanol / precoGasolina) <= 0.7) {
			return "Comprar Etanol";
		}else {
			return "Comprar Gasolina";
		}
	}
}
