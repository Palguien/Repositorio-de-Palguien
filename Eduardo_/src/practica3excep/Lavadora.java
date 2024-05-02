package practica3excep;

public class Lavadora extends Lavadoravajilla{
	protected int KgRopa;

	public Lavadora() {
		super();		
	}
	
	public Lavadora(Calif califEner,int consumo,int consumoMedio,int KgRopa) {
		super(califEner,consumo,consumoMedio);
		this.KgRopa=KgRopa;		
	}
	
	public Lavadora(int KgRopa) {
		super();
		this.KgRopa=KgRopa;
	}

	public int getKgRopa() {
		return KgRopa;
	}

	public void setKgRopa(int kgRopa) {
		KgRopa = kgRopa;
	}	
	
	public int getConsumoMedio() {
		return(super.getConsumoMedio());
	}
	
	
	
}

