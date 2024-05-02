package excepciones;

import java.util.Scanner;

public class ejercicio1_1_1 {

	public static void main(String[]args) {
		//Division por cero
				////////////////////////////////////
				////////////////////////////////////
				Scanner entrada=new Scanner(System.in);
				int dividendo1, divisor1=0, resultado1;
				System.out.println("Introduzca dividendo:");
				dividendo1=entrada.nextInt();
				boolean div=true;
				
				System.out.println("Introduzca divisor:");
				divisor1=entrada.nextInt();
				
				
				try {
				resultado1=dividendo1/divisor1;
				System.out.println("Resultado: " +resultado1);
				}
				catch(ArithmeticException e) {
					div=false;
					System.out.println("Error. División por cero.");
					System.out.println("Error: "+e.getMessage());
				}
				//finally se pone para que ejecute lo que quieras independientemente
				//del try y del catch. Se va a ejecutar siempre.
				finally {
					if(div)
					System.out.println("División realizada");
					else
						System.out.println("División no realizada");
				}
	}
}
