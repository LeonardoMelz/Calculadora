package com.fundatec.lp1.calculadora;

public class Calculo {
	
	private int num1, num2;

	public void setNum1(final int NUM1) {
	    this.num1 = NUM1;
	}

	public int getNum1() {
	    return this.num1;
	}

	public void setNum2(final int NUM2) {
	    this.num2 = NUM2;
	}

	public int getNum2() {
	    return this.num2;
	}
	
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
