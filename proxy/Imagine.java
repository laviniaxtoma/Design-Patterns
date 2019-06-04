package dp.proxy;

public class Imagine implements IShow {
	private String sursa = null;

	@Override
	public void afisareImagine() {
		System.out.println("Se afiseaza imaginea: " + sursa);
	}

	public Imagine(String sursa) {
		super();
		this.sursa = sursa;
		incarcaImagine();
	}
	
	public void incarcaImagine() {
		System.out.println("Se incarca imaginea. Consum...");
	}

}
