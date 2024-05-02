package loops;
import java.util.Scanner;
//modify 32 to stop upon entering a wrong grade
public class WU4Act33 {
	public static void main(String[] args) {
		int passed = 0;
		int grade;
		boolean warning = false;
		Scanner keyboard = new Scanner(System.in);
		while (warning==false){
			System.out.println("Enter the student grade [0,10]: ");
			grade = keyboard.nextInt();
			if(grade>10 || grade<0) {
				warning=true;				
			}
			if(grade>=5) {
				passed++;
			}
		}
		System.out.println("Incorrect number, exiting loop");
		keyboard.close();
		System.out.println("Students that have passed the module: "+passed);
	}
	
}
