package ejercicio8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i < numero; i++)
            if (numero % i == 0)
                return false;
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		in.useDelimiter("\\D");
		ArrayList<Integer> listaOriginal = new ArrayList<>();
		ArrayList<Integer> listaPrimos = new ArrayList<>();
		ArrayList<Integer> listaOrdenada = new ArrayList<>();
		int a, b, c, d, e, f, g, h, i, j;
		System.out.println("Introduzca la lista de numeros delimitada por comas: ");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		e = in.nextInt();
		f = in.nextInt();
		g = in.nextInt();
		h = in.nextInt();
		i = in.nextInt();
		j = in.nextInt();
		listaOriginal.add(a);
		listaOriginal.add(b);
		listaOriginal.add(c);
		listaOriginal.add(d);
		listaOriginal.add(e);
		listaOriginal.add(f);
		listaOriginal.add(g);
		listaOriginal.add(h);
		listaOriginal.add(i);
		listaOriginal.add(j);
		listaPrimos = (ArrayList<Integer>) listaOriginal.clone();
		ListIterator<Integer> iterador=listaPrimos.listIterator();
		while (iterador.hasNext()) {
			Integer enteroTemporal=iterador.next();
			if (esPrimo(enteroTemporal)) {
				listaOrdenada.add(enteroTemporal);
				iterador.remove();
			}
		}
		System.out.println("Lista original:");
		for (int j2 = 0; j2 < listaOriginal.size(); j2++) {
			System.out.println(j2 + " - " + listaOriginal.get(j2));
		}
		listaOrdenada.addAll(listaPrimos);
		System.out.println("\nLista ordenada por primos al principio:");
		for (int j2 = 0; j2 < listaOrdenada.size(); j2++) {
			System.out.println(j2 + " - " + listaOrdenada.get(j2));
		}
	}
}
