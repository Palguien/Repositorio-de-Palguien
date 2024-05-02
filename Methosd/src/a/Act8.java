package a;

import java.util.Scanner;

public class Act8 {

	public static void main(String[] args) {
		int[] vector=new int[6];
		int[] vector2=new int[6];
		System.out.println("Give me " + vector.length + " integers");
		vector2=fillingArray(vector.length);
		System.out.println("El mayor numero del vector es "+maxElement(vector));
		printVector(vector2,"vector 2");
		printVector(vector, "vector 1");
	}

	private static void printVector(int[] vector2, String text) {
		System.out.println(text);
		for (int i = 0; i < vector2.length; i++) {
			System.out.println(vector2[i]);
		}
	}
	
	/**
	 * Devuelve el mayor numero del vector
	 * @param vector
	 * @return max		mayor numero del vector
	 */
	private static int maxElement(int[] vector) {
		int max=vector[0];
		for (int i = 0; i < vector.length; i++) {
			if(vector[i]>max) {
				max=vector[i];
			}
		}
		return max;
	}

	/**
	 * Asks the user for values until the vector is filled
	 */
	public static int[] fillingArray(int length) {
		int[] array=new int[length];
		Scanner keyBoard = new Scanner(System.in);
		// Filling the vector asking the user
		for (int i = 0; i < array.length; i++) {
			array[i] = keyBoard.nextInt();
		}
		keyBoard.close();
		return array;
	}

}
