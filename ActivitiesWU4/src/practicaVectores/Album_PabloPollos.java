package practicaVectores;
import java.util.Scanner;
//Exercise 1
public class Album_PabloPollos {
	public static void main(String[] args) {
		final int TAM = 100;
		int album[] = new int[TAM];
		int tengo[] = {4, 5, 7, 9, 12, 24, 33, 44, 45, 46, 57, 80, 92 , 94};
		int aux, cardNum, contNoTengo;
		char exit;
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0;i<tengo.length;i++) {//Initialize vector
			aux=tengo[i];
			album[aux-1]=aux;
		}
		do {//main loop
			//adding new card to the album
			System.out.println("Opening booster pack");
			for(int i=0;i<6;i++) {			
				do {
					System.out.println((i+1)+")Input card number");
					cardNum=keyboard.nextInt();
				}while(cardNum>100 || cardNum<1);
				if(album[cardNum-1]==0) {
					album[cardNum-1]=cardNum;
					System.out.println("No le");
				}else {
					System.out.println("Si le");
				}
			}
			contNoTengo=0;
			//read album
			System.out.println("I don't have the next cards in the album:");
			for(int i=0;i<album.length;i++) {
				if(album[i]==0) {
					System.out.print((i+1)+",");
					contNoTengo++;
				}	
			}
			System.out.println("\nTotal missing card: "+contNoTengo);
			//exit loop
			if(contNoTengo==0) {
				System.out.println("Collection Complete!");
				break;
			}
			System.out.println("Press 'Y' to stop opening booster packs");
			exit=keyboard.next().charAt(0);
		}while(exit!='Y');
		keyboard.close();
	}

}
