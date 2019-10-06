package Programme;


import java.util.ArrayList;

public class Complexite {

	public static ArrayList<ArrayList<Integer>> partition (ArrayList<Integer> liste, Integer taille){

		ArrayList<ArrayList<Integer>> listResultat = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> sousList = new ArrayList<Integer>();

		int i=0,j=0,k=0;
		while (i<liste.size())
		{
			sousList.clear();
			for ( j = 0; j < taille; j++) 
			{
				if((j+i)<liste.size())
					sousList.add(liste.get(i+j));
			}
			listResultat.add((ArrayList<Integer>) sousList.clone());
			i+=taille;
			k++;
		}

		System.out.println(listResultat);
		return listResultat;
		
	}

}