package ro.ase.csie.cts.unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.csie.cts.MathLibrary;
import ro.ase.csie.cts.Student;

public class TestMath {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		//testare metoda aduna
		assertEquals(20,MathLibrary.aduna(10, 10));
		assertEquals(
				"Test metoda aduna", 25,MathLibrary.aduna(10, 15));
		
		int[] firstValue = new int[] {10,20,30,40,50};
		int[] secondValue = new int[] {1,2,3,4,5};
		int[] expectedResults = new int[] {11,22,33,44,55};
		boolean[] exptectedMaxResults = 
				new boolean[] {true,true,true,true,true};
		
		
		for(int i = 0;i<5;i++){
			assertEquals("Test Math.aduna",
					expectedResults[i], 
					MathLibrary.aduna(firstValue[i],secondValue[i]));
		}
		
		for(int i = 0;i<5;i++)
			assertTrue("Test Math.greater", 
					MathLibrary.isGreater(firstValue[i], secondValue[i]));
		
		//test pe obiecte
		Student s1 = new Student(23, "Gigel");
		Student s2 = s1;
		
		Student s3 = new Student(23,"Gigel");
		
		assertSame("Test referinte obiecte",s2,s1);
		assertNotSame("Test referinte obiecte",s3,s1);
		
		Student s4 = null;
		assertNull("Test referinta null",s4);
		
		//testare generare exceptie
		int[]  vector = null;
		try{
			int suma = MathLibrary.sumaElementeVector(vector);
			fail("Exceptia nu a fost generata !");
		}
		catch(Exception e){
			System.out.println("Exceptie: "+e.getMessage());
		}
		
	}

}
