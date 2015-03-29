package exempluIterator;

public class IteratorVectorInt implements Iterabil{
	
	//pozitie curenta in colectie
	private int i;
	//referinta catre date
	private int[] valori;
	
	public IteratorVectorInt(int[] Valori){
		i = 0;
		valori = Valori;
	}

	@Override
	public boolean existaUrmator() {
		if(i<this.valori.length)
			return true;
		else
			return false;
	}

	@Override
	public boolean existaAnterior() {
		if(i>=1)
			return true;
		else
			return false;
	}

	@Override
	public void urmator() {
			this.i++;
	}

	@Override
	public void anterior() {
		if(i>=1)
			this.i--;
	}

	@Override
	public void resetare() {
		this.i = 0;
	}

	@Override
	public Object curent() {
		return this.valori[i];
	}

}
