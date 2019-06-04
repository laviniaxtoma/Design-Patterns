package dp.command;

import java.util.ArrayList;

public class Ospatar {
	private ArrayList<IComanda> listaComenzi = new ArrayList<>();
	
	public void preiaComanda(IComanda comanda) {
		listaComenzi.add(comanda);
	}
	
	public void transmiteComenzi() {
		for(IComanda c: listaComenzi)
			c.prelucreaza();
		listaComenzi.clear();
	}
}
