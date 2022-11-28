package ejecutar_h;

import herencia.Hija;
import herencia.Padre;

public class EjecutarHerencia {
	public static void main(String[] args) {
		Padre p=new Padre("Juan", "Pachuca");
		p.mostrarDatos();
		Hija h=new Hija("Dora", "CDMX", 20);
		h.mostrarDatos();
		Hija h1=new Hija("Diego", "Tulancingo", 18);
		h1.mostrarDatos("Cruz");
	}
}
