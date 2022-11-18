package oop;

import java.util.Scanner;

public class OperacionesArtimeticas {
	Scanner s = new Scanner(System.in);

	double suma() {
		System.out.println("Introduce el primer numero a sumar:");
		double valor0 = s.nextDouble();
		System.out.println("Introduce el segundo numero a sumar:");
		double valor1 = s.nextDouble();
		return valor0 + valor1;
	}

	double resta() {
		System.out.println("Introduce el primer numero a restar:");
		double valor0 = s.nextDouble();
		System.out.println("Introduce el segundo numero a restar:");
		double valor1 = s.nextDouble();
		return valor0 - valor1;
	}

	double multiplicacion() {
		System.out.println("Introduce el primer numero a multiplicar:");
		double valor0 = s.nextDouble();
		System.out.println("Introduce el segundo numero a multiplicar:");
		double valor1 = s.nextDouble();
		return valor0 * valor1;
	}

	double division() {
		System.out.println("Introduce el primer numero a dividir:");
		double valor0 = s.nextDouble();
		System.out.println("Introduce el segundo numero a dividir:");
		double valor1 = s.nextDouble();
		if (valor1 == 0) {
			System.out.println("Error: el denominador no puede ser 0");
			return 0;
		} else {
			return valor0/valor1;
		}
	}

	double residuo() {
		System.out.println("Introduce el primer numero a dividir:");
		double valor0 = s.nextDouble();
		System.out.println("Introduce el segundo numero a dividir:");
		double valor1 = s.nextDouble();
		if (valor1 != 0) {
			return valor0 % valor1;
		} else {
			System.out.println("Error: el denominador no puede ser 0");
			return 0;
		}
	}
}
