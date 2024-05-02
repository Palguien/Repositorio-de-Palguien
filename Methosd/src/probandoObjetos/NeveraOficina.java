package probandoObjetos;


public class NeveraOficina {
	//ATRIBUTOS
	private Empleado dueño;
	private Bottle[] nevera;
	//CONSTRUCTOR
	public NeveraOficina(Empleado owner, int capacidad){
		Bottle[] neveraAux= new Bottle[capacidad];
		setDueño(owner);
		setNevera(neveraAux);
	}
	
	public NeveraOficina(Empleado owner, int capacidad, Bottle[] contenido){
		Bottle[] neveraAux= new Bottle[capacidad];
		setNevera(neveraAux);
		if(contenido.length>capacidad) {
			throw new IllegalArgumentException("No metas más botellas que la capacidad límite");
		}else {
			setDueño(owner);
			for (int i = 0; i < contenido.length; i++) {
				añadirBottle(contenido[i],i);
			}
		}
		
	}


	//MÉTODOS
	public void añadirBottle(Bottle bottle, int pos) {
		if(pos>this.nevera.length-1 || pos<0) {
			throw new IllegalArgumentException("No intentes meter una botella más allá de la capacidad de la nevera");
		}
		System.out.println(getBotella(pos));
		if(getBotella(pos)==null) {
			this.nevera[pos]=bottle;
		}else {
			throw new IllegalArgumentException("Espacio ocupado");
		}
		
	}
	
	public Bottle getBotella(int pos) {
		return getNevera()[pos];	
	}
	
	public Bottle sacarBotella(int pos) {
		Bottle botellaAux = getBotella(pos);
		añadirBottle(null,pos);
		return botellaAux;
	}
	
	public void printNevera() {
		System.out.println("-----------------------------");
		System.out.println("Dueño: "+getDueño());
		System.out.print("[");
		for (int i = 0; i < nevera.length; i++) {
			System.out.print(getBotella(i)+" ");
		}
		System.out.print("]\n-----------------------------\n");
	}
	
	public void printNeveraContenido() {
		System.out.println("-----------------------------");
		System.out.println("Dueño: "+getDueño());
		System.out.print("[");
		for (int i = 0; i < nevera.length; i++) {
			if(getBotella(i)==null) {
				System.out.println(getBotella(i)+" ");
			}else {
				getBotella(i).printBottle();
			}
			
		}
		System.out.print("]\n-----------------------------\n");
	}
	
	//GET Y SET
	private Empleado getDueño() {
		return dueño;
	}

	private void setDueño(Empleado dueño) {
		this.dueño = dueño;
	}

	private Bottle[] getNevera() {
		return nevera;
	}

	private void setNevera(Bottle[] nevera) {
		this.nevera = nevera;
	}

}
