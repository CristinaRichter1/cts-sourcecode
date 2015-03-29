package facadeexample;

public class ApartamentFacade {
	Fereastra fereastra;
	RobinetApa robinet;
	UsaLocuinta usa;
	MasinaSpalat masina;
	
	public ApartamentFacade(Fereastra fereastra, 
	RobinetApa robinet, 
	UsaLocuinta usa, 
	MasinaSpalat masina){
		this.fereastra = fereastra;
		this.robinet = robinet;
		this.usa = usa;
		this.masina = masina;
	}
	
	public void inchideCasa(){
		this.fereastra.inchide();
		this.robinet.inchide();
		this.masina.inchide();
		this.usa.inchide();
	}

}
