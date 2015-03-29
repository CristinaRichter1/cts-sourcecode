package adapterexample;

public class TestAdapter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MesajTipA objA = new MesajTipA();
		objA.setText("Hello Adapter !");
		
		objA.afisare();
		
		Adaptor adaptor2B = new Adaptor(objA);
		InterfataTipB objB = adaptor2B;
		objB.setText(new String[]{"Hello","World"});
		objB.display();
		
	}

}
