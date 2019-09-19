package domaci_16_09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DrugiZadatak {

	public static void main(String[] args) {
		Integer[] niz= {2,3,5,4,5,2,4,3,5,2,4,4,3,2};
		neparniPonovljeni(niz);
		
	}
   public static void neparniPonovljeni(Integer[] niz) {
	   
	   HashMap<Integer, Integer> mapa = new HashMap<Integer,Integer>();
	   
	 
	for(int i =0; i<niz.length;i++) {
		   if(!mapa.containsKey(niz[i])) {
			   mapa.put(niz[i], 1);
		   }else {
			   mapa.put(niz[i], mapa.get(niz[i]) + 1);
		   }
	   }
	   for(Map.Entry<Integer,Integer> me : mapa.entrySet()) {
		   if(me.getValue() % 2 == 1) {
			   System.out.println("Broj: " + me.getKey() + "se u listi ponavlja " + me.getValue() +  " puta. ");
		   }
	   }
	
	
	   
   }
}
