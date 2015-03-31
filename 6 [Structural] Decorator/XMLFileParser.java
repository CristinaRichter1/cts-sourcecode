package decoratorexample;

public class XMLFileParser implements Parser{

	@Override
	public void parse(String fileName) {
		System.out.println("Fisier XML parsat: "+fileName);
	}

}
