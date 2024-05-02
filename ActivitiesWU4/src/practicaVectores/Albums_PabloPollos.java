package practicaVectores;
import java.util.Scanner;
//Exercise 1
public class Albums_PabloPollos {
	public static void main(String[] args) {
		final int TAM = 100;
		final int COLLECTIONS = 5;
		int album[][] = new int[TAM][COLLECTIONS];
		int tengo[] = {4, 5, 7, 9, 12, 24, 33, 44, 45, 46, 57, 80, 92 , 94};
		int aux, cardNum, contNoTengo, collection;
		char exit;
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0;i<tengo.length;i++) {//Initialize vector
			aux=tengo[i];
			album[aux-1][0]=aux;
		}
		do {//main loop
			//adding new card to the album
			System.out.println("Opening booster pack");
			collection=0;
			for(int i=0;i<6;i++) {
				while((collection>5 || collection<1)) {
					System.out.println("Input collection [1-5]");
					collection=keyboard.nextInt()-1;
				}
				do {
					System.out.println((i+1)+")Input card number");
					cardNum=keyboard.nextInt();
				}while(cardNum>100 || cardNum<1);
				if(album[cardNum-1][collection]==0) {
					album[cardNum-1][collection]=cardNum;
					System.out.println("No le");
				}else {
					System.out.println("Si le");
				}
			}
			contNoTengo=0;
			//read album
			
			for(int j=0;j<5;j++) {
				System.out.println("I don't have the next cards in the album "+(j+1)+":");
				for(int i=0;i<album.length;i++) {
					if(album[i][j]==0) {
						System.out.print((i+1)+",");
						contNoTengo++;
					}
				}
				System.out.println("\nTotal missing card: "+contNoTengo);
				if(contNoTengo==0) {
					System.out.println("Collection Complete!");
				}
				contNoTengo=0;
				
			}
			System.out.println("Press 'Y' to stop opening booster packs");
			exit=keyboard.next().charAt(0);
		}while(exit!='Y');
		keyboard.close();
	}

}
