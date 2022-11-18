package oop;

public class EjemploClases {

	static void cambio() {
		Tablas t = new Tablas();
		Menu menu = new Menu();

		SubMarino sm = new SubMarino();
		int opcion = 0;
		do {
			opcion = menu.menuOP();
			switch (opcion) {
			case 1: {
				t.tabla();
				break;
			}
			case 2: {
				sm.subMenu();
				break;
			}
			default:

			}
		} while (opcion != 7);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cambio();

	}

}
