package dp.chain;

public class TestChain {

	public static void main(String[] args) {
		Comanda c1 = new Comanda("cafea", 3);
		Comanda c2 = new Comanda("pizza", 15);
		
		//creare lant 
		Handler ospatar = new Ospatar();
		Handler bucatar = new Bucatar();
		ospatar.setSuccesor(bucatar);
		
		//trimitere comenzi la first handler
		ospatar.procesareComanda(c1);
		ospatar.procesareComanda(c2);
	}

}
