package br.gov.serpro.combustivel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CompararPrecoCombustivelTest 
{
    /** primeiro teste unitário **/
    @Test
    public void testEscolherEntreEtanolEGasolina() {
    	ComparadorPrecoCombustivel comparadorPrecoCombustivel = new ComparadorPrecoCombustivel();
    	
    	Assert.assertEquals("Comprar Etanol", comparadorPrecoCombustivel.resultadoComparacao());
    }
}
