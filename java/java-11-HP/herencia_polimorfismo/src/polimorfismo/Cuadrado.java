package polimorfismo;

import java.util.Scanner;

public class Cuadrado extends FigurasGeometricas{
	
	Scanner s=new Scanner(System.in);
	private double lado;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado= lado*lado;
	}

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t Cuadrado");
		System.out.println("Introduzca el lado: ");
		lado=s.nextDouble();

	}

}
