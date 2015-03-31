package decoratorexample;

public class JSONExportDecorator extends ParserDecorator{

	public JSONExportDecorator(Parser decoratedParser) {
		super(decoratedParser);
	}
	
	@Override
	public void parse(String fileName){
		this.decoratedParser.parse(fileName);
		this.exportToJSON(fileName);
	}
	
	//decorator function 
	private void exportToJSON(String fileName){
		System.out.println("Fisier parsat si exportat ca JSON in "+fileName+".json");
	}

}
