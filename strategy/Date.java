package dp.strategy;

public class Date {
	private int[] valori = null;
	private IStrategy strategie;

	public Date(int[] valori) {
		super();
		this.valori = valori;
	}
	
	public Date(int nr) {
		valori = new int[nr];
		for(int i=0;i<nr;i++)
			valori[i]=100+i;
	}

	public void setStrategie(IStrategy strategie) {
		this.strategie = strategie;
	}
	
	public int preluareValoare() {
		return strategie.procesare(valori);
	}
	
}
