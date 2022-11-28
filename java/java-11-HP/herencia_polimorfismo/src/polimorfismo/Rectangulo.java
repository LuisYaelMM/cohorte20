package polimorfismo;

import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas {
	Scanner s = new Scanner(System.in);
	private double base;
	private double altura;

	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado = base * altura;
	}

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t Rectangulo");
		System.out.println("Introduzca la base: ");
		base = s.nextDouble();
		System.out.println("Introduzca la altura: ");
		altura = s.nextDouble();

	}
}
