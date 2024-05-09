

public class Alumno {
	  private int id;
	  private String nombre;
	  private int edad;
	  private String Curso;
	  
	  
	public Alumno(int id, String nombre, int edad, String curso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		Curso = curso;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getCurso() {
		return Curso;
	}


	public void setCurso(String curso) {
		Curso = curso;
	}



	@Override
	public String toString() {
		return "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", Curso=" + Curso ;
	}
	  
	  
	  
	}
