package ro.ase.csie.cts;

public class Aplicatie {
	public static void main(String[]  args){
		System.out.println("Suma 3+4 = "+MathLibrary.aduna(3, 4));
		int[]  vector = new int[]{1,2,3,4};
		System.out.println("Suma elementelor din vector:"+
		MathLibrary.sumaElementeVector(vector));
	}
}
