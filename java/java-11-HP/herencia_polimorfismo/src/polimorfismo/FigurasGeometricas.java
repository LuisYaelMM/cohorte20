package polimorfismo;

public abstract class FigurasGeometricas {
	protected double pValor;
	protected double sValor;
	protected double resultado;
	//Scanner s;

	public abstract void pedirDatos();

	public abstract void area();

	public void visualizar() {
		System.out.println("El resultado es: " + resultado);

	}
}
