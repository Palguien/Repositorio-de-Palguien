package vectors;

public class Table {

	public static void main(String[] args) {
		char vector1[]= {' ',' ',' ',' ','*','*',' ',' ',' ',' '};
		char vector2[]= {' ',' ',' ','*','*','*','*',' ',' ',' '};
		char vector3[]= {' ',' ',' ','*',' ',' ','*',' ',' ',' '};
		char vector4[]= {'*','*','*','*',' ',' ','*','*','*','*'};
		char vector5[]= {'*','*','*','*','*','*','*','*','*','*'};
		char vector6[]= {'*',' ',' ','*',' ',' ','*',' ',' ','*'};
		char vectors[][]=new char[14][10];
		
		vectors[0]=vector1;
		for(int i = 1;i<3;i++) {
			vectors[i]=vector3;	
		}
		vectors[3]=vector2;
		for(int i = 4;i<10;i++) {
			vectors[i]=vector3;	
		}
		vectors[10]=vector4;
		for(int i = 11;i<13;i++) {
			vectors[i]=vector6;	
		}
		vectors[13]=vector5;
		
		for(int i = 0;i<14;i++) {
			System.out.println(vectors[i]);	
		}
		
		for(int j = 0;j<vectors[0].length;j++) {
			for(int i = 0;i<vectors.length;i++) {
				System.out.print(vectors[i][j]);		
			}
			System.out.println();
		}
	}

}
