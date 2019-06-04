package dp.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		MeseRestaurant m1 = null;
		MeseRestaurant m2 = null;
		try {
			m1 = MeseRestaurant.getInstance();
			m2 = MeseRestaurant.getInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		m1.ocupaMasa(3);
		System.out.println(m1);
		System.out.println(m2);
		
		if(m1 == m2)
			System.out.println("Referinte identice");
		else
			System.out.println("Referintele nu sunt identice");
	}

}
