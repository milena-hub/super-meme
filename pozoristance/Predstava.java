package pozoristance;

import java.util.ArrayList;
import java.util.List;

public class Predstava {
   private String naziv;
   private Pozoriste pozoriste;
   private List<Zaposleni> listaZaposlenih = new ArrayList<Zaposleni>();
public Predstava(String naziv, Pozoriste pozoriste, Reditelj reditelj) {
	super();
	this.naziv = naziv;
	this.pozoriste = pozoriste;
	listaZaposlenih.add(reditelj);
}
   
   public boolean dodaj(Kostimograf kostimograf) {
	   if(kostimograf instanceof Kostimograf) {
	   listaZaposlenih.add(kostimograf);
	   return true;
	   }
	   return false;
   }
   public boolean dodaj(Glumac glumac) {
	   if(glumac instanceof Glumac ) {
	   listaZaposlenih.add(glumac);
	   return true;
   }
   return false;
}

@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append( naziv +  "\n\t\t\t");
	for(Zaposleni z:listaZaposlenih) {
		sb.append(z.toString() + "\n\t\t\t");
		
	}
	return sb.toString();
}
   
}
