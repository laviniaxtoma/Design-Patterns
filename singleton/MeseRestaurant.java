package dp.singleton;

import java.util.Arrays;

public class MeseRestaurant {
	private static MeseRestaurant instance = null;
	private int nrMese = 10;
	private boolean[] ocupareMese = new boolean[nrMese];
	
	private MeseRestaurant() throws Exception {
		if(instance != null)
			throw new Exception("Obiect deja creat");
	}
	
	public static MeseRestaurant getInstance() throws Exception {
		if(instance == null)
			instance = new MeseRestaurant();
		return instance;
	}
	
	public void ocupaMasa(int i) {
		if(i >= 0 && i< nrMese && ocupareMese[i] == false)
			ocupareMese[i] = true;
	}

	@Override
	public String toString() {
		return "MeseRestaurant [nrMese=" + nrMese + ", ocupareMese=" + Arrays.toString(ocupareMese) + "]";
	}
	
}
