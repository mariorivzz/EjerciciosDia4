package dia4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 2.  Modificar el Ejercicio del cajero autom�tico y 
		 * crear diferentes clientes y cuentas asociadas 
		 * a esos clientes, utilizando listas de arreglos 
		 * */
		
		Scanner teclado = new Scanner(System.in);

		int anadir;
		String numeroCuenta;
		String titularCuenta;
		double saldoCuenta;
		double interesCuenta;
		
		List<Cuenta> listaClientes = new LinkedList<>();
		
		System.out.println("[1] - Para a�adir un nuevo cliente");
		System.out.println("[0] - Para salir");
		anadir = teclado.nextInt();
		
		while(anadir == 1) {
			System.out.println("Introduzca el n�mero de cuenta:");
			numeroCuenta = teclado.next();
			System.out.println("Introduzca el titular de la cuenta:");
			titularCuenta = teclado.next();
			System.out.println("Introduzca el saldo de la cuenta:");
			saldoCuenta = teclado.nextDouble();
			System.out.println("Introduzca el inter�s anual de la cuenta:");
			interesCuenta = teclado.nextFloat();
			
			listaClientes.add(new Cuenta(numeroCuenta,titularCuenta,saldoCuenta,interesCuenta));
			
			System.out.println("[1] - Para a�adir un nuevo cliente");
			System.out.println("[0] - Para salir");
			
			anadir = teclado.nextInt();
		}
		
		for (Cuenta cliente :listaClientes) {
			System.out.println("N�mero de cuenta: " + cliente.getNumeroCuenta());
			System.out.println("Titular de cuenta: " + cliente.getTitularCuenta());
			System.out.println("Saldo de cuenta: " + cliente.getSaldoCuenta());
			System.out.println("Inter�s anual de cuenta: " + cliente.getInteresCuenta());
		}
			
		teclado.close();
	}

}
