package dia4;

public class Ejercicio01 {
	
	//1.  Utilice la recursividad para sumar todos los números entre 7 y 15
	
	static int resultado = 0;
	
	public static int suma(int num) {
		
		if(num<=15) {
			resultado = suma(num+1)+num;
			return resultado;
		}else {
			return resultado;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println(suma(7));

	}

}
