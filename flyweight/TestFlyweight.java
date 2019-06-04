package dp.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		Bon[] listaBonuri = new Bon[50];
		DateBon[] listaDateBonuri = new DateBon[50];
		
		int nrBonuriPrintate =50;
		
		for(int i=0;i<nrBonuriPrintate;i++) {
			listaBonuri[i] = FlyweightFactoryBon.getBon(ETipBon.valueOf("FORMAT"+(i%3+1)));
			listaDateBonuri[i] = new DateBon(150+i);
		}
		
		for(int i=0;i<nrBonuriPrintate;i++) {
			listaBonuri[i].priteazaBon(listaDateBonuri[i]);
		}
		
		System.out.println("\nNr bonuri create "+FlyweightFactoryBon.getNrBonuri());

	}

}
