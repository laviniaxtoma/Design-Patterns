package dp.flyweight;

public class Bon implements IBonPrintabil{
	private ETipBon tip;
	
	public Bon(ETipBon tip) {
		this.tip = tip;
	}
	
	public ETipBon getTip() {
		return tip;
	}

	@Override
	public void priteazaBon(DateBon bon) {
		System.out.println("Bonul cu consumatia " + 
	bon.getPretConsumatie() + " in format "+ tip);
	}

}


