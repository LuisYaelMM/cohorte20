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
		
		Animal otroAnimal;
		otroAnimal=new Animal();
		otroAnimal.setNombre("Pulgas");
		otroAnimal.setEdad(5);
		
		System.out.println("El nuevo animal es: "+otroAnimal.getNombre());
		System.out.println("su edad es: "+otroAnimal.getEdad());

	}

}
