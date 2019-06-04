package dp.composite;

public class TestComposite {

	public static void main(String[] args) {
		// level 0
		Structura structuraMeniu = new Structura("Meniu restaurant");
		
		//level 1
		Structura meniuBauturi = new Structura("Bauturi");
		Structura meniuMancare = new Structura("Mancare");
		structuraMeniu.adaugaNod(meniuBauturi);
		structuraMeniu.adaugaNod(meniuMancare);
		
		//level 2 Bauturi
		meniuBauturi.adaugaNod(new Produs("Cafea",14));
		meniuBauturi.adaugaNod(new Produs("Coca cola",8));
		
		//level 2 Mancare
		Structura meniuPizza = new Structura("Pizza");
		Structura meniuPaste = new Structura("Paste");
		meniuMancare.adaugaNod(meniuPizza);
		meniuMancare.adaugaNod(meniuPaste);
		
		//level 3 Pizza
		meniuPizza.adaugaNod(new Produs("Pizza Romana",27));
		meniuPizza.adaugaNod(new Produs("Pizza Picanta",29));
		
		//level 3 Paste
		meniuPaste.adaugaNod(new Produs("Paste carbonara",31));
		meniuPaste.adaugaNod(new Produs("Paste bologneze",29));
		
		//afisare elem structura
		System.out.println(structuraMeniu.getInfo());
	}

}
