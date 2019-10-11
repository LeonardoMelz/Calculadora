package com.fundatec.lp1.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void deveTestarSoma() {

		
		Calculo c = new Calculo();
		int resultado;
		resultado = c.Soma();
		Assert.assertEquals(6, resultado);

	}

	@Test
	public void deveTestarSubtracao() {

		
		Numero n = new Numero();
		n.setNum1(4);
		n.setNum2(2);
		Calculo c = new Calculo();
		int resultado;
		resultado = c.Subtr();
		Assert.assertEquals(2, resultado);

	}

	@Test
	public void deveTestarMultiplicacao() {

		Numero n = new Numero();
		n.setNum1(4);
		n.setNum2(2);
		Calculo c = new Calculo();
		int resultado;
		resultado = c.Multi();
		Assert.assertEquals(8, resultado);

	}

	@Test
	public void deveTestarDivicao() {

		Numero n = new Numero();
		n.setNum1(4);
		n.setNum2(2);
		Calculo c = new Calculo();
		int resultado;
		resultado = c.Divisao();
		Assert.assertEquals(2, resultado);

	}

}
