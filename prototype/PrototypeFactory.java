package dp.prototype;

import java.util.HashMap;

public class PrototypeFactory {
	private static HashMap<String, AContractEveniment> prototipuri = new HashMap<String,AContractEveniment>();
	
	static {
		System.out.println("Incarcare lista prototipuri");
		AContractEveniment contractParty = new ContractParty();
		prototipuri.put("party", contractParty);
		AContractEveniment contractCorporate = new ContractCorporate();
		prototipuri.put("corporate", contractCorporate);
	}
	
	public static AContractEveniment getPrototip(String tip) {
		AContractEveniment contract = null;
		AContractEveniment prototipContract = prototipuri.get(tip);
		if(prototipContract != null) {
			contract = (AContractEveniment) prototipContract.clone();
		}
		return contract;
	}
}
