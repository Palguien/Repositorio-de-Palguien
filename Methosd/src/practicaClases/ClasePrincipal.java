package practicaClases;

import java.util.Scanner;
/**
 * @author Pablo Pollos Iglesias
 * Clase principal
 */
public class ClasePrincipal {

	public static void main(String[] args) {
		String dni;
		double dinero;
		Scanner teclado = new Scanner(System.in);
		
		//Llamar al constructor con los parámetros necesarios.
		do {
			System.out.println("dame un dni");
			dni=teclado.next();
			teclado.nextLine();
		}while(dni.length()!=9);
		CuentaCorriente felipe = new CuentaCorriente(dni.toUpperCase(), "Felipe", 5000);
		Gestor josefina = new Gestor("Josefina", 943526111);
		felipe.setGestorCuenta(josefina);
		
		//Realizar un ingreso
		do {
			System.out.println("cuanto quieres ingresar?");
			dinero=teclado.nextDouble();
		}while(dinero<0);
		felipe.ingresarDinero(dinero);
		felipe.mostrarInformacion();
		
		//Sacar dinero.
		do {
			System.out.println("cuanto quieres retirar?");
			dinero=teclado.nextDouble();
		}while(dinero<0 || !felipe.extraerDinero(dinero));
		
		//Mostrar la información.
		felipe.mostrarInformacion();
		
		//Modificar el interés al 3,2
		CuentaCorriente.setTipoInteres((float) 3.2);
		System.out.println(CuentaCorriente.getTipoInteres());
		
		teclado.close();
	}
}