package practica3excep;

public class Electrodomestico {
	static int idenGlobal=0;
	protected int id=0;
	protected Calif califEner;
	protected int consumo;
	
	public Electrodomestico() {
		Electrodomestico.idenGlobal++;
		this.id=Electrodomestico.idenGlobal;
		
	}
	
	public Electrodomestico(Calif califEner, int consumo) {
		Electrodomestico.idenGlobal++;
		this.id=Electrodomestico.idenGlobal;
		this.califEner = califEner;
		this.consumo = consumo;
	}
	
	
	public static int getIdenGlobal() {
		return idenGlobal;
	}

	public static void setIdenGlobal(int idenGlobal) {
		Electrodomestico.idenGlobal = idenGlobal;
	}

	public int getId() {
		return id;
	}

	public Calif getCalifEner() {
		return califEner;
	}
	public void setCalifEner(Calif califica) {
		this.califEner = califica;
	}
	public int getConsumo() {
		return consumo;
	}
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

}
