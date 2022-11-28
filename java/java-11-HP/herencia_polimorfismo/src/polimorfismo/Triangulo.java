package polimorfismo;

import java.util.Scanner;

public class Triangulo extends FigurasGeometricas {
	
	Scanner s=new Scanner(System.in);
	private double base;
	private double altura;

	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado = (base * altura) / 2;

	}

	@Override
	public void pedirDatos() {
		System.out.println("\t\t\t Triangulo");
		System.out.println("Introduzca la base: ");
		base=s.nextDouble();
		System.out.println("Introduzca la altura: ");
		altura=s.nextDouble();

	}

	public void visualizar() {
		System.out.println("El resultado es: " + resultado);
	}

}
