package entrevista;

public class MangosNaranjas {
	double mangos, naranjas = 0;
	double cajas = 0;

	public MangosNaranjas(double mangos, double naranjas) {
		this.mangos = mangos;
		this.naranjas = naranjas;
	};

	public void imprimir() {
		this.cajas = maximoComunDivisor(this.mangos, this.naranjas);
		int numeroMangos = (int) (mangos / cajas);
		int numeroNaranjas = (int) (naranjas / cajas);
		System.out.println("El numero de cajas es: " + this.cajas);
		System.out.println("Cada caja tiene " + numeroMangos + " mangos");
		System.out.println("Cada caja tiene " + numeroNaranjas + " naranjas");
	}
	
	public int cajas() {
		
		return 0;
	}

	public static double maximoComunDivisor(double mangos, double naranjas) {
		if (naranjas == 0)
			return mangos;
		return maximoComunDivisor(naranjas, mangos % naranjas);
	}

}
