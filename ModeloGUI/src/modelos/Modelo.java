package modelos;


public class Modelo {
	private String[] palabras = {"pollo","pallo","volcarona","cosa"};
	
	public String aleatoria(){
		int alea=(int) Math.floor(Math.random()*(palabras.length-1));
		return palabras[alea];
		
	}
}
