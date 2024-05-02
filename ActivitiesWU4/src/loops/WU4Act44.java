package loops;
/*Design a program that displays the multiplication tables from 1 to 10. 
 */
public class WU4Act44 {
	public static void main(String[] args) {
		System.out.println("---------------------");
		System.out.println("Multiplication table");
		System.out.println("--------------------");
		for(int i=1;i<=10;i++) {
			System.out.println("Tabla del "+i);
			System.out.println("-------------");
			for(int j=0;j<=10;j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
			System.out.println("-------------");
			
		}
	}
}
