package excepciones;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[]args) {
		//División por letra
		/////////////////////////////////
		double dividendo, divisor=0, resultado;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduzca dividendo:");
		dividendo=entrada.nextDouble();
		
		try {
		System.out.println("Introduzca divisor:");
		divisor=entrada.nextDouble();
		}
		catch(Exception InputMismatchException) {
			System.out.println("Error. División por letra.");
			System.out.println(InputMismatchException.getLocalizedMessage());
		}
		
		resultado=dividendo/divisor;
		System.out.println("Resultado: " +resultado);
		
		}
}
