package decoratorexample;

public class TestPizza {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaSimpla pizzaSimpla = new PizzaSimpla("Simpla", 10);
		PizzaTaraneasca pizzaTaraneasca = new PizzaTaraneasca(pizzaSimpla);
		PizzaExotica pizzaExotica = new PizzaExotica(pizzaSimpla);
		
		System.out.println(pizzaSimpla.getIngrediente());
		System.out.println(pizzaTaraneasca.getIngrediente());
		System.out.println(pizzaExotica.getIngrediente());

	}

}
