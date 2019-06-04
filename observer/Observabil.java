package dp.observer;

import java.util.ArrayList;

public abstract class Observabil {
	//lista observatori
	ArrayList<Handler> listaObservatori = new ArrayList<>();
	
	public void addHandler(Handler h) {
		listaObservatori.add(h);
	}
	
	public void removeHandler(Handler h) {
		listaObservatori.remove(h);
	}
	
	public void notifyAllObservers() {
		if(listaObservatori!=null)
			for(Handler h:listaObservatori)
				h.act();
	}
}
