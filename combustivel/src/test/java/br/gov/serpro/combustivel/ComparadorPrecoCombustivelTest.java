package br.gov.serpro.combustivel;

import org.junit.Assert;
import org.junit.Test;

public class ComparadorPrecoCombustivelTest 
{
    /** primeiro teste unitário **/
    @Test
    public void testEscolherEntreEtanolEGasolina() {
    	ComparadorPrecoCombustivel comparadorPrecoCombustivel = new ComparadorPrecoCombustivel();
    	
    	Assert.assertEquals("Comprar Etanol", comparadorPrecoCombustivel.resultadoComparacao());
    }
}
