package pozoristance;

import java.util.ArrayList;
import java.util.List;

public class Repertoar {
   private Pozoriste pozoriste;
   private List<Predstava> listaPredstava = new ArrayList<Predstava>();

   
   public Repertoar(Pozoriste pozoriste) {
	super();
	this.pozoriste = pozoriste;
}
   public void dodaj(Predstava predstava) {
	   listaPredstava.add(predstava);
   }
   public void ukloni(Predstava predstava) {
	   listaPredstava.remove(predstava);
   }
@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append( pozoriste.getNaziv() + ":\n\t");
	for(Predstava p:listaPredstava) {
		sb.append(p.toString() + "\n\t");
		
	}
	sb.append("]");
	return sb.toString();
}
   
}
   

