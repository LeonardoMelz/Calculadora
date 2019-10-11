package com.fundatec.lp1.calculadora;

import java.util.Scanner;

public class Calculadora {
	Scanner input = new Scanner(System.in);

	public static void main(final String[] args) {
		Calculo c = new Calculo();
		int resultado;
		c.setNum1(4);
		c.setNum2(2);
		resultado = c.Soma();
		System.out.println(resultado);
		resultado = c.Divisao();
		System.out.println(resultado);
		resultado = c.Multi();
		System.out.println(resultado);
		resultado = c.Subtr();
		System.out.println(resultado);

	}
}
