package zavrsnirad;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Recnik r = new Recnik(args[0]);
		r.connect();
		r.ucitajReci();
		System.out.println("ucitan recnik " + r.reciURecniku.size());

		String knjiga = args[1];
		Knjiga k = new Knjiga(r, knjiga);

		k.ucitajReciKnjige();
		System.out.println("ucitana knjiga " + k.reci.size());
		 System.out.println(k.reci);
		ArrayList<String> noveReci = k.pronadjiReci(r.reciURecniku);
		System.out.println(noveReci.size());
		 r.unesiNoveReci(noveReci);
		k.sveReci();
		k.najcesceReci();
		

	}

}
