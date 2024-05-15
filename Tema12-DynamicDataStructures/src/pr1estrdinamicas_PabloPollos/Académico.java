package pr1estrdinamicas_PabloPollos;

import java.io.Serializable;

public class Académico implements Comparable, Serializable {
    
	private static final long serialVersionUID = 3L;
	private String nombre;
    private int aIngreso;

    public Académico(String nombre, int aIngreso) {
        this.nombre = nombre;
        this.aIngreso = aIngreso;
    }
    
    public String getNombre() {
		return (this.nombre);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getaIngreso() {
		return (this.aIngreso);
	}

	public void setaIngreso(int aIngreso) {
		this.aIngreso = aIngreso;
	}

	@Override
    public int compareTo(Object o) {	//compara según nombre
    	Académico acad=(Académico) o;
        return (this.nombre.compareTo(acad.nombre));
    }

    @Override
    public String toString() {
        return "Academico{" + "nombre=" + this.nombre
                + ", año de ingreso=" + this.aIngreso + "}\n";
    }
}
