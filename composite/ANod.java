package dp.composite;

public abstract class ANod {
	abstract String getDenumire();
	abstract float getPret();
	
	public String getInfo() {
		return this.getDenumire() + " " + this.getPret();
	}
	
	public void adaugaNod(ANod elem) {
		throw new UnsupportedOperationException();
	}
	
	public void eliminaNod(ANod elem) {
		throw new UnsupportedOperationException();
	}
	
	public ANod getNod(int i) {
		throw new UnsupportedOperationException();
	}
}
