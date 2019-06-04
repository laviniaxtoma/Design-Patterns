package dp.prototype;

import java.util.ArrayList;

public abstract class AContractEveniment implements Cloneable{
	private String id;
	protected String tip;
	protected ArrayList<Object> listaClauze;
	
	abstract void printare();

	@Override
	protected Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return clone;
	}

	public void setId(String id) {
		this.id = id;
	}


	public ArrayList<Object> getListaClauze() {
		return listaClauze;
	}

	@Override
	public String toString() {
		return "AContractEveniment [id=" + id + ", tip=" + tip + "]";
	}
	
}
