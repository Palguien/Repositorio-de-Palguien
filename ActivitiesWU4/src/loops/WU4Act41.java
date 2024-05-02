package loops;
import java.util.Scanner;
//Write a program that asks for a number N, enters 
//N salaries and displays the maximum salary.
public class WU4Act41 {
	public static void main(String[] args) {
		int lim;
		float salary, maxSalary = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Write number of salaries");
		lim = keyboard.nextInt();
		for(int i=0;i<lim;i++) {
			do {
				System.out.println("Salary "+(i+1));
				salary=keyboard.nextFloat();
			}while(salary<=0);
			if(salary>maxSalary) {
				maxSalary=salary;
			}
		}
		keyboard.close();
		System.out.println("Max Salary = "+maxSalary);
	}
}
