package compositeexample;

public class Restaurant {

	MenuComponent meniu;
	
	public Restaurant(MenuComponent meniu){
		this.meniu = meniu;
	}
	
	public void printMeniu(){
		meniu.print();
	}

}
