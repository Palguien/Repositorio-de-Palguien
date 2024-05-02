package practicaHerencia;
/**
 * Clase Instrumento
 * @author Pablo Pollos Iglesias
 */
public class Instrumento {
	// Atributos
	/**
	 * String de notas (DO | RE | MI | FA | SOL | SI | DO)
	 */
	private String[] melodia;

	// Constructores
	/**
	 * Constructor de Instrumento
	 */
	public Instrumento() {
		super();
	}

	// Metodos
	/**
	 * Valida una melodía, y de ser correcta (notas válidas) la mete en el atributo correspondiente
	 * @param melodia String[]
	 * @return boolean (true si es correcto, false en caso contrario)
	 */
	public boolean introMelodia(String[] melodia) {
		for (int i = 0; i < melodia.length; i++) {
			if (melodia[i].compareToIgnoreCase("DO") != 0 && melodia[i].compareToIgnoreCase("RE") != 0 && melodia[i].compareToIgnoreCase("MI") != 0 
					&& melodia[i].compareToIgnoreCase("FA") != 0 && melodia[i].compareToIgnoreCase("SOL") != 0 && melodia[i].compareToIgnoreCase("LA") != 0
					&& melodia[i].compareToIgnoreCase("SI") != 0) {
				return false;
			}
		}
		setMelodia(melodia);
		return true;

	}
	/**
	 * Muestra las notas en la melodía
	 */
	public void interpretar() {
		System.out.println("------------ Melodia: ---------------");
		if (melodia == null) {
			System.out.print("Vacío");
		} else {
			for (int i = 0; i < melodia.length; i++) {
				System.out.print(" " + melodia[i]);
			}
		}
		System.out.println("-------------------------------------");
	}
	/**
	 * Devuelve el número de notas en la melodía
	 * @return int
	 */
	public int duracion() {
		return melodia.length;
	}
	/**
	 * Cuenta las notas en la melodia que coinciden con la introducida
	 * @param nota
	 * @return int
	 */
	public int contarNota(String nota) {
		int total = 0;
		for (int i = 0; i < melodia.length; i++) {
			if (melodia[i].compareToIgnoreCase(nota)==0) {
				total++;
			}
		}
		return total;
	}

	// Get y Set
	/**
	 * Get Melodia
	 * @return String[]
	 */
	public String[] getMelodia() {
		return melodia;
	}
	/**
	 * Set Melodia
	 * @param melodia
	 */
	public void setMelodia(String[] melodia) {
		this.melodia = melodia;
	}
}
