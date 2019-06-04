package dp.command;

public class TestCommand {

	public static void main(String[] args) {
		Bucatar b1 = new Bucatar("Bucatar1");
		Bucatar b2 = new Bucatar("Bucatar2");
		
		Ospatar ospatar = new Ospatar();
		
		ospatar.preiaComanda(new ComandaPaste(b1,"paste1"));
		ospatar.preiaComanda(new ComandaPizza(b1, "pizza1"));
		ospatar.preiaComanda(new ComandaPaste(b2, "paste2"));
		
		//plasarea intarziata a tuturor comenzilor
		ospatar.transmiteComenzi();
	}

}
