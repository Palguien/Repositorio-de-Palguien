package pg232;

import java.time.LocalDate;

public class Texto {
	//atributes
	private String texto="";
	private int maxLong;
	private LocalDate creationDate;
	private LocalDate modificationDate;
	//builder
	public Texto(int longitud) {
		setMaxLong(longitud);
		setCreationDate(LocalDate.now());
		setModificationDate(LocalDate.now());
			
	}
	//method
	public void addCadenaIni(String moretext) throws LengthException {
		if(texto.length()+moretext.length()>maxLong) {
			throw new LengthException();
		}else {
			texto=moretext+texto;
			setModificationDate(LocalDate.now());
		}
	}
	public void addCadenaFin(String moretext) throws LengthException {
		if(texto.length()+moretext.length()>maxLong) {
			throw new LengthException();
		}else {
			texto=texto+moretext;
			setModificationDate(LocalDate.now());
		}
	}
	public void addCharIni(char carac) throws LengthException {
		if(texto.length()+1>maxLong) {
			throw new LengthException();
		}else {
			texto=carac+texto;
			setModificationDate(LocalDate.now());
		}
	}
	public void addCharFin(char carac) throws LengthException {
		if(texto.length()+1>maxLong) {
			throw new LengthException();
		}else {
			texto=texto+carac;
			setModificationDate(LocalDate.now());
		}
	}
//	public int countVocales() {
//		String vocales= "AaEeIiOoUu";
//		int vocalCount=0;
//		for (int i = 0; i < texto.length(); i++) {
//			if(vocales.contains(texto.charAt(i))>=0) {
//				vocalCount++;
//			}
//		}
//		
//		return vocalCount;
//		
//	}
	public int countVocales() {
		String vocales= "AaEeIiOoUu";
		int vocalCount=0;
		for (int i = 0; i < texto.length(); i++) {
			for (int j = 0; j < vocales.length(); j++) {
				if(vocales.charAt(j)==texto.charAt(i)) {
					vocalCount++;
					break;
				}
			}
		}
		
		return vocalCount;
		
	}
	//get y set
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getMaxLong() {
		return maxLong;
	}

	public void setMaxLong(int maxLong) {
		this.maxLong = maxLong;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}
	private void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDate getModificationDate() {
		return modificationDate;
	}
	private void setModificationDate(LocalDate modificationDate) {
		this.modificationDate = modificationDate;
	}
	@Override
	public String toString() {
		return "Texto [texto=" + texto + ", maxLong=" + maxLong + "]";
	}
}
