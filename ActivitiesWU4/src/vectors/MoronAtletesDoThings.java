package vectors;

import java.util.Scanner;

/*In an athletics event, we want to implement a control system to store the time of each runner and to determine by 
to store the time of each runner and also to determine by the data obtained from the runners' times which is the winner. 
the data obtained from the runners' times to determine the winner.   
You must specify how many athletes will participate.

TAKE NAMES FROM RUNNERS*/
public class MoronAtletesDoThings {

	public static void main(String[] args) {
		String runners[];
		String aux;
		float times[];
		int numRunners, winner;
		float record;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Cuantos capullos corren?");
		numRunners=keyboard.nextInt();
		keyboard.nextLine();
		runners = new String[numRunners];
		times = new float[numRunners];
		for(int i=0;i<numRunners;i++) {
			System.out.println("Enter runner:");
			aux=keyboard.nextLine();
			runners[i]=aux;
			System.out.println("Enter its time:");
			times[i]=keyboard.nextFloat();
			keyboard.nextLine();
		}
		keyboard.close();
		record=times[0];
		winner=0;
		for(int i=0;i<numRunners;i++) {
			if(times[i]<record) {
				record=times[i];
				winner=i;
			}
		}
		System.out.println("Ganador conchesumare es "+runners[winner]+" con un tiempo de "+record+" segundos. Como corre el hdp este.");
		

	}
}
