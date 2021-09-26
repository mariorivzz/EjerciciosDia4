package dia4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
	
		//Pedir 2 fechas por teclado y decir cual es mayor
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la primera fecha: Dia/Mes/Año");
		String fecha1 = entrada.nextLine();
		System.out.println("Imprime la segunda fecha en formato día/mes/año");
		String fecha2 = entrada.nextLine();
		DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld1 = LocalDate.parse(fecha1, formateo);
		LocalDate ld2 = LocalDate.parse(fecha2, formateo);
		
		if(ld1.isAfter(ld2)) {
			System.out.println("La fecha " + ld1.format(formateo) + " es más grande que la fecha " + ld2.format(formateo));
		} else {
			if (ld1.isBefore(ld2)) {
				System.out.println("La fecha " + ld2.format(formateo) + " es más grande que la fecha " + ld1.format(formateo));
			 } else {
				 System.out.println("Las dos fechas son iguales");
			 }
		}
		entrada.close();
		
	}
}
