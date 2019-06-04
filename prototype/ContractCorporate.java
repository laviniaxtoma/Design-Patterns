package dp.prototype;

import java.util.ArrayList;

public class ContractCorporate extends AContractEveniment{

	public ContractCorporate() {
		System.out.println("Incarcare contract corporate");
		listaClauze = new ArrayList<>(10);
		this.tip = "corporate";
	}
	
	@Override
	void printare() {
		System.out.println("Printare contract de tip corporate");
	}

}
