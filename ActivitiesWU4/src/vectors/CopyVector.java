package vectors;
public class CopyVector {
	public static void main(String[] args) {
		int vectorOriginal[] = {1,7,30,35,28,100};
		int vectorCopy[] = new int[vectorOriginal.length];
		int vectorBackwards[] = new int[vectorOriginal.length];
		//Copy
		for(int i=0;i<vectorOriginal.length;i++) {
			vectorCopy[i]=vectorOriginal[i];
		}//Print Copy
		System.out.println("Copy");
		for(int i=0;i<vectorCopy.length;i++) {
			System.out.print(vectorCopy[i]+" ");
		}
		//Copy Backwards
		int lastPos=vectorOriginal.length-1;
		for(int i = lastPos;i>=0;i--) {
			vectorBackwards[lastPos-i]=vectorOriginal[i];
		}//Print Copy Backwards
		System.out.println("\nBackwards");
		for(int i=0;i<vectorBackwards.length;i++) {
			System.out.print(vectorBackwards[i]+" ");
		}
	}
}