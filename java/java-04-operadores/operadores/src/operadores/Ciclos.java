package operadores;

import java.util.Scanner;

public class Ciclos {
	
	 void saludo() {
		System.out.println("Hola a las funciones en java.");
	}
	 
	 
	 int operacion() {
		 int f=(int) Math.pow(3, 2);
		 return f;
	 }
	 
	  static float nuevo() {
		 return 0;
	 }
	 
	 String caracteres() {
		 String nombre="Cadena";
		 return nombre;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ciclos objC;
		objC=new Ciclos();
		objC.saludo();
		System.out.println("Uso de pow "+objC.operacion());
		nuevo();
		int tabla=2;
		var scanner=new Scanner(System.in);
		System.out.println("¿De qué numero quieres la tabla de multiplicar?");
		tabla=scanner.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.println(tabla+"*"+i+"="+tabla*i);
		}
		int j=0;
		System.out.println("¿De qué numero quieres la otra tabla de multiplicar?");
		int tablaW=3;
		tablaW=scanner.nextInt();
		while (j<=10) {
			System.out.println(tablaW+"*"+j+"="+(tablaW*j));
			j++;
		}
	}

}
