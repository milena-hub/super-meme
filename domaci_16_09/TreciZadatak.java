package domaci_16_09;

import java.util.ArrayList;
import java.util.HashMap;

public class TreciZadatak {

	public static void main(String[] args) {
		String[] deca = {"Pera","Ana","Jana","Jova","Mina","Tamara"};
		ArrayList<String> svaDeca = new ArrayList<>();
		svaDeca.add("Pera");
		svaDeca.add("Ana");
		svaDeca.add("Jana");
		svaDeca.add("Jova");
		svaDeca.add("Mina");
		svaDeca.add("Tamara");
		
		ArrayList<String>dobraDeca = new ArrayList<String>();
		dobraDeca.add("Pera");
		dobraDeca.add("Jova");
		dobraDeca.add("Pera");
		dobraDeca.add("Tamara");
		dobraDeca.add("Jana");
		dobraDeca.add("Pera");
		dobraDeca.add("Jova");
		dobraDeca.add("Mina");
		dobraDeca.add("Pera");
		
		System.out.println(decjaDobraDela(svaDeca, dobraDeca));

	}
   public static HashMap<String,Integer> decjaDobraDela(ArrayList<String> svaDeca, ArrayList<String>dobraDeca) {
	   HashMap<String,Integer> mapa = new HashMap<String,Integer>();
	   for(int i =0; i< svaDeca.size();i++) {
		   int ponavljanje = 0;
		   for(int j=0;j < dobraDeca.size();j++) {
			   if(svaDeca.get(i).equals(dobraDeca.get(j))) {
				   ponavljanje++;
			   }
			   
		   }
		   if(ponavljanje > 0) {
			  mapa.put(svaDeca.get(i), ponavljanje);
		   }
	   }
	return mapa;
	   
}
}