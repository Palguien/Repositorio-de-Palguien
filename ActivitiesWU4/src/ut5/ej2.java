package ut5;

import java.util.Scanner;

/* Escribe el mismo programa que antes pero ahora el tamaño del vector lo determina un número
 *  N (QUE DEBE SER MAYOR QUE 1) que le pedimos al usuario.
 */
public class ej2 {

	public static void main(String[] args) {
		int vectorSize;
		int num;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input size:");
		vectorSize=keyboard.nextInt();
		int vector[] = new int[vectorSize];
		
		for(int i=0;i<vector.length;i++) {
			System.out.println("Input int:");
			num=keyboard.nextInt();
			vector[i]=num;
		}
		keyboard.close();
		
		System.out.println("Vector:");
		for(int i=0;i<vector.length;i++) {
			System.out.println(i+1+")"+vector[i]);
			
		}

	}

}
