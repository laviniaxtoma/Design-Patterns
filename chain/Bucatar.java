package dp.chain;

public class Bucatar extends Handler{

	@Override
	void procesareComanda(Comanda c) {
		if(c.getGradDificultate()>=5 )
			System.out.println("Bucatarul a procesat comanda " +c.getProdus());
	}

}
