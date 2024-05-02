package ut5;

import java.util.Scanner;

/*Escribe un programa que pida tantos nombres como el usuario indique al principio.
 * Visualiza dichos nombres en mayúsculas y ordenados de forma alfabética.
 */
public class ej14 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char matrix[][];
		String name;
		int numNombres, aux;
		char cadenaAux[]=new char[100];
		//Ask for number of names
		do {
			System.out.println("How many names will you enter");
			numNombres=keyboard.nextInt();
		}while(numNombres<1);
		keyboard.nextLine();
		matrix=new char[numNombres][100];
		//Fill matrix with names
		for (int i = 0; i < numNombres; i++) {
			System.out.println("Input name "+(i+1)+":");
			name=keyboard.nextLine();
			for (int j = 0; j < name.length(); j++) {
				matrix[i][j]=name.charAt(j);
				if(name.charAt(j)>='a' && name.charAt(j)<='z') {
					matrix[i][j]=(char) (name.charAt(j)-32);
				}else{
					matrix[i][j]=name.charAt(j);
				}
			}
		}
		keyboard.close();
		System.out.println();
		//Let's sort the FUCKING names
		for (int i = 1; i < numNombres; i++) {
			for(int j = i; j > 0; j--) {
				aux=0;
				while(matrix[j][aux]==matrix[j-1][aux] && aux<99) {
					aux++;
				}
				if(matrix[j][aux]<matrix[j-1][aux]) {
					cadenaAux=matrix[j-1];
					matrix[j-1]=matrix[j];
					matrix[j]=cadenaAux;
				}
			}
		}
		//Output
		for (int i = 0; i < numNombres; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();	
		}
	}

}
