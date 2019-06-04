package dp.state;

public class Angajat {
	// stare curenta angajat
	IStare stareCurenta;

	public Angajat() {
		this.stareCurenta = new StareTura();
	}

	public void setStare(EStare stare) {
		// logica de trecere dintr-o stare in alta
		if (stare == EStare.CONCEDIU)
			this.stareCurenta = new StareConcediu();
		else if (stare == EStare.PAUZA)
			this.stareCurenta = new StarePauza();
		else
			this.stareCurenta = new StareTura();
	}
	
	public void procesareMesaj(String mesaj) {
		this.stareCurenta.act(mesaj);
	}

}
