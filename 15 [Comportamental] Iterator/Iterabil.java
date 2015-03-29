package exempluIterator;

public interface Iterabil {
	public abstract boolean existaUrmator();
	public abstract boolean existaAnterior();
	public abstract void urmator();
	public abstract void anterior();
	public abstract void resetare();
	public abstract Object curent();
}
