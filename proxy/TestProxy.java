package dp.proxy;

public class TestProxy {

	public static void main(String[] args) {
		IShow img1 = new ProxyImagine("carul cu boi");
		IShow img2 = new ProxyImagine("tarancuta");
		
		img1.afisareImagine();
		img1.afisareImagine();
		img1.afisareImagine();
	}

}
