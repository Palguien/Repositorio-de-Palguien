package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class basicArrayList {
	public static void main(String[] args) {
		
		int[] staticList = new int[5];
		
		ArrayList dynamic = new ArrayList();
		Scanner keyBoard = new Scanner(System.in);
		int count=0;
		//ask data for vector
		
//		while(staticList.length>count) {
//			System.out.println("give me a number");
//			staticList[count]=keyBoard.nextInt();
//			count++;
//		}
		System.out.println("-----");
		//ask data for ArrayList
		int aux=0;
		while(true) {
			System.out.println("give me a number (anything else stops)");
			try {
				aux=keyBoard.nextInt();
				dynamic.add(aux);
			}catch(Exception e) {
				break;
			}
		}
//		System.out.println("--Vector--");
//		//print
//		for (int i = 0; i < staticList.length; i++) {
//			System.out.println(staticList[i]);
//		}
		System.out.println("--Arraylist--");
		//print ArrayList
		for (int i = 0; i < dynamic.size(); i++) {
			System.out.print(dynamic.get(i)+" ");
		}
		keyBoard.close();
	}	
	
	

}
