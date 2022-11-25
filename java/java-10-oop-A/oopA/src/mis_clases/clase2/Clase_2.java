package mis_clases.clase2;

public class Clase_2 extends ClasePadre{
	
	private String dato1;
	
	public Clase_2(int valor0, String dato0, String dato1) {
		super(valor0, dato0);
		this.dato1=dato1;
		// TODO Auto-generated constructor stub
	}
	public void visualizar2() {
		System.out.println(dato1);
	}

}
