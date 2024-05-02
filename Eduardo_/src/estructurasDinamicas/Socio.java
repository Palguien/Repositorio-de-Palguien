package estructurasDinamicas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class Socio implements Comparable{
	private int id;
	private String nombre;
	LocalDate fechaNacimiento;
	public Socio(int id, String nombre, String fechaNacimiento) {		
		this.id = id;
		this.nombre = nombre;
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");		
		this.fechaNacimiento=LocalDate.parse(fechaNacimiento,f);
	}
	public int edad() {
		int años=(int) this.fechaNacimiento.until(LocalDate.now(),ChronoUnit.YEARS);
		return(años);
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
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public int compareTo(Object ob) {
		int resul;
		Socio otroS=(Socio) ob;
		if (this.id<otroS.id)
			resul=-1;
		else
			if (this.id==otroS.id)
				resul=0;
			else
				resul=1;
		return (resul);
	}
	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}	

}
