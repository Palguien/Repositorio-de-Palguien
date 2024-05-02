package herencia;
import java.io.Serializable;

import dialogos.Dialogos;

public class Cliente implements Serializable {

	private int id;
	private String nombre;
	private String direccion;
	
	public void datosCliente() {
		Dialogos dia=new Dialogos();
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	
	
	
	
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
	
}
