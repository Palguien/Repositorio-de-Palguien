package vectors;
import java.util.Scanner;
//vectors
public class VectorActivities {
	public static void main(String[] args) {
		String vectorAsig[] = {"FOL","SIST","LM","PROG","BD","ED"};
		int vectorAlum[] = {1,7,30,35,28,100};
		int suma = 0, num, max = 0, min = 2147483647;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Alumnos de cada asignatura:");
		for(int i=0;i<vectorAsig.length;i++) {
			System.out.println(vectorAsig[i]+":"+vectorAlum[i]);
			if(max<vectorAlum[i]) {
				max=vectorAlum[i];
			}
			if(min>vectorAlum[i]) {
				min=vectorAlum[i];
			}
			suma = suma + vectorAlum[i];
		}
		System.out.println("---------\nBackward Vector:");
		System.out.print("{ ");
		for(int i = vectorAlum.length-1;i>=0;i--) {
			System.out.print(vectorAlum[i]+" ");
		}
		System.out.println("}");
		System.out.println("---------\nTotal alumnos: "+suma);
		System.out.println("Average: "+(float)suma/(float)vectorAsig.length);
		System.out.println("Maximun of students in a class: "+max);
		System.out.println("Minimun of students in a class: "+min);
		System.out.println("---------\nEditar alumnos");
		max = 0;
		min = 2147483647;
		for(int i=0;i<vectorAsig.length;i++) {
			do{
				System.out.println("Alumnos "+vectorAsig[i]+"?");
				num=keyboard.nextInt();
			}while(num<0);
			vectorAlum[i]=num;
			if(max<num) {
				max=num;
			}
			if(min>num) {
				min=num;
			}
				
		}
		keyboard.close();
		suma=0;
		System.out.println("---------\nAlumnos de cada asignatura:");
		for(int i=0;i<vectorAsig.length;i++) {
			System.out.println(vectorAsig[i]+":"+vectorAlum[i]);
			suma = suma + vectorAlum[i];
		}
		System.out.println("---------\nTotal alumnos: "+suma);
		System.out.println("Average: "+(float)suma/(float)vectorAsig.length);
		System.out.println("Maximun of students in a class: "+max);
		System.out.println("Minimun of students in a class: "+min);
		
	}
}
