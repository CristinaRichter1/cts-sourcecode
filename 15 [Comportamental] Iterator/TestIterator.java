package exempluIterator;

import java.util.ArrayList;
import java.util.Iterator;


public class TestIterator {
	public static void main(String[] args){
		ColectieValori colectie = new ColectieValori(10);
		IteratorVectorInt iterator = 
			(IteratorVectorInt)colectie.getIterator();
		
		while(iterator.existaUrmator()){
			System.out.println("Valoare: "+
						iterator.curent());
			iterator.urmator();
		}
		
		iterator.resetare();
		
		while(iterator.existaAnterior()){
			iterator.anterior();
			System.out.println("Valoare: "+
					iterator.curent());
		}
		
		//testare iterator standard Java
		
		System.out.println("Iterator Java");
		ArrayList lista = new ArrayList();
		for(int i=0;i<10;i++)
			lista.add(i+1);
		Iterator it = lista.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}	
}
