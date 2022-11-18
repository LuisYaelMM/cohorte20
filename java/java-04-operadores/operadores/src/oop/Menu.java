package oop;

import java.util.Scanner;

public class Menu {
	Scanner s = new Scanner(System.in);

	int menuOP() {
		int numero;
		System.out.println("Selecciona la opción a realizar:");
		System.out.println("1: Tablas de multiplicar");
		System.out.println("2: Operaciones artimeticas");
		System.out.println("3: Multiplicacion");
		System.out.println("4: Division");
		System.out.println("5: Residuo");
		System.out.println("6: Salir");
		return numero = s.nextInt();

	}

	int subMenuOP() {
		int numero;
		System.out.println("\t\t---Menu operaciones aritmeticas---:");
		System.out.println("\t\t1:Suma");
		System.out.println("\t\t2: Resta");
		System.out.println("\t\t3:Multiplicacion");
		System.out.println("\t\t4:Division");
		System.out.println("\t\t5:Modulo");
		System.out.println("\t\t6:Booleans");
		System.out.println("\t\t7:Salir");
		System.out.println("Introduzca la opcion: ");
		return numero = s.nextInt();

	}

}
