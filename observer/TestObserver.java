package dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		Eveniment ev = new Eveniment();
		
		Handler h1 = new HandlerA();
		Handler h2 = new HandlerB();
		//abonare observatori la eveniment
		ev.addHandler(h1);
		ev.addHandler(h2);

		//declansare eveniment
		ev.publicareEveniment();
	}

}
