package schoolObjects;
/**
 * @author Pablo Pollos Iglesias
 */
public class Alumno {
	//Atributes
	/**
	 * Atributo nombre (String)
	 */
	private String nombre;
	/**
	 * Atributo age (int)
	 */
	private int age;
	//Constructor
	/**
	 * Constructor del objeto Alumno
	 * @param name	String
	 * @param age	int
	 * @throws NullPointerException si name es nulo
	 * @throws IllegalArgumentException si age no pertenece a [0,120]
	 */
	public Alumno(String name,int age){
		setNombre(name);
		setAge(age);
	}
	public Alumno() {
		this.nombre=null;
		this.age=0;
	}
	
	//Methods
	@Override
	/**
	 * método toString del objeto Alumno
	 */
	public String toString() {
		return "Alumno [nombre=" + nombre + ", age=" + age + "]";
	}
	public void visualizeData() {
		System.out.println(toString());
	}
	/**
	 * método que inicializa los datos de la instancia de Alumno a Wamba y 666
	 */
	protected void initializeData() {
		this.nombre="Wamba";
		this.age=666;
	}
	/**
	 * Método que modifica solo uno de los atributos de Alumno, en este caso name
	 * @param name	String
	 * @throws NullPointerException si name es nulo 
	 */
	void modifyData(String name) {
		setNombre(name);
	}
	/**
	 * Método que modifica solo uno de los atributos de Alumno, en este caso age
	 * @param age	int
	 * 
	 */
	void modifyData(int age) {
		setAge(age);
		
	}
	//Get y set
	/**
	 * método get del atributo nombre
	 * @return	nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * método set del atributo nombre
	 * @param nombre	nombre del alumno
	 * @throws NullPointerException si nombre es nulo
	 */
	public void setNombre(String nombre) {
		if(nombre==null) {
			throw new NullPointerException("El valor del nombre es nulo");
		}
		this.nombre = nombre;
	}
	/**
	 * método get del atributo age
	 * @return	age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * método set del atributo age
	 * @param age	edad del alumno
	 * @throws IllegalArgumentException si age no pertenece a [0,120]
	 */
	public void setAge(int age) {
		if(age<0 || age>120) {
			throw new IllegalArgumentException("Introduce una edad válida");
		}else {
			this.age = age;
		}
	}
	
}
