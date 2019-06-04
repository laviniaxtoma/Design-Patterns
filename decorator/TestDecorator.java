package dp.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		APizza pizzaA = new PizzaTipA();
		System.out.println("Pizza de baza tip A");
		System.out.println(pizzaA.getComponente());
		System.out.println(pizzaA.getPret());
		
		APizza pizzaACrown = new CrownPizza(pizzaA);
		System.out.println("Pizza de baza tip A decorata crown");
		System.out.println(pizzaACrown.getComponente());
		System.out.println(pizzaACrown.getPret());

	}

}
