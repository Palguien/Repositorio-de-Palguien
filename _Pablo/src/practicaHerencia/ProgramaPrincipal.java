package practicaHerencia;
/**
 * Programa Principal
 * @author Pablo Pollos Iglesias
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		//Creo melodias
		String[] escala = {"DO","RE","MI","FA","SOL","LA","SI","DO"};
		String[] escalaMal = {"DO","RE","MI","FA","SOL","LA","SIbemol","DO"};
		String[] partitura = {"DO","RE","DO","LA","SOL","LA","SI","DO","FA"};
		//Creo objeto Piano
		Piano piano = new Piano();
		//Metemos melodias en piano
		//Derecha Incorrecto
		System.out.println("Introducir melodia derecha:");
		if(piano.introMelodia(escalaMal)) {
			System.out.println("Notas introducidas correctamente");
		}else {
			System.out.println("Notas incorrectas");
		}
		//Derecha Correcto
		System.out.println("Introducir melodia derecha:");
		if(piano.introMelodia(escala)) {
			System.out.println("Notas introducidas correctamente");
		}else {
			System.out.println("Notas incorrectas");
		}
		//Izquierda Incorrecta
		System.out.println("Introducir melodia izquierda:");
		if(piano.introMelodiaIzda(escalaMal)) {
			System.out.println("Notas introducidas correctamente");
		}else {
			System.out.println("Notas incorrectas");
		}
		//Izquierda Correcta
		System.out.println("Introducir melodia izquierda (intento 2):");
		if(piano.introMelodiaIzda(partitura)) {
			System.out.println("Notas introducidas correctamente");
		}else {
			System.out.println("Notas incorrectas");
		}

		//Duración melodías
		System.out.println("\nDuración melodías:");
		System.out.println(" -Melodía derecha: "+piano.duracion());
		System.out.println(" -Melodía izquierda: "+piano.duracionIzda());
		//Interpretar melodías
		piano.interpretar();
		//Contar Notas
		System.out.println("Apariciones de DO (mano derecha): "+piano.contarNota("DO"));
		System.out.println("Apariciones de DO (dos manos): "+piano.contarNotaDosManos("DO"));
		
		
	}

}
