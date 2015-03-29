package ro.ase.csie.cts;

/*
 * @author Catalin Boja
 * @description Implementare clasa Adresa postala - varianta clasica cu o combinatie de mai multi constructori
 * 
 * Intrebari:
 * 	- daca numarul de atribute este mare si doar cateva sunt obligatorii ?
 * 	- daca numarul de atribute creste ? 
 * 
 */

public class Address_v1 {
	private final String state;    		//required
    private final String postalCode;    //required
	private final String city;    		//optional
    private final String street;    	//optional
    private final int streetNumber;    	//optional
    
    public Address_v1(String state, String postalCode) {
        this(state, postalCode, 0);
    }

    public Address_v1(String state, String postalCode, int streetNumber) {
        this(state, postalCode, streetNumber, null);
    }

    public Address_v1(String state, String postalCode, int streetNumber, String city) {
        this(state, postalCode, streetNumber, city, null);
    }

    public Address_v1(String state, String postalCode, int streetNumber, String city, String street) {
        this.state = state;
        this.postalCode = postalCode;
        this.streetNumber = streetNumber;
        this.city = city;
        this.street = street;
    }

	public String getState() {
		return state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public int getStreetNumber() {
		return streetNumber;
	}
    
    
}
