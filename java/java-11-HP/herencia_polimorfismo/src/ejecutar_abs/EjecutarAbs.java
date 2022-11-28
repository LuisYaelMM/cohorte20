package ejecutar_abs;

import polimorfismo.*;

public class EjecutarAbs {
	public static void main(String[] args) {
		FigurasGeometricas t=new Triangulo();
		FigurasGeometricas c=new Cuadrado();
		FigurasGeometricas r=new Rectangulo();
		t.pedirDatos();
		t.area();
		t.visualizar();
		
		c.pedirDatos();
		c.area();
		c.visualizar();
		
		r.pedirDatos();
		r.area();
		r.visualizar();
		 
		
	}
}
