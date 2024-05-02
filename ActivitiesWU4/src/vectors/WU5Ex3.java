package vectors;
public class WU5Ex3 {

	public static void main(String[] args) {
		final int ROWS = 4;
		final int COLUMNS = 5;
		int students[][]= {{0,1,2,3,4},{5,6,7,8,9},{10,11,12,13,14},{15,16,17,18,19}};
		for(int i=0;i<ROWS;i++) {
			for(int j=0;j<COLUMNS;j++) {
				System.out.println(students[i][j]);
				
			}			
		}
	}
}
