package dp.adapter;

public class EvalauareFirmaA implements IEvaluareFirmaA{

	@Override
	public void analizeazaClientFirmaA(int costTotalEvenimente) {
		System.out.println("Metoda evaluare client Firma A");
		double procentDiscount = 0;
		
		if(costTotalEvenimente > 1000)
			procentDiscount = 0.10;
		if(costTotalEvenimente > 500)
			procentDiscount = 0.06;
		
		System.out.println("S-a oferit un discount de "+procentDiscount);
	}

}
