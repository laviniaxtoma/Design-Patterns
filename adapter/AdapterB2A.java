package dp.adapter;

public class AdapterB2A extends EvalauareFirmaA implements IEvaluareFirmaB{

	//transforma un Client intr-un int(cost total evenimente)
	public int costTotalEvenimente(Client client) {
		int costTotal = 0;
		for(int i=0;i<client.getNrEvenimente();i++) {
			costTotal +=client.getCostEvenimente()[i];
		}
		return costTotal;
	}
	
	@Override
	public void analizeazaClientFirmaB(Client client) {
		System.out.println("Metoda analiza client Firma B");
		this.analizeazaClientFirmaA(costTotalEvenimente(client));
		
	}

}
