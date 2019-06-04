package dp.prototype;

import java.util.ArrayList;

public class ContractParty extends AContractEveniment{

	public ContractParty() {
		System.out.println("Incarcare contract party");
		listaClauze = new ArrayList<>(5);
		this.tip = "party";
	}
	
	@Override
	void printare() {
		System.out.println("Printare contract de tip party");
	}

}
