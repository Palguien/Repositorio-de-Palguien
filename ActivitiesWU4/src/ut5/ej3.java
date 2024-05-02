package ut5;

/*Define un array de las notas medias de 4 alumnos en las 3 evaluaciones de un curso. 
 * Inicializa el array a los valores que quieras y después muéstralas por pantalla.
 */
public class ej3 {

	public static void main(String[] args) {
		int notas[][]= {{1,3,4,5},{9,5,4,7},{4,6,7,2}};
		
		for(int i = 0;i<notas.length;i++) {
			for(int j = 0;j<notas[0].length;j++) {
				System.out.print(notas[i][j]);		
			}
			System.out.println();
		}
	}

}
