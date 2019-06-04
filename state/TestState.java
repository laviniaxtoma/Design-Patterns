package dp.state;

public class TestState {

	public static void main(String[] args) {
		Angajat angajat = new Angajat();
		
		angajat.procesareMesaj("teava sparta");
		
		//schimbare stare
		angajat.setStare(EStare.CONCEDIU);
		angajat.procesareMesaj("incendiu bucatarie");
		
		angajat.setStare(EStare.PAUZA);
		angajat.procesareMesaj("nu mai este piper");
	}

}
