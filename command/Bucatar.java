package dp.command;

public class Bucatar {
	private String nume;

	public Bucatar(String nume) {
		super();
		this.nume = nume;
	}
	
	//metode specializate pentru diferite comenzi
	public void prelucreazaPizza(String tipPizza) {
		System.out.println("Bucatarul a gatit pizza " + tipPizza);
	}
	
	public void prelucreazaPaste(String tipPaste) {
		System.out.println("Bucatarul a gatit paste "+tipPaste);
	}
}
