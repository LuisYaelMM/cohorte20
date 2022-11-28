package herencia;

public class Hija extends Padre {

	private int edad;

	public Hija(String nombre, String domicilio, int edad) {
		super(nombre, domicilio);
		this.edad = edad;
		// TODO Auto-generated constructor stub

	}

	public void mostrarDatos() {
		System.out.println("El nombre es: " + nombre + " y el domicilio es: " + domicilio + " y la edad es: " + edad);
	}

	public void mostrarDatos(String apellido) {
		System.out.println("El nombre y apellido es: " + nombre + "" + apellido + " y el domicilio es: " + domicilio
				+ " y la edad es: " + edad);
	}

}
