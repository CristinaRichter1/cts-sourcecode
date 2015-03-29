package ro.ase.csie.cts;

import ro.ase.csie.cts.Address.AddressBuilder;

public class Test {

	public static void main(String[] args) {
		
		Address address1 = new AddressBuilder("Romania","010552")
		.addCity("Bucharest")
		.addStreet("Calea Dorobanti")
		.addStreetNumber(15)
		.build();
		
		System.out.println(address1);
	}

}
