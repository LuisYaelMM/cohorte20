package oop;

public class SubMarino {
	// main temporal
	void subMenu() {
		Menu m = new Menu();
		int opcion = 0;
		OperacionesArtimeticas oa = new OperacionesArtimeticas();
		do {
			opcion = m.subMenuOP();
			switch (opcion) {
			case 1:
				System.out.println(oa.suma());
				break;

			case 2:
				System.out.println(oa.resta());
				break;

			case 3:
				System.out.println(oa.multiplicacion());
				break;
			case 4:
				System.out.println(oa.division());
				break;
			case 5:
				System.out.println(oa.residuo());
				break;
			case 6:
				System.out.println("Soy el caso 6");
				break;
			case 7:
				System.out.println("Vuelve pronto");
				break;
			default:
				System.out.println("Opcion invalida");
				break;
			}

		} while (opcion != 7);

	}
}
