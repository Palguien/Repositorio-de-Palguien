package loops;
import java.util.Scanner;
/*A data source records several ages, with age zero indicating the end of data entry.
 *  Design a program to determine the average of the ages entered and also the percentage of people over age 50. 
 */
public class WU4Act47 {
	public static void main(String[] args) {
		int age, total = 0, cont = 0, overAge = 0;
		final int LIM_AGE = 50;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Write ages, 0 to end loop");
		do {
			cont++;
			do {
				System.out.println("Age "+cont+":");
				age = keyboard.nextInt();
			}while(age<0);
			if(age>=LIM_AGE) {
				overAge++;
			}
			total = total+age;
		}while(age!=0);
		cont--; //To offset the last iteration of the loop
		keyboard.close();
		System.out.println("Age average = "+((float)total/(float)cont));
		System.out.println("Percentage of people over "+LIM_AGE+" years = "+((float)overAge/(float)cont)*100+"%");
	}
}
