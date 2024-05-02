package ut5;

import java.util.Scanner;

//fill a square table, asking the user for the size. 
//fill with consecutive numbers the table
public class AbrahamExe {
	public static void main(String[] args) {
		int size,cont;
		int matrix[][];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Size?");
		size=keyboard.nextInt();
		System.out.println("Starting number?");
		cont=keyboard.nextInt();
		matrix=new int[size][size];
		//fill matrix
		for (int i = 0; i < size; i++) {
			for (int j = 0; j <size; j++) {
				matrix[i][j]=cont;
				cont++;
			}
		}
		//read matrix
		System.out.print("Position in each line   ");
		for (int i = 0; i < size; i++) {
			System.out.print(i+"    ");
		}
		System.out.println("\n----------------------------------------------------------------------------------");
		for (int i = 0; i < size; i++) {
			System.out.print("Line number "+i+">>         ");
			for (int j = 0; j <size; j++) {
				System.out.print(matrix[i][j]);			
			}
			System.out.println();
		}
		keyboard.close();
	}

}
