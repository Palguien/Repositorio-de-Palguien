package practica3excep;

public class Lavadoravajilla extends Electrodomestico{
	protected int consumoMedio;

	public Lavadoravajilla() {
		super();		
	}
	
	public Lavadoravajilla(Calif califEner,int consumo,int consumoMedio) {
		super(califEner,consumo);
		this.consumoMedio=consumoMedio;
	}
	
	public Lavadoravajilla(int consumoMedio) {
		super();
		this.consumoMedio = consumoMedio;
	}

	public int getConsumoMedio() {
		return consumoMedio;
	}

	public void setConsumoMedio(int consumoMedio) {
		this.consumoMedio = consumoMedio;		
	}	

}
