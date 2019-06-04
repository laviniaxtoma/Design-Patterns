package dp.composite;

import java.util.ArrayList;

public class Structura extends ANod{
	ArrayList<ANod> structura = new ArrayList<>();
	String denumireStructura;
	
	public Structura(String denumireStructura) {
		super();
		this.denumireStructura = denumireStructura;
	}

	@Override
	String getDenumire() {
		throw new UnsupportedOperationException();
	}

	@Override
	float getPret() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getInfo() {
		String info = this.denumireStructura+"\n";
		
		for(ANod nod:structura) {
			info += " " + nod.getInfo() + "\n";
		}
		
		return info;
	}

	@Override
	public void adaugaNod(ANod elem) {
		structura.add(elem);
	}

	@Override
	public void eliminaNod(ANod elem) {
		structura.remove(elem);
	}

	@Override
	public ANod getNod(int i) {
		return structura.get(i);
	}

}
