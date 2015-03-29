package exempluProxy;

public class ProxyImagine implements InterfataImagine{

	private Imagine imagineReala = null;
	private String  fisier = null;
	
	public ProxyImagine(final String imagine) { 
        this.fisier = imagine; 
    }
	@Override
	public void afisareImagine() {
		if(imagineReala == null)
			imagineReala = new Imagine(fisier);
		imagineReala.afisareImagine();
	}

}
