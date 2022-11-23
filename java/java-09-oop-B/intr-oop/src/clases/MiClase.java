package clases;

public class MiClase {
	int atributo1;
	private String atributo2;

	public MiClase() {
		
	}

	public MiClase(int atributo1, String atributo2) {
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
	}

	public void metodo() {
		MiClase obj=new MiClase();
		int n= obj.atributo1=235;
		String s=obj.atributo2="Hola";
		System.out.println("-->"+n);
		System.out.println("-->"+s);
		System.out.println(atributo1);
		System.out.println(atributo2);
	}

	double metodo1() {
		double a = 0.0;
		return a;
	}
}
