package ejecutar;

import clases.Animal;
import clases.MiClase;

public class Principal {

	public static void main(String[] luis) {
		// TODO Auto-generated method stub
		MiClase mc=new MiClase(12455,"adios");
		mc.metodo();
		
		Animal miAnimal=new Animal("Falco");
		miAnimal.setEdad(3);
		System.out.println("El nombre es: "+miAnimal.getNombre());
		System.out.println(" y tiene "+miAnimal.getEdad()+" años");

	}

}
