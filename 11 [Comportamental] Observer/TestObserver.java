package exemplu.observer;

public class TestObserver {
	
	public static void main(String[] args){
	
	Button buton = new Button();
	
	HandlerA handlerA = new HandlerA();
	HandlerB handlerB = new HandlerB();
	
	buton.abonareHandler(handlerA);
	buton.abonareHandler(handlerB);
	
	buton.Click();
	
	}
}
