package ro.csie.ase.cts;

public class Test {

	public static void main(String[] args) {

		// Receiver
		Bucatar bucatar = new Bucatar("Gigel");

		int numarMasa = 6;
		// Invoker
		Chelner chelner = new Chelner(numarMasa);

		chelner.preiaComanda(new ComandaPizza(bucatar, "Taraneasca"));
		chelner.preiaComanda(new ComandaPizza(bucatar, "Exotica"));
		chelner.preiaComanda(new ComandaSupa(bucatar, "Supa de pui"));

		chelner.trimiteComenzi();
	}
}
