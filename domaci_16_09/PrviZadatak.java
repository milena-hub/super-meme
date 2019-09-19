package domaci_16_09;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PrviZadatak {
	public static void sortiranjePoKljucu(HashMap<String,Integer> mapa) {
    	Map<String,Integer> map = new TreeMap<String,Integer>(mapa);    
    	   System.out.println("Posle sortiranja:");
    	   Set set2 = map.entrySet();
    	   Iterator iterator2 = set2.iterator();
    	   while(iterator2.hasNext()) {
    	       Map.Entry pair = (Map.Entry)iterator2.next();
    	       System.out.print(pair.getKey() + ": ");
    	       System.out.println(pair.getValue());    
    	   }
    	   }
	public static void main(String[] args) {
		HashMap<String,Integer> mapa = new HashMap<String,Integer>();
		mapa.put("Svetlana",23);
		mapa.put("Katarina", 1);
		mapa.put("Jovica", 35);
		mapa.put("Bilja", 20);
		mapa.put("Aleksa", 19);
		
		sortiranjePoKljucu(mapa);
		
		System.out.println("Pre sortiranja:");
	    Set set = mapa.entrySet();
	    Iterator iterator = set.iterator();
	    while(iterator.hasNext()) {
	        Map.Entry pair = (HashMap.Entry)iterator.next();
	        System.out.print(pair.getKey() + ": ");
	        System.out.println(pair.getValue());
		}
	}
	 
	  
	    	  
	    
	    }

	
	







