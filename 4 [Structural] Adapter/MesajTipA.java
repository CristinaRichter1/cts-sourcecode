package adapterexample;

public class MesajTipA implements InterfataTipA{
	String text;

	@Override
	public String getText(){
		return text;
	}
	
	@Override
	public void setText(String text){
		this.text = text;
	}
	
	@Override
	public void afisare(){
		System.out.println("Mesajul este "+this.text);
	}
}
