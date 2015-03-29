package ro.ase.csie.cts;


/*
 * @author Catalin Boja
 * @description Implementare clasa Adresa postala - varianta cu builder
 * 
 * 
 * Modificari:
 * 	- Atributele sunt final si clasa este immutable
 * 
 * Intrebari:
 * 	- daca numarul de atribute este mare si doar cateva sunt obligatorii ?
 * 	- daca numarul de atribute creste ? 
 * 
 */
public class Address {
	private final String state;    		//required
    private final String postalCode;    //required
	private String city;    		//optional
    private String street;    	//optional
    private int streetNumber;    	//optional
    
    /*
     * Constructorul este privat si are argumente pentru campurile obligatorii
     * 
     * O alternativa este implementarea unui constructor ce primeste argumente pentru toate atributele
     */
    private Address(String state, String postalCode) {
        this.state = state;
        this.postalCode = postalCode;
    }

    /*
     * Interfata publica
     * 
     */
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
	
	@Override
	public String toString(){
		return String.format("State: %s, code: %s, %s, %s street, %d",this.state,this.postalCode,this.city,this.street, this.streetNumber);
	}
    
	/*
	 * 
	 * Builder-ul intern
	 * 
	 */
    public static class AddressBuilder{
        private Address nestedAddress;
        
        public AddressBuilder(String state, String postalCode){
        	this.nestedAddress = new Address(state, postalCode);
        }
        
        public AddressBuilder addCity(String city){
        	this.nestedAddress.city = city;
        	return this;
        }
        
        public AddressBuilder addStreet(String street){
        	this.nestedAddress.street = street;
        	return this;
        }
        
        public AddressBuilder addStreetNumber(int streetNumber){
        	this.nestedAddress.streetNumber = streetNumber;
        	return this;
        }
        
        public Address build(){
        	return this.nestedAddress;
        }
    }
}
