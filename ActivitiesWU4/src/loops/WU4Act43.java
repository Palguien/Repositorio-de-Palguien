package loops;
import java.util.Scanner;
/*: Draw a square of "n" side elements using *. 
 * "n" must be requested from the user.
 */
public class WU4Act43 {
	public static void main(String[] args) {
		int side;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("lenght of the side of the square:");
			side = keyboard.nextInt();
		}while(side<1);
		keyboard.close();
//		for(int i=0;i<side;i++) {
//			for(int j=0;j<(side-1);j++) {
//				System.out.print("*");
//			}
//			System.out.println("*");
//		}
		for(int i=0;i<side;i++) {
			for(int j=0;j<(side);j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
