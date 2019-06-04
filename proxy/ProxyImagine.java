package dp.proxy;

public class ProxyImagine implements IShow{
	private Imagine imagineReala = null;
	private String sursa = null;
	
	public ProxyImagine(String sursa) {
		super();
		this.sursa = sursa;
	}

	@Override
	public void afisareImagine() {
		if(imagineReala == null) {
			imagineReala = new Imagine(sursa);
		}
		imagineReala.afisareImagine();
	}

}
