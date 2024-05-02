package practicaClases;
/**
 * @author Pablo Pollos Iglesias
 * Clase Gestor
 */
public class Gestor {
	//Atributos
	private final int TELEFONO;
	private String nombre;
	private double importeMax;
	//Constructor
	/**
	 * Constructor de Gestor
	 * @param nombre	String
	 * @param importeMax	double
	 * @param telefono	int
	 */
	public Gestor(String nombre,double importeMax,int telefono) {
		this.TELEFONO=telefono;
		setNombre(nombre);
		setImporteMax(importeMax);
	}
	/**
	 * Constructor de Gestor, ImporteMax por defecto (10000)
	 * @param nombre	String
	 * @param telefono	int
	 */
	public Gestor(String nombre,int telefono) {
		this(nombre,10000,telefono);
	}
	//Metodos
	/**
	 * Método toString de Gestor
	 */
	@Override
	public String toString() {
		return "Gestor [telefono=" + TELEFONO + ", nombre=" + nombre + ", importeMax=" + importeMax + "]";
	}

	//Gets y sets
	/**
	 * Método get de teléfono
	 * @return telefono	int
	 */
	public int getTelefono() {
		return TELEFONO;
	}
	/**
	 * Método get de nombre
	 * @return nombre	String
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método set de nombre
	 * @param nombre	String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método get de impoteMax
	 * @return	double
	 */
	public double getImporteMax() {
		return importeMax;
	}
	/**
	 * Método set de impoteMax
	 * @param importeMax	double
	 */
	public void setImporteMax(double importeMax) {
		this.importeMax = importeMax;
	}
	
	//
}
