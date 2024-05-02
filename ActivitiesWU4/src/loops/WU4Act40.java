package loops;
import java.util.Scanner;
/*Given the ages and heights of 5 students, show the average
 *  age and height, the number of students over 18 years old,
 *  and the number of students taller than 1.75. 
 */
public class WU4Act40 {
	public static void main(String[] args) {
		final int LIM_LOOP = 5, LIM_AGE = 18;
		final float LIM_HEIGHT = 1.75f;
		int age, oldStudents = 0, tallStudents = 0;
		float height, averageHeight = 0, averageAge = 0;
		Scanner keyboard = new Scanner(System.in);
		for(int i=0;i<LIM_LOOP;i++) {
			System.out.println("Student "+(i+1));
			do {
				System.out.println("Enter age");
				age = keyboard.nextInt();
			}while(age<=0);
			do {
				System.out.println("Enter height");
				height = keyboard.nextFloat();
			}while(height<=0);	
			averageAge = averageAge + age/LIM_LOOP;
			averageHeight = averageHeight + height/LIM_LOOP;
			if(age>=LIM_AGE) {
				oldStudents++;
			}
			if(height>LIM_HEIGHT) {
				tallStudents++;
			}
		}
		keyboard.close();
		System.out.println("Average Age = "+averageAge);
		System.out.println("Average Height = "+averageHeight);	
		System.out.println("Students over "+LIM_AGE+" years old = "+oldStudents);
		System.out.println("Students taller than "+LIM_HEIGHT+" = "+tallStudents);
	}
}
