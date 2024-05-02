package vectors;

public class BrubujaOrdenar {

	public static void main(String[] args) {
		int vector[]= {1,6,3,4,5,2,9,7,3,4,3,12,19,1,2};
		int aux;
		boolean exit;
		System.out.println("Desordenado:");
		for (int s = 0; s < vector.length; s++) {
			System.out.print(vector[s]+", ");
		}
		System.out.println();
		do {
			System.out.print('L');
			exit=true;
			for (int i = 0; i < vector.length-1; i++) {
				if(vector[i]>vector[i+1]) {
					aux=vector[i+1];
					vector[i+1]=vector[i];
					vector[i]=aux;
					exit=false;
				}
			}
		}while(!exit);
		System.out.println("\nOrdenado:");
		for (int s = 0; s < vector.length; s++) {
			System.out.print(vector[s]+", ");
		}

	}

}

