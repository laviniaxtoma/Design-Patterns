package dp.command;

public class ComandaPizza implements IComanda{
	//referinta la executant
	private Bucatar bucatar;
	private String tipPizza;
	
	public ComandaPizza(Bucatar bucatar, String tipPizza) {
		super();
		this.bucatar = bucatar;
		this.tipPizza = tipPizza;
	}

	@Override
	public void prelucreaza() {
		bucatar.prelucreazaPizza(tipPizza);
	}

}
