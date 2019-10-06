package Programme;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class TestPartition {

	
	
	@Test
	public void testListePartition(){
		ArrayList<Integer> jliste = new ArrayList<>();
		for (int i = 0; i < 11; i++) {
			jliste.add(i);
		}
                ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>> ();
                expected.add(new ArrayList<Integer>(Arrays.asList((Integer)0,(Integer)1)));
                expected.add(new ArrayList<Integer>(Arrays.asList((Integer)2,(Integer)3)));
                expected.add(new ArrayList<Integer>(Arrays.asList((Integer)4,(Integer)5)));
                expected.add(new ArrayList<Integer>(Arrays.asList((Integer)6,(Integer)7)));
                expected.add(new ArrayList<Integer>(Arrays.asList((Integer)8,(Integer)9)));
                expected.add(new ArrayList<Integer>(Arrays.asList((Integer)10)));
                
        assertEquals(expected, Complexite.partition(jliste, 2));
		
		
	}
	
	
}
