package br.gov.serpro.combustivel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComparadorPrecoCombustivelTest {
	PrecoCombustivelDuble precoCombustivel;
	
	@Before
	public void inicializarTeste() {
		precoCombustivel = new PrecoCombustivelDuble();
	}
	
    /** primeiro teste unitário **/
    @Test
    public void testEscolherEntreEtanolEGasolina() {
    	ComparadorPrecoCombustivel comparadorPrecoCombustivel = new ComparadorPrecoCombustivel(precoCombustivel);
    	
    	Assert.assertEquals("Comprar Etanol", comparadorPrecoCombustivel.resultadoComparacao());
    }
}
