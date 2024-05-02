package vectors;
/* We want to store in the computer memory the number of students enrolled per module in the cycle.
 * This time we have 2 groups, in which 6 modules are taught.
 */
public class WU5Ex4 {
	public static void main(String[] args) {
		final int ROWS = 2;
		final int COLUMNS = 6;
		int students[][]= {{30,27,25,21,19,16},{21,17,24,26,30,30}};
		String modules[]= {"Computer Systems","Databases","Programming","Mark Languaje","Development Enviroments","Acess to data"};
		//Reading vectors
		System.out.println("Reading data");
		for(int i=0;i<ROWS;i++) {
			System.out.println("\nGroup "+(i+1)+":");
			for(int j=0;j<COLUMNS;j++) {
				System.out.print(modules[j]+": ");
				System.out.print(students[i][j]+"   ");
			}			
		}
	}
}
