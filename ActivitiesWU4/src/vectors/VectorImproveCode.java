package vectors;

public class VectorImproveCode {

	public static void main(String[] args) {
		int vectorAlum[] = {1,7,30,35,28,100};
		System.out.println("---------\nBackward Vector:");
		System.out.print("{ ");
		for(int i = vectorAlum.length-1;i>=0;i--) {
			System.out.print(vectorAlum[i]+" ");
		}
		System.out.print("}");

	}

}
