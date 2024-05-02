package vectors;

public class LinealSearch {

	public static void main(String[] args) {
		int vector[]= {1,2,5,5,6,9,10};
		int lookFor=5;
		boolean found = false;
		
		for (int i = vector.length-1; i >= 0; i--) {
			System.out.print(i+",");
			if(vector[i]==lookFor) {
				System.out.println("In position "+i);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("ERROR #404. Data not found.");
		}
	}

}
