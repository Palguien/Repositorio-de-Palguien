package order;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		int originalVector[]= {5,9,12,2,7,3,23,-1,4,17,45};
		int sortVector[];
		int pos;
		
		sortVector=Arrays.copyOf(originalVector, originalVector.length);
		Arrays.sort(sortVector);
		pos=(Arrays.binarySearch(sortVector, 20));
		
		for (int i = 0; i < originalVector.length; i++) {
			System.out.print(originalVector[i]+",");
		}
		System.out.println();
		
		for (int i = 0; i < sortVector.length; i++) {
			System.out.print(sortVector[i]+",");
		}
		System.out.println();
		
		System.out.println(pos);

	}

}
