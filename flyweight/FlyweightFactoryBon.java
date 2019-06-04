package dp.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactoryBon {
	private static Map<ETipBon, Bon> bonuri = new HashMap<ETipBon, Bon>();
	
	public static Bon getBon(ETipBon tip) {
		Bon bon = bonuri.get(tip);
		
		if(bon == null) {
			bon = new Bon(tip);
			bonuri.put(tip, bon);
		}
		
		return bon;
	}
	
	public static int getNrBonuri() {
		return bonuri.size();
	}
}
