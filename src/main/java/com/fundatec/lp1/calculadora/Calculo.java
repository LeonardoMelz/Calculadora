package com.fundatec.lp1.calculadora;

public class Calculo {

	Numero n = new Numero();
	int num1 = n.setNum1(4);
	int num2 = n.setNum2(2);
	
	public int Soma() {
		return num1 + num2;
	}

	public int Subtr() {
		return num1 - num2;
	}

	public int Divisao() {
		return num1 / num2;
	}

	public int Multi() {
		return num1 * num2;
	}


}
