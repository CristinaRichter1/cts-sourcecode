package ro.ase.csie.cts;


/*
 * @author Catalin Boja
 * @description Implementare clasa Adresa postala - varianta clasica cu un constructor default 
 * 		sau unul ce necesita doar atributele obligatorii + interfata publica (set si get)
 * 
 * 
 * Modificari:
 * 	- Atributele nu mai sunt final si clasa nu mai este immutable
 * 
 * Intrebari:
 * 	- daca numarul de atribute este mare si doar cateva sunt obligatorii ?
 * 	- daca numarul de atribute creste ? 
 * 
 */

public class Address_v2 {
	private String state;    		//required
    private String postalCode;    	//required
	private String city;    		//optional
    private String street;    		//optional
    private int streetNumber;    	//optional
    
    public Address_v2(){
    	
    }
    
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
   
    
    
}
