package dp.observer;

public class Eveniment extends Observabil{
	private String info;
	private boolean declansareEv = false;
	
	private void activareEveniment() {
		if(!declansareEv) {
			declansareEv = true;
			this.notifyAllObservers();
		}
	}
	
	public void publicareEveniment() {
		System.out.println("Eveniment declansat");
		activareEveniment();
	}
	
}
