package exempluProxy;

public class TestProxy {

	public static void main(String[] args) {
        final InterfataImagine IMAGE1 = 
        		new ProxyImagine("Photo1");
        final InterfataImagine IMAGE2 = 
        		new ProxyImagine("Photo2");
 
        IMAGE1.afisareImagine();
        IMAGE1.afisareImagine();
        IMAGE2.afisareImagine();
        IMAGE2.afisareImagine();
        IMAGE1.afisareImagine();
	}

}
