package dp.template;

public abstract class AWorkFlow {
	public abstract void act1();
	public void act2() {
		System.out.println("Actiune 2");
	}
	public final void work() {
		act1();
		act2();
	}
}
