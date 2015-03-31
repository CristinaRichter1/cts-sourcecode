package decoratorexample;

public abstract class ParserDecorator implements Parser{
	protected Parser decoratedParser;

	public ParserDecorator(Parser decoratedParser){
		this.decoratedParser = decoratedParser;
	}
	
	public void parse(String fileName){
		this.decoratedParser.parse(fileName);
	}
}
