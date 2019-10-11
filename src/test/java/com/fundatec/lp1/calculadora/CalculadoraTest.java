package com.fundatec.lp1.calculadora;

import org.junit.Assert;
import org.junit.Test;



public class CalculadoraTest {

	 @Test
	 public void deveTestarSoma() {
		 
		 Calculadora c = new Calculadora();
		    int resultado;
		    c.setNum1(1);
		    c.setNum2(2);
		    resultado = c.Soma();
		    Assert.assertEquals(3, resultado);
	 
	 }
	 
	 @Test
	 public void deveTestarSubtracao() {
		 
		 Calculadora c = new Calculadora();
		    int resultado;
		    c.setNum1(2);
		    c.setNum2(2);
		    resultado = c.Subtr();
		    Assert.assertEquals(0, resultado);
	 
	 }
	 
	 
	 @Test
	 public void deveTestarMultiplicacao() {
		 
		 Calculadora c = new Calculadora();
		    int resultado;
		    c.setNum1(2);
		    c.setNum2(2);
		    resultado = c.Multi();
		    Assert.assertEquals(4, resultado);
	 
	 }
	 
	 @Test
	 public void deveTestarDivicao() {

		 
		 Calculadora c = new Calculadora();
		    int resultado;
		    c.setNum1(4);
		    c.setNum2(2);
		    resultado = c.Divisao();
		    Assert.assertEquals(2, resultado);
	 
	 }
	 
	
}
