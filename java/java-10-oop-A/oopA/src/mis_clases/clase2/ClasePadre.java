package mis_clases.clase2;

public class ClasePadre {
	protected int valor0;
	protected String dato0;
	public ClasePadre(int valor0, String dato0) {
		this.valor0 = valor0;
		this.dato0 = dato0;
	}
	
	public void visualizar() {
		System.out.println(valor0);
		System.out.println(dato0);
	}
}
