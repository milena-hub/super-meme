package zavrsnirad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Knjiga {
	private Recnik r;
	HashMap<String, Integer> reci;
	private String fileName;

	public Knjiga(Recnik r, String fileName) {
		this.r = r;
		this.fileName = fileName;

	}

	public void ucitajReciKnjige() {
		reci = new HashMap<String, Integer>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String s = br.readLine();
			while (s != null) {
				if (s.isEmpty()) {
					s = br.readLine();
					continue;
				}
				s = s.replaceAll("[^a-zA-Z\\s+]", "");

				String[] split = s.split(" ");

				for (int i = 0; i < split.length; i++) {
					String str = split[i].trim();
					if (isNumeric(str)) {
						continue;
					}
					if (reci.containsKey(split[i].toLowerCase())) {
						int count = reci.get(split[i].toLowerCase());
						count++;
						reci.replace(split[i].toLowerCase(), count);
					} else {
						reci.put(split[i].toLowerCase(), 1);
					}

				}
				s = br.readLine();
			}
			for (String str : reci.keySet()) {
				System.out.println(str + " " + reci.get(str));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<String> pronadjiReci(ArrayList<String> reciUrecniku) {
		ArrayList<String> noveReci = new ArrayList<String>();

		for (String s : reci.keySet()) {
			if (!reciUrecniku.contains(s)) {
				noveReci.add(s);
			}
		}

		return noveReci;
}
	
	public LinkedHashMap<String, Integer> sortByValues(HashMap<String,Integer> passedMap) {
	    ArrayList<String> mapKeys = new ArrayList<>(passedMap.keySet());
	   ArrayList<Integer> mapValues = new ArrayList<>(passedMap.values());
	   Collections.sort(mapValues);
	    Collections.sort(mapKeys);
	    Collections.reverse(mapValues);
	    Collections.reverse(mapKeys);
	   LinkedHashMap<String, Integer> sortedMap =
	       new LinkedHashMap<>();

	    Iterator<Integer> valueIt = mapValues.iterator();
	   while (valueIt.hasNext()) {
	       Integer val = valueIt.next();
	       Iterator<String> keyIt = mapKeys.iterator();

	        while (keyIt.hasNext()) {
	           String key = keyIt.next();
	            Integer comp1 = passedMap.get(key);
	            Integer comp2 = val;

	          if (comp1.equals(comp2)) {
	               keyIt.remove();
	                sortedMap.put(key, val);
	              break;
	          }
	        }
	   }
	   return sortedMap;
		
	}

public void najcesceReci() {
	int brojac=0;
	HashMap<String, Integer> sorted = sortByValues(reci);
	for (String s: sorted.keySet()) {
		
		System.out.println(s+" " + sorted.get(s) );
		if (brojac++>18) return;
	}
		}
		
		

	
	public void sveReci() {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("sveReci.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String zbir = "";
		for (String s: new TreeMap<String, Integer>(reci).keySet()) {
			zbir += s+"\n";
		}
		try {
			bw.write(zbir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static boolean isNumeric(String strNum) {
		try {
			int d = Integer.parseInt(strNum);
		} catch (NumberFormatException | NullPointerException nfe) {
			return false;
		}
		return true;
	}
	}

