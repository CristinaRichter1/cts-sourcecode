package ro.ase.csie.cts;

public class MathLibrary {
	public static int aduna(int a, int b){
		return a+b;
	}
	public static int sumaElementeVector(int [] array){
		try{
		int s = 0;
		for(int valoare : array)
			s+=valoare;
		return s;
		}
		catch(Exception ex){
			return 0;
		}
	}
	
	public static boolean isGreater(int a, int b){
		if(a > b)
			return true;
		else
			return false;
	}
}
