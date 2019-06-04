package dp.composite;

public class Produs extends ANod{
	String denumire;
	float pret;
	
	public Produs(String denumire, float pret) {
		super();
		this.denumire = denumire;
		this.pret = pret;
	}

	@Override
	String getDenumire() {
		return this.denumire;
	}

	@Override
	float getPret() {
		return this.pret;
	}

}
