package vectors;

public class BinarySearch {

	public static void main(String[] args) {
		int vector[] = { 1, 2, 3, 4, 5, 6, 9, 10, 13, 17, 23, 25, 33, 40 };
		int lookFor = 6;
		int low, top, mid;

		low = 0;
		top = vector.length - 1;
		System.out.println("Looking for "+lookFor);
		do {
			mid = (low + top) / 2;
			System.out.println("[" + low + "-" + top + "]  Mid="+mid);
			if (vector[mid] <= lookFor) {
				low = mid + 1;
			}
			if (vector[mid] >= lookFor) {
				top = mid - 1;
			}
		} while (low <= top);
		if (vector[mid] == lookFor) {
			System.out.println("Data found in position " + mid + ".");
		} else {
			System.out.println("ERROR #404. Data not found.");
		}
	}

}
