package clases;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Texto{
	String cadena;
	final int LONGMAX;
	private LocalDate fCreacion;
	private LocalDateTime ultimaModif;
	static final String VOCALES="aeiouáéíóú";
	
	//constructor
	public Texto(int lon) {
		this.LONGMAX=lon;
		this.fCreacion=LocalDate.now();
		this.ultimaModif=null;
	}
	
	//metodo para añadir un caracter al principio
	public void addComienzo(char l) {
	}
	
	//metodo para añadir un caracter al final
	public void addFinal(char x) {
	}
	
	//metodo para añadir una cadena principio
	public void addComienzo(String w) {
	}	
	
	//metodo para añadir una cadena al final
	public void addFinal(String o) {
	}
	
	public int numVocales() {
		int num=0;
		return (num);
	}
	public boolean esVocal(char l) {
		boolean vocal=false;
		//pasar a minusculas
		l=Character.toLowerCase(l);
		if(VOCALES.indexOf(l)!=-1)
			vocal=true;
		return(vocal);
	
	}
	
	//mostrar datos
	public void mostrarDatos() {
		System.out.println("Fecha objeto texto: "+this.fCreacion);
	}
	
}
