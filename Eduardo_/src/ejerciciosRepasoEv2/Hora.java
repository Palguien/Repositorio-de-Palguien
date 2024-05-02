package ejerciciosRepasoEv2;

public class Hora {
	private int hora;
	private int minuto;
	private int segundo;
	
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if(hora>0&&hora<24) {
			this.hora=hora;
		}else 
			this.hora=0;		
	}
	
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if(minuto>0&&minuto<60) {
		this.minuto=minuto;
		}else
			this.minuto=0;
	}
	
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		if(segundo>0&&segundo<60) {
		this.segundo=segundo;
		}else
			this.segundo=0;
	}
	public void incrementarSegundo(int segundo) {
		this.segundo++;
		if(this.segundo>=60) {
			this.segundo-=60;
			this.minuto++;
		}
		if(this.minuto>=60) {
			this.minuto-=60;
			this.hora++;
		}
		if(this.hora>=24) {
			this.hora=0;
		}
		
			
	}
	public void mostrarDatos() {
		System.out.println("Hora: " +hora+":"+minuto+":"+segundo+".");
		
	}
}
