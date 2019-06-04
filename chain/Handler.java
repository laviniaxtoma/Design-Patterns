package dp.chain;

public abstract class Handler {
	protected Handler succesor = null;

	public void setSuccesor(Handler succesor) {
		this.succesor = succesor;
	}
	
	abstract void procesareComanda(Comanda c);
}
