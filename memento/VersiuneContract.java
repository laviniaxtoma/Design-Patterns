package dp.memento;

public class VersiuneContract {
	private String clauzeContractuale;

	public VersiuneContract() {
		this.clauzeContractuale = "";
	}

	public VersiuneContract(String clauzeContractuale) {
		this.clauzeContractuale = clauzeContractuale;
	}

	public String getClauzeContractuale() {
		return clauzeContractuale;
	}
}
