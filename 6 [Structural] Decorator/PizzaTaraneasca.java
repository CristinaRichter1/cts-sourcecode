package decoratorexample;

public class PizzaTaraneasca extends DecoratorPizza {
	public PizzaTaraneasca(AbstractPizza pizza){
		super(pizza);
	}
	
	@Override
	public String getIngrediente(){
		return super.getIngrediente() + ", porumb";
	}
}
