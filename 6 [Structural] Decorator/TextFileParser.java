package decoratorexample;

public class TextFileParser implements Parser{

	@Override
	public void parse(String fileName) {
		System.out.println("Fisier text parsat: "+fileName);
	}

}
