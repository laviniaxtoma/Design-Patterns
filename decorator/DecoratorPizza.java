package dp.decorator;

public abstract class DecoratorPizza extends APizza{
	protected APizza pizza;

	public DecoratorPizza(APizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	String getComponente() {
		return pizza.getComponente();
	}

	@Override
	float getPret() {
		return pizza.getPret();
	}
	
	
}
