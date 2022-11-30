package com.generation.pruebasUnitarias;

public class Main {

	public static void main(String[] args) {
		Calculadora cal=new Calculadora(true);
		System.out.println(cal.suma(2,2));
		System.out.println(cal.division(2,2));
		System.out.println(cal.division(2,0));
	}

}
