package probandoObjetos;
/**
 * Clase que contiene el objeto Empleado y sus métodos
 * @author Pablo
 */
public class Empleado {
	//ATRIBUTOS
	private String nombre;
	private float sueldo;
	private String departamento;
	
	//CONSTRUCTOR
	/**
	 * Constructor del objeto Empleado
	 * @param name	nombre del empleado (String)	
	 * @param sueld	sueldo del empleado (Float)
	 * @throws IllegalArgumentException si name es null
	 */
	public Empleado(String name, float sueld) {
		setNombre(name);
		setSueldo(sueld);
		setDepartamento("NINGUNO");
	}
	/**
	 * Constructor del objeto Empleado
	 * @param name	nombre del empleado (String)	
	 * @param sueld	sueldo del empleado (Float)
	 * @param dep	departamento al que pertenece el empleado (String)
	 * @throws IllegalArgumentException si name es null
	 * @throws IllegalArgumentException si dep no es NINGUNO, RRHH, VENTAS o I+D
	 */
	public Empleado(String name, float sueld, String dep) {
		setNombre(name);
		setSueldo(sueld);
		setDepartamento(dep);
	}
	
	//GETTERS Y SETTERS
	/**
	 * Método get del atributo nombre
	 * @return nombre (String)
	 */
	private String getNombre() {
		return nombre;
	}
	/**
	 * Método set del atributo nombre
	 * @param nombre
	 * @throws IllegalArgumentException si name es null
	 */
	private void setNombre(String nombre) {
		if(nombre==null) {
			throw new IllegalArgumentException("El parámetro nombre no puede ser nulo");
		}
		this.nombre = nombre;
	}
	/**
	 * Método get del atributo sueldo
	 * @return nombre (String)
	 */
	private float getSueldo() {
		return sueldo;
	}
	/**
	 * Método set del atributo sueldo
	 * @param sueldo
	 */
	private void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	/**
	 * Método get del atributo departamento
	 * @return departamento (String)
	 */
	public String getDepartamento() {
		return departamento;
	}
	/**
	 * Método set del atributo departamento
	 * @param departamento
	 * @throws IllegalArgumentException si departamento no es NINGUNO, RRHH, VENTAS o I+D
	 */
	public void setDepartamento(String departamento) {
		if(departamento!="NINGUNO" && departamento!="RRHH" && departamento!="VENTAS" && departamento!="I+D") {
			throw new IllegalArgumentException("Departamento solo puede ser: NINGUNO, RRHH, VENTAS o I+D");
		}
		this.departamento = departamento;
	}
	
	//MÉTODOS
	/**
	 * Método que muestra por pantalla los datos del empleado
	 */
	public void VisualizarDatosEmpleado() {
		System.out.println("\t>>Nombre: "+getNombre());
		System.out.println("\t>>Sueldo: "+getSueldo());
		System.out.println("\t>>Departamento: "+getDepartamento());
	}
}
