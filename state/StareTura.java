package dp.state;

public class StareTura implements IStare{

	@Override
	public void act(String mesaj) {
		System.out.println("Se rezolva problema "+mesaj);
	}

}
