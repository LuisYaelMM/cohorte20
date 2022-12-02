package entrevista;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double mangos, naranjas;
		System.out.println("Introduzca el numero de mangos: ");
		mangos=in.nextDouble();
		in.nextLine();
		System.out.println("Introduzca el numero de naranjas: ");
		naranjas=in.nextDouble();
		in.nextLine();
		MangosNaranjas obj=new MangosNaranjas(mangos , naranjas);
		obj.imprimir();
		in.close();

	}

}
