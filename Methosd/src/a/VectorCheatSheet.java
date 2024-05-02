package a;

import java.util.Scanner;

/*
 * Calculate Average of all values, maximum and minimum within the vector 
 */
public class VectorCheatSheet {
	static int vector[] = new int[6];

	public static void main(String args[]) {

		//int vector[] = { 5, 3, 10};
		System.out.println("Give me the values ["+vector.length+" numbers required]");
		fillingArray();

		System.out.println("the total is: " + total(vector));
		System.out.println("the average is: " + (average(vector)));
		System.out.println("Maximum value is: " + (max(vector)));
		System.out.println("Minimum value is: " + (min(vector)));
	}
	/**
	 * Asks the user for values until the vector is filled
	 */
	public static void fillingArray() {
		Scanner keyBoard = new Scanner(System.in);
		// Filling the vector asking the user
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Give me " + i + " position value");
			vector[i] = keyBoard.nextInt();
		}
		keyBoard.close();
	}
	/**
	 * Calculates the minimum value in the vector
	 * 
	 * @param vector	the vector that we calculate the minimum from
	 * @return min		the minimum of the vector
	 */
	public static int min(int[] vector) {
		int min = vector[0];
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < min) {
				min=vector[i];
			}
		}
		return min;
	}
	/**
	 * Calculates the maximum value in the vector
	 * 
	 * @param vector	the vector that we calculate the maximum from
	 * @return max		the maximum of the vector
	 */
	public static int max(int[] vector) {
		int max = vector[0];
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > max) {
				max=vector[i];
			}
		}
		return max;
	}
	/**
	 * Calculates the total of the values in the vector
	 * 
	 * @param vector	the vector that we calculate the total from
	 * @return total	the total of the vector
	 */
	public static int total(int[] vector) {
		int total = 0;
		for (int i = 0; i < vector.length; i++) {
			total=total+vector[i];
		}
		return total;
	}
	/**
	 * Calculates the average of the values in the vector
	 * 
	 * @param vector	the vector that we calculate the average from
	 * @return average	the average of the vector
	 */
	public static float average(int[] vector) {
		float average = (float)total(vector)/(float)vector.length;
		return average;
	}

}
