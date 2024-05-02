package probandoObjetos;

public class Asteriscos {
	//ATRIBUTOS
	private int dist;
	private char cosa;
	//CONSTRUCTOR
	public Asteriscos(int dist) {
		setDist(dist);
		setCosa('*');
		printAsteriscos();
	}
	public Asteriscos(int dist,char cosa) {
		setDist(dist);
		setCosa(cosa);
		printAsteriscos();
	}
	//GET Y SET
	public int getDist() {
		return dist;
	}

	public void setDist(int dist) {
		this.dist = dist;
	}
	public char getCosa() {
		return cosa;
	}
	public void setCosa(char cosa) {
		this.cosa = cosa;
	}
	//metodos
	public void printAsteriscos() {
		
		for (int i = 0; i < getDist(); i++) {
			System.out.print(getCosa());
		}
		
		System.out.println();
	}

	
}
