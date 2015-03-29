package compositeexample;

public class TestComposite {

	public static void main(String[] args) {
		MenuComponent coffeMenu = 
				new Menu("Meniu cafea","Tipuri diferite de cafea");
		
		MenuComponent toateMeniurile = new Menu("Toate","Toate meniurile restaurantului");
		toateMeniurile.add(coffeMenu);
		
		Restaurant rest = new Restaurant(toateMeniurile);
		rest.printMeniu();
		
	}

}
