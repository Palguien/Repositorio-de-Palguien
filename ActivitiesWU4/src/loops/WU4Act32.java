package loops;
import java.util.Scanner;
//asks for 10 correct grades and tells how many passed
public class WU4Act32 {
	public static void main(String[] args) {
		int passed = 0;
		int grade;
		boolean warning = false;
		final int STUDENTS = 10;
		Scanner keyboard = new Scanner(System.in);
		for(int i=0;i<STUDENTS;i++) {
			do {
				if(warning) {
					System.out.println("Error. Number out of range.");
				}
				System.out.println("Enter the student grade [0,10]: ");
				grade = keyboard.nextInt();
				warning=true;
			}while(grade>10 || grade<0);
			warning=false;
			if(grade>=5) {
				passed++;
			}
			
		}
		keyboard.close();
		System.out.println("Students that have passed the module: "+passed);
	}
}
