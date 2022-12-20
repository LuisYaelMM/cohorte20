package ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e=new Scanner(System.in);
		String palabra;
		String inversa="";
		System.out.println("Introduzca la palabra a invertir: ");
		palabra=e.nextLine();
		for (int i = 0; i < palabra.length(); i++) {
			inversa=palabra.charAt(i)+inversa;
		}
		System.out.println(inversa);
	}

}
