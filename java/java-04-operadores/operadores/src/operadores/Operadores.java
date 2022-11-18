package operadores;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// System.out.println("--Da un dato--");
		// String dato = scanner.nextLine();
		// System.out.println("El dato es: " + dato);

		int valor = 6;
		int valor0 = 5;

//		System.out.print("Introduce el primer numero: ");
//		valor = scanner.nextInt();
//		System.out.print("Introduce el segundo numero: ");
//		valor0 = scanner.nextInt();
//		int suma = valor + valor0;
//		System.out.println("Suma: " + suma);
//		int resta = valor - valor0;
//		System.out.println("Resta: " + resta);
//		int multiplicacion = valor * valor0;
//		System.out.println("Producto: " + multiplicacion);
//		if (valor0 != 0) {
//			double division = Double.valueOf(valor) / Double.valueOf(valor0);
//			System.out.println("Division: " + division);
//		} else {
//			System.out.println("El denominador es 0.");
//		}
//
//		if (valor0 != 0) {
//			int modulo = valor % valor0;
//			if (valor % 2 == 0) {
//				System.out.println("Es un numero par.");
//			} else {
//				System.out.println("No es un numero par.");
//			}
//			System.out.println("Residuo: " + modulo);
//
//		} else {
//			System.out.println("El denominador es 0.");
//		}
//
//		int a = 3;
//		int b = 5;
//		boolean comparar = a >= b;
//		boolean logica=true;
//		if (comparar || !logica) {
//			System.out.println("Hola si soy verdadero.");
//			System.out.println("Comparar: "+comparar);
//		}else {
//			System.out.println(comparar);
//			System.out.println(logica);
//		}

		

		

		int i = 0;
		int menu=0;
		do {
			System.out.print("Introduce el primer numero: ");
			valor = scanner.nextInt();
			System.out.print("Introduce el segundo numero: ");
			valor0 = scanner.nextInt();
			
			menu = scanner.nextInt();
			switch (menu) {
			case 1: {

				System.out.println("La suma es:" + (valor + valor0));
				break;
			}
			case 2: {
				System.out.println("La resta es: " + (valor - valor0));
				break;
			}
			case 3: {
				System.out.println("La multiplicacion es: " + (valor * valor0));
				break;
			}
			case 4:
				if (valor0 != 0) {
					double division = Double.valueOf(valor) / Double.valueOf(valor0);
					System.out.println("La division es: " + division);
				} else {
					System.out.println("El denominador es 0.");
				}
				break;
			case 5: {
				System.out.println("El residuo es: " + (valor % valor0));
				break;
			}
			case 6:{
				System.out.println("Vuelve pronto");
				break;
			}
			default: {
				System.out.println("No existe esa opcion");
				break;
			}
			}
		} while (menu!=6);
	}

}
