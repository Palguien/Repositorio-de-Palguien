package cosasDeAlumno;

import java.util.Scanner;

import javax.swing.JOptionPane;

import bombillaYtal.Alumno;

public class _AlumnoApp {

	public static void main(String[] args) {
		int position=0,cambio;
		//a) Se pidan los datos para un alumno.
		Alumno felipe = new Alumno();
		int[] notas=new int[felipe.getTAMAÑO()];
		notas=felipe.getNotas();
		felipe.visualizarDatos();
		//b) Se ofrezca al usuario la opción de modificar la nota en uno de los módulos
		JOptionPane.showMessageDialog(null, felipe.toString(),"TITLE",JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, notas, null, cambio);
		//JOptionPane.showMessageDialog(null, notas, null, cambio, null);
		
		Scanner teclado = new Scanner(System.in);	
		
		do {
			System.out.println("De que asignatura quieres cambiar la nota (0-"+(felipe.getTAMAÑO()-1)+") "
					+ "o -1 si no quieres cambiar nada.");
			position=teclado.nextInt();
			teclado.nextLine();
		}while(position<-1 || position>=felipe.getTAMAÑO());
		
		if(position>=0) {
			do {
				System.out.println("¿Cuál es la nueva nota?");
				cambio=teclado.nextInt();
				teclado.nextLine();
			}while(cambio<0 || cambio>10);
			notas[position]=cambio;
			felipe.setNotas(notas);
		}
		
		teclado.close();
		//c) Se visualicen las notas del alumno después de la modificación.
		felipe.visualizarDatos();
		//d) Se visualice si tiene que repetir (tiene más de un suspenso).
		if(felipe.countSuspensos()>0) {
			System.out.println("Suspendiste wey, te toca repetir");
		}else {
			System.out.println("Sin suspensos, piola.");
		}
		//e) Se visualice si se le concede una beca (la nota media del alumno debe superar el 7).
		if(felipe.notaMedia()>7) {
			System.out.println("The student qualifies for a scholarship");
		}else {
			System.out.println("No scholarship for you");
		}

	}

}
