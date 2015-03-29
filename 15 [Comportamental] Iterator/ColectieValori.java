package exempluIterator;

public class ColectieValori {
	private int[] valori;
	
	public ColectieValori(int n){
		this.valori = new int[n];
		for(int i=0;i<n;i++)
			this.valori[i] = i+1;
	}
	
	public Iterabil getIterator(){
		return new IteratorVectorInt(this.valori);
	}
}
