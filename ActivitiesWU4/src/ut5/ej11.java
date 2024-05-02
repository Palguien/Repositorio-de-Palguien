package ut5;

import java.util.Scanner;

//Escribe un programa que pida las edades de los profesores de un instituto
public class ej11 {
	public static void main(String[] args) {
		final int DEPART = 4;
		final int PROFS = 6;
		int matrix[][]={{1,2,3,4,5,6},{12,22,32,42,52,62},{1,2,3,4,5,6},{15,25,35,45,5,65}};
		int answerDep, answerProf, age;
		Scanner keyboard=new Scanner(System.in);
		//ask user
		do {
			System.out.println("Age? (Neg to stop)");
			age=keyboard.nextInt();
			answerDep=-1;
			answerProf=-1;
			if(age>0) {
				for (int i = 0; i < DEPART; i++) {
					for (int j = 0; j < PROFS; j++) {
						if(matrix[i][j]==age) {
							answerDep=i;
							answerProf=j+1;
						}
					}
				}
				if(answerDep==-1 && answerProf==-1) {
					System.out.println("No professors are "+age+" years old.");
				}else {
					System.out.println("The professor "+answerProf+" in the department "+answerDep+ " is "+age+" years old.\"");
				}
				
			}
		}while(age>0);
		System.out.println("Negative number detected, terminating execution.");
		keyboard.close();

	}

}
