package dp.chain;

public class Comanda {
	private String produs;
	private int gradDificultate;
	
	public Comanda(String produs, int gradDificultate) {
		super();
		this.produs = produs;
		this.gradDificultate = gradDificultate;
	}

	public String getProdus() {
		return produs;
	}

	public int getGradDificultate() {
		return gradDificultate;
	}
	
	
}
