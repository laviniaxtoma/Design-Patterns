package dp.memento;


public class Contract {
	private String numeClient;
	private String clauzeContractuale;
	
	public Contract(String numeClient) {
		super();
		this.numeClient = numeClient;
		this.clauzeContractuale = "";
	}
	
	public void addClauza(String clauza) {
		clauzeContractuale += "\n" + clauza;
	}

	@Override
	public String toString() {
		return "Contract [numeClient=" + numeClient + ", clauzeContractuale=" + clauzeContractuale + "]";
	}
	
	public void restoreFromVersiune(VersiuneContract versiuneContract){
		this.clauzeContractuale = versiuneContract.getClauzeContractuale();
	}
	
	public VersiuneContract saveVersiune(){
		System.out.println("Salvare versiune contract");
		return new VersiuneContract(clauzeContractuale);
	}
}
