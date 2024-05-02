package practicaHerencia;
/**
 * Clase Piano (hereda de Instrumento)
 * @author Pablo Pollos Iglesias
 */
public class Piano extends Instrumento {
	// Atributos
	/**
	 * String de notas para mano izquierda (DO | RE | MI | FA | SOL | SI | DO)
	 */
	private String[] melodiaIzda;

	// Constructores
	/**
	 * Constructor de Piano
	 */
	public Piano() {
		super();
	}

	// Metodos
	/**
	 * Valida una melodía, y de ser correcta (notas válidas) la mete en el atributo correspondiente (melodiaIzda)
	 * @param melodia String[]
	 * @return boolean (true si es correcto, false en caso contrario)
	 */
	public boolean introMelodiaIzda(String[] melodia) {
		for (int i = 0; i < melodia.length; i++) {
			if (melodia[i].compareToIgnoreCase("DO") != 0 && melodia[i].compareToIgnoreCase("RE") != 0 && melodia[i].compareToIgnoreCase("MI") != 0 
					&& melodia[i].compareToIgnoreCase("FA") != 0 && melodia[i].compareToIgnoreCase("SOL") != 0 && melodia[i].compareToIgnoreCase("LA") != 0
					&& melodia[i].compareToIgnoreCase("SI") != 0) {
				return false;
			}
		}
		setMelodiaIzda(melodia);
		return true;

	}
	/**
	 * Muestra las notas en la melodía derecha e izquierda (Overrides interpretar() de Instrumento)
	 */
	@Override
	public void interpretar() {
		System.out.println("------------ Melodia Drch: -----------");
		if (getMelodia() == null) {
			System.out.print("Vacío");
		} else {
			for (int i = 0; i < getMelodia().length; i++) {
				System.out.print(" " + getMelodia()[i]);
			}
		}
		System.out.println("\n------------ Melodia Izda: -----------");
		if (melodiaIzda == null) {
			System.out.print("Vacío");
		} else {
			for (int i = 0; i < melodiaIzda.length; i++) {
				System.out.print(" " + melodiaIzda[i]);
			}
		}
		System.out.println("\n-------------------------------------");
	}
	/**
	 * Devuelve el número de notas en la melodía Izquierda
	 * @return int
	 */
	public int duracionIzda() {
		return melodiaIzda.length;
	}
	/**
	 * Cuenta las notas en la melodia Izquierda y Derecha que coinciden con la introducida
	 * @param nota
	 * @return int
	 */
	public int contarNotaDosManos(String nota) {
		int total = 0;
		for (int i = 0; i < melodiaIzda.length; i++) {
			if (melodiaIzda[i].compareToIgnoreCase(nota)==0) {
				total++;
			}
		}
		return total + contarNota(nota);
	}

	// Get y Set
	/**
	 * Get Melodia izquierda
	 * @return String[]
	 */
	public String[] getMelodiaIzda() {
		return melodiaIzda;
	}
	/**
	 * Set melodia izquierda
	 * @param melodia
	 */
	public void setMelodiaIzda(String[] melodia) {
		this.melodiaIzda = melodia;
	}

}
