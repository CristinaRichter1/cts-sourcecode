package decoratorexample;

public class Test {

	public static void main(String[] args) {
		//simple text parser
		Parser textParser = new TextFileParser();
		
		//simple text parser decorated to do also an export to JSON
		Parser text2JsonParser = new JSONExportDecorator(new TextFileParser());
		
		//simple XML parser decorated to do also an export to JSON
		Parser xml2JsonParser = new JSONExportDecorator(new XMLFileParser());
		
		textParser.parse("Test.txt");
		text2JsonParser.parse("Test.txt");
		xml2JsonParser.parse("Studenti.xml");

	}

}
