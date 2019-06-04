package dp.state;

public class StarePauza implements IStare{

	@Override
	public void act(String mesaj) {
		System.out.println("Angajatul iese din tura. Rezolva problema " + mesaj);
	}

}
