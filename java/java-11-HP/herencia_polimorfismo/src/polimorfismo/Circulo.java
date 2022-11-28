package polimorfismo;

import java.util.Scanner;

public class Circulo extends FigurasGeometricas{
	Scanner s=new Scanner(System.in);
	private double radio;
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t Circulo");
		System.out.println("Introduzca el radio: ");
		radio=s.nextDouble();
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado=Math.pow(radio, 2)*Math.PI;
		
	}

}
