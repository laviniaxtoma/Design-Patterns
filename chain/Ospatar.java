package dp.chain;

public class Ospatar extends Handler{

	@Override
	void procesareComanda(Comanda c) {
		if(c.getGradDificultate() <= 5)
			System.out.println("Ospatarul a servit comanda "+c.getProdus());
		else {
			System.out.println("Ospatarul nu poate servi. Trimite mai departe.");
			if(this.succesor != null)
				succesor.procesareComanda(c);
		}
		
	}

}
