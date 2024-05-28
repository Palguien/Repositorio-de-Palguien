package ej3;

import java.util.Objects;

public class Alumno {
	//atributes
	int num;
	String nombre;
	int media;
	String curso;
	
	//constructores
	public Alumno() {
		super();
	}
	public Alumno(int num, String nombre, int media, String curso) {
		super();
		this.num = num;
		this.nombre = nombre;
		this.media = media;
		this.curso = curso;
	}
	//get y set
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMedia() {
		return media;
	}
	public void setMedia(int media) {
		this.media = media;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public int hashCode() {
		return Objects.hash(curso, media, nombre, num);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(curso, other.curso) && media == other.media && Objects.equals(nombre, other.nombre)
				&& num == other.num;
	}
	
}
