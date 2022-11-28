package multiple;

public class TestMultiple {
	public static void main(String[] args) {
		Suma suma=new Suma(5, 5);
		
		OperacionesAritmeticas oa=new Suma(10, 5);
		Operaciones o=new Suma(3,2);
		o.mensajes();
		System.out.println("Objeto oa: "+oa.suma());
		
		
		System.out.println("La suma es: "+suma.suma());
		suma.mensajes();
	}
}
