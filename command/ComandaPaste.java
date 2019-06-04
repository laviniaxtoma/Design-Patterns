package dp.command;

public class ComandaPaste implements IComanda{
	private Bucatar bucatar;
	private String tipPaste;
	
	public ComandaPaste(Bucatar bucatar, String tipPaste) {
		super();
		this.bucatar = bucatar;
		this.tipPaste = tipPaste;
	}

	@Override
	public void prelucreaza() {
		bucatar.prelucreazaPaste(tipPaste);
	}

}
