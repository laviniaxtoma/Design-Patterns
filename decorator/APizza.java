package dp.decorator;

public abstract class APizza {
	private String denumire;
	private float cost;
	
	abstract String getComponente();
	abstract float getPret();
}
