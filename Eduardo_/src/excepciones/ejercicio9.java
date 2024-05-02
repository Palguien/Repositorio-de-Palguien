package excepciones;
import JOptionPane.Dialogos;

public class ejercicio9 {
	public static void main(String[]args) {
		Dialogos dia=new Dialogos();
		int i, num, suma=0;
		
		try {
			for(i=0;i<5;i++) {
				num=dia.pedirEntero("Introduce un entero para realizar suma");
				System.out.println("Numero: "+num);
				suma=suma+num;
			}
		i=0;
		do {
			num=dia.pedirEntero("Introduce un entero para sumar: ");
			i++;
			suma=suma+num;
		}while(i<5 && num!=0);
		}
		catch(NumberFormatException e) {
			dia.mensajeError("ERROR. Entrada no válida.");			
		}
		catch(Exception e) {
			dia.mensajeError("ERROR.","Apli SUMA");
		}		
		
	}

}