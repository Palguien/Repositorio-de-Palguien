package ut5;

/*Escribe un programa que pida las notas que han obtenido 5 alumnos en cada uno de los 
 * 3 módulos en los que están matriculados. Posteriormente, el programa visualizará la 
 * cantidad de alumnos que han suspendido algún módulo.
 */
public class ej12 {

	public static void main(String[] args) {
		int notas[][]= {{1,5,5},{5,5,6},{10,10,0},{7,6,5},{9,4,6}};
		boolean suspende;
		int suspensos=0;
		
		for (int i = 0; i < notas.length; i++) {
			suspende=false;
			//comprobamos los modulos de un alumno
			for (int j = 0; j < notas[0].length; j++) {
				if(notas[i][j]<5) {
					suspende=true;
				}
			}
			if(suspende) {
				suspensos++;
			}
			
		}
		System.out.println(suspensos+" alumnos tienen suspenso algún módulo");
	}

}
