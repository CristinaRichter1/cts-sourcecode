package facadeexample;

public class TestFacade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApartamentFacade apartament = new ApartamentFacade(new Fereastra(), new RobinetApa(), new UsaLocuinta(), new MasinaSpalat());
		
		apartament.inchideCasa();

	}

}
