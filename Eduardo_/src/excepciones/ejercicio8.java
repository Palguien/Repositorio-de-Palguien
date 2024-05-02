package excepciones;

import java.util.Scanner;
import java.util.*;


public class ejercicio8 {
	public static void main(String []args) {
		int numeros[]=new int[10];
		int i, posicion;
		Scanner entrada=new Scanner(System.in);
		for (i=0;i<numeros.length;i++)
			numeros[i]=i*2;
		
		System.out.println("Numeros: ");
		for (i=0;i<numeros.length;i++)
			System.out.println(numeros[i]+" ");
		
		System.out.println("\nGESTION de acceso al vector.");
		System.out.println("Inserte posición: ");
		posicion=entrada.nextInt();
		
		try {
			System.out.println("Dato de la posición " + posicion+ ": "+numeros[posicion]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error. No se puede acceder.");
		}
		catch (Exception exception) {//exception es el nombre que yo decido poner
			System.out.println("Error.");
		}			
	}
}