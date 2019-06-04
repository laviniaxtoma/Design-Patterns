package dp.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		//obj de lucru (client)
		int[] costuri = new int[] {10,400,30,500};
		int costuriTotale = 940;
		Client client = new Client("Costachescu", 4, costuri);
		//Firma A
		IEvaluareFirmaA evaluareFirmaA = new EvalauareFirmaA();
		evaluareFirmaA.analizeazaClientFirmaA(costuriTotale);
		//Firma B
		IEvaluareFirmaB evaluareFirmaB = new AdapterB2A();
		evaluareFirmaB.analizeazaClientFirmaB(client);

	}

}
