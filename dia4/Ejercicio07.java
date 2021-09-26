package dia4;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);
		
		HashMap<String,String> paisCapital = new HashMap<String,String>();
		
		paisCapital.put("España", "Madrid");
		paisCapital.put("Chile", "Santiago de Chile");
		paisCapital.put("Francia", "Paris");
		paisCapital.put("Alemania", "Berlín");
		
		for (String i : paisCapital.keySet()) {
			System.out.println("País: " + i);
			System.out.println("Capital: " + paisCapital.get(i));
			System.out.println("");
		}
		
		
		int busqueda;
		System.out.println("¿Desea buscar la capital de algún país?");
		System.out.println("\n[1] - Buscar pais");
		System.out.println("[0] - Para salir");
		
		
			busqueda = teclado.nextInt();
		while (busqueda == 1) {
			for (String i : paisCapital.keySet()) {
				System.out.println("Clave: " + i);
			}
			System.out.println("");
			System.out.println("Elija la clave del país cuya capital desee buscar.");
			String clave = teclado.next();
			System.out.println("");
			System.out.println("Capital: " + paisCapital.get(clave));
			System.out.println("");
			System.out.println("¿Desea hacer una nueva búsqueda?");
			System.out.println("[1] - Nueva busqueda");
			System.out.println("[0] - Para salir");
			busqueda = teclado.nextInt();
		
	}
}
}
