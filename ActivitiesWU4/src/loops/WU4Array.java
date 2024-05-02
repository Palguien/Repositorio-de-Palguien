package loops;
import java.util.Scanner;
//ArrayExample
public class WU4Array {
	public static void main(String[] args) {
		int num;
		final int LIM=10;
		int vector[] = new int[LIM]; 
		int ages[] = {1,2,3,4,5};
		Scanner keyboard = new Scanner(System.in);
		for(int i=0;i<LIM;i++) {
			System.out.println("Input a number");
			num=keyboard.nextInt();
			vector[i]=num;
		}
		keyboard.close();
		System.out.print("vector = { ");
		for(int i=0;i<vector.length;i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println("}");
		System.out.print("ages = { ");
		for(int i=0;i<ages.length;i++) {
			System.out.print(ages[i]+" ");
		}
		System.out.println("}");
	}

}
