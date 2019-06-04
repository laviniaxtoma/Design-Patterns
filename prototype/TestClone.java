package dp.prototype;

public class TestClone {

	public static void main(String[] args) {
		//fara Prototype
		ContractCorporate contractC1 = new ContractCorporate();
		contractC1.setId("1");
		System.out.println(contractC1);
		ContractCorporate contractC2 = new ContractCorporate();
		contractC2.setId("2");
		System.out.println(contractC2);
		
		if(contractC1.getListaClauze() == contractC2.getListaClauze())
			System.out.println("Aceleasi clauze contractuale");
		
		//folosind Prototype
		AContractEveniment contractC3 = PrototypeFactory.getPrototip("corporate");
		AContractEveniment contractC4 = PrototypeFactory.getPrototip("corporate");
		contractC3.setId("3");
		contractC4.setId("4");
		System.out.println(contractC3);
		System.out.println(contractC4);
		
		if(contractC3.getListaClauze() == contractC4.getListaClauze())
			System.out.println("Aceleasi clauze contractuale");
	}

}
