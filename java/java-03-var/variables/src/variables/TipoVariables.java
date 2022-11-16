package variables;

public class TipoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte, short, int, long
		byte numeroB = 127;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor máximo " + Byte.MAX_VALUE);
		System.out.println("Valor mínimo " + Byte.MIN_VALUE);

		int entero = 5;
		System.out.println("\nTamaño de un entero en bytes " + Integer.BYTES);
		System.out.println("Tamaño " + Integer.SIZE);
		System.out.println("Tamaño minimo: " + Integer.MIN_VALUE);
		System.out.println("Tamaño máximo: " + Integer.MAX_VALUE);

		short pequeno = 1;
		System.out.println("\nTamaño de un short en bytes " + Short.BYTES);
		System.out.println("Tamaño " + Short.SIZE);
		System.out.println("Tamaño minimo: " + Short.MIN_VALUE);
		System.out.println("Tamaño máximo: " + Short.MAX_VALUE);

		long grande = 100;
		System.out.println("\nTamaño de un long en bytes " + Long.BYTES);
		System.out.println("Tamaño " + Long.SIZE);
		System.out.println("Tamaño minimo: " + Long.MIN_VALUE);
		System.out.println("Tamaño máximo: " + Long.MAX_VALUE);

		float flotante = 100F;
		System.out.println("\nTamaño de un flotante en bytes: " + Float.BYTES);
		System.out.println("Tamaño " + Float.SIZE);
		System.out.println("Tamaño minimo: " + Float.MIN_VALUE);
		System.out.println("Tamaño máximo: " + Float.MAX_VALUE);

		System.out.println("\nTamaño de un double en bytes: " + Double.BYTES);
		System.out.println("Tamaño " + Double.SIZE);
		System.out.println("Tamaño minimo: " + Double.MIN_VALUE);
		System.out.println("Tamaño máximo: " + Double.MAX_VALUE);
		var comaD = 1000.10D;
		System.out.println("\nEsta es la variable double: " + comaD);

		System.out.println("---boolean----");
		boolean estado = false;
		System.out.println("--->" + estado);

		if (estado) {
			System.out.println("---> soy verdadero");
		} else {
			System.out.println("---> soy falso");
		}

		var edad = 10;
		var adulto = edad >= 10;
		if (adulto) {
			System.out.println("---> la edad es mayor o igual a 10");
		} else {
			System.out.println("---> la edad es: " + edad);
		}
		
		var sistemNum = 0xffcc;
		System.out.println("--> :" + sistemNum);
		System.out.println(flotante);
		
		char caracter0 = "halo".charAt(2);
		char caracter1 = '\u0C6A';
		System.out.println(caracter0);
		System.out.println(caracter1);
	}
}
