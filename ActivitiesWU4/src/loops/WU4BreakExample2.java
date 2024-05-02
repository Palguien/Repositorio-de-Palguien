package loops;

public class WU4BreakExample2 {
	public static void main(String[] args) {	
		for(int i=0;i<10;i++) {
			System.out.println("------------\nTable of "+i+"\n------------");
			for(int j=0;j<10;j++) {
				if(j==3){
					continue;
				}
				if(j==6){
					break;
				}
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		} 
		}
	}

