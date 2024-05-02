package vectors;

public class VectorSizeEqualsConstant {

	public static void main(String[] args) {
			final int SIZE = 5;
			int size = 7;
			int vector[] = new int[SIZE];
			int array[] = new int[size];
			System.out.println("Vector size = "+vector.length+" integers");
			System.out.println("Second vector size = "+array.length+" integers");
	}
}
