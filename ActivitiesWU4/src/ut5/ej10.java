package ut5;

import java.util.Scanner;

/*Escribe un programa que pida la estatura de una serie de alumnos, de tantos como indique el usuario del programa.
 *  Posteriormente, el programa ordenará dichos datos de forma ascendente. Una vez ordenados, el programa visualizará
 *   los datos en el orden que se insertaron y ordenados de forma ascendente.
 */
public class ej10 {
	public static void main(String[] args) {
		float alum[];
		float alumOrd[];
		float num;
		int numAlum;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Nºstudents?");
		numAlum=keyboard.nextInt();
		alum=new float[numAlum];
		alumOrd=new float[numAlum];
		//insertion and order
		for (int i = 0; i < numAlum; i++) {
			do {
				System.out.println((i+1)+") Input height:");
				num=keyboard.nextFloat();
			}while(num<0);
			alum[i]=num;
			alumOrd[i]=num;
			for (int j = i; j >1; j--) {
				if(alumOrd[j]<alumOrd[j-1]) {
					num=alumOrd[j];
					alumOrd[j]=alumOrd[j-1];
					alumOrd[j-1]=num;
				}
			}
		}
		keyboard.close();
		//output
		System.out.println("Vector original");
		System.out.print("{");
		for (int i = 0; i < numAlum; i++) {
			System.out.print(alum[i]+" ");
		}
		System.out.println("}");
		System.out.print("{");
		for (int i = 0; i < numAlum; i++) {
			System.out.print(alumOrd[i]+" ");
		}
		System.out.println("}");
	}

}
