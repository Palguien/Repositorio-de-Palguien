package exceptionExample;

import dialogs.EasyDialogs;

public class ExceptionEj9_10_11ThrowCatch {
	
	public static void main(String[] args) {
		
		int cont=0,total=0;
		do {
			try {
				total+=EasyDialogs.askIntDialog("Dame un numero");
				cont++;
			}catch(NumberFormatException e) {
				System.out.println("Letras introducidas en vez de numeros");
				break;
			}
		}while(cont<5);
		System.out.println("Total="+total);
		System.out.println("fin programa");

	}

}