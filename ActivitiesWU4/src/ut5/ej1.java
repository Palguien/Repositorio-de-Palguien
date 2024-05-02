package ut5;
import java.util.Scanner;
/*Escribe un programa que pida al usuario 4 números enteros y los almacene en un vector. 
 * Después, debes mostrar esos números por pantalla.
 */
public class ej1 {

	public static void main(String[] args) {
		int vector[] = new int[4];
		int num;
		Scanner keyboard = new Scanner(System.in);
		
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
