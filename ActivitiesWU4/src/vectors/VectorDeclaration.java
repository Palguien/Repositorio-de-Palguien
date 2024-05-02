package vectors;
import java.util.Scanner;
//Fill array
public class VectorDeclaration {
	public static void main(String[] args) {
		final int LIM = 6;
		String vector[] = new String[LIM*2];
		String txt;
		Scanner keyboard = new Scanner(System.in);
		for(int i=0;i<vector.length;i=i+2) {
			System.out.println("Input asignature");
			txt=keyboard.next();
			vector[i]=txt;
			System.out.println("Input students");
			txt=keyboard.next();
			vector[i+1]=txt;
		}
		keyboard.close();
		System.out.println("Alumnos de cada asignatura:");
		for(int i=0;i<vector.length;i=i+2) {
			System.out.println(vector[i]+":"+vector[i+1]);
		}	
	}
}
