package dp.state;

public class StareConcediu implements IStare{

	@Override
	public void act(String mesaj) {
		System.out.println("Angajat in concediu. Nu poate rezolva problema "+mesaj);
	}

}
