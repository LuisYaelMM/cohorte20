package ejercicio9;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String palabra;
		HashMap<String, String> diccionario=new HashMap<>();
		
		diccionario.put("gato", "cat");
		diccionario.put("perro", "dog");
		diccionario.put("hora", "hour");
		diccionario.put("impuesto", "tax");
		diccionario.put("fuego", "fire");
		diccionario.put("viveres", "groceries");
		diccionario.put("pasillo", "alley");
		diccionario.put("herreria", "smithey");
		diccionario.put("cascaron", "shell");
		diccionario.put("huevo", "egg");
		diccionario.put("berenjena", "eggplant");
		diccionario.put("capa", "cloak");
		diccionario.put("carrera", "race");
		diccionario.put("hielo", "ice");
		diccionario.put("cazar", "hunt");
		diccionario.put("camisa", "shirt");
		diccionario.put("farmacia", "drugstore");
		diccionario.put("corazon", "heart");
		diccionario.put("ventana", "window");
		diccionario.put("tijeras", "scissors");
		
		System.out.println("Introduce la palabra en español:");
		palabra=in.nextLine().toLowerCase();
		if (diccionario.containsKey(palabra)) {
			System.out.println(diccionario.get(palabra));
		} else {
			System.out.println("La palabra no se encuentra en el diccionario.");
		}
		
	}
}
