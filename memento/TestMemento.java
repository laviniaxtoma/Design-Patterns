package dp.memento;


public class TestMemento {

	public static void main(String[] args) {
		ManagerVersiuni managerContracte = new ManagerVersiuni();
		Contract contract = new Contract("Client1");
		
		//salvare versiuni contracte
		contract.addClauza("Clauza1");
		System.out.println(contract);
		contract.addClauza("Clauza2");
		System.out.println(contract);
		managerContracte.adaugaVersiune(contract.saveVersiune());
		
		contract.addClauza("Clauza3");
		System.out.println(contract);
		managerContracte.adaugaVersiune(contract.saveVersiune());
		
		//recuperare versiuni anterioare
		contract.restoreFromVersiune
		(managerContracte.recuperareVersiune(0));
		System.out.println(contract);
	}

}
