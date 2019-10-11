package com.fundatec.lp1.calculadora;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	int resultado;
	
	@Before
	public void stup() {
		Numero n = new Numero();
		n.setNum1(4);
		n.setNum2(2);
	}

	@Test
	public void deveTestarSoma() {
		Calculo c = new Calculo();
		resultado = c.Soma();
		Assert.assertEquals(6, resultado);

	}

	@Test
	public void deveTestarSubtracao() {
		Calculo c = new Calculo();
		resultado = c.Subtr();
		Assert.assertEquals(2, resultado);

	}

	@Test
	public void deveTestarMultiplicacao() {
		Calculo c = new Calculo();
		resultado = c.Multi();
		Assert.assertEquals(8, resultado);

	}

	@Test
	public void deveTestarDivicao() {
		Calculo c = new Calculo();
		resultado = c.Divisao();
		Assert.assertEquals(2, resultado);

	}

}
