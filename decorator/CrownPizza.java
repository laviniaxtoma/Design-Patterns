package dp.decorator;

public class CrownPizza extends DecoratorPizza{

	public CrownPizza(APizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getComponente() {
		// TODO Auto-generated method stub
		return super.getComponente() + ", blat crown";
	}

	@Override
	float getPret() {
		// TODO Auto-generated method stub
		return super.getPret() + 10;
	}
	
	
}
