package ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e=new Scanner(System.in);
		String dia;
		ArrayList<String> diasSemana=new ArrayList<String>();
		diasSemana.add("lunes");
		diasSemana.add("martes");
		diasSemana.add("miercoles");
		diasSemana.add("jueves");
		diasSemana.add("viernes");
		int horas;
		int minutos;
		int tiempoActual=0;
		int horaViernes=6660;
		do {
			System.out.println("Introduzca el dia de la semana: ");
			dia=e.nextLine().toLowerCase();
			if (!diasSemana.contains(dia)) {
				System.out.println("Introduzca un dia valido.");
			}
		} while (!diasSemana.contains(dia));
		do {
			System.out.println("Introduzca la hora: ");
			horas=e.nextInt();
			e.nextLine();
			if (horas<0||horas>23) {
				System.out.println("Introduzca una hora valida.");
			}
		} while (horas<0||horas>23);
		do {
			System.out.println("Introduzca los minutos: ");
			minutos=e.nextInt();
			e.nextLine();
			if (minutos<0||minutos>59) {
				System.out.println("Introduzca minutos validos.");
			}
		} while (minutos<0||minutos>59);
		
		switch (dia) {
		case "lunes":
			tiempoActual=0;
			break;
		case "martes":
			tiempoActual=1440;
			break;
		case "miercoles":
			tiempoActual=2880;
			break;
		case "jueves":
			tiempoActual=4320;
			break;
		case "viernes":
			tiempoActual=5760;
			break;

		default:
			break;
		}
		tiempoActual+=((horas*60)+minutos);
		int tiempoRestante=horaViernes-tiempoActual;
		if (tiempoRestante>0) {
			System.out.println("Faltan "+tiempoRestante+" minutos para el fin de semana");
		}else {
			System.out.println("¡Ya estas en el fin de semana!");
		}
		e.close();
		
		
	}

}
