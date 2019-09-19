package domaci_22_08;

import java.time.LocalDate;

public class Asistent extends Nastavnik {
 private String smerDoktorskihStudija;

public Asistent(String imePrezime, LocalDate datumRodjenja, int godinaZaposlenja, int plata, String omiljeniPredmet,
		String[] predmeti, String smerDoktorskihStudija) {
	super(imePrezime, datumRodjenja, godinaZaposlenja, plata, omiljeniPredmet, predmeti);
	this.smerDoktorskihStudija = smerDoktorskihStudija;
}

public String getSmerDoktorskihStudija() {
	return smerDoktorskihStudija;
}

public void setSmerDoktorskihStudija(String smerDoktorskihStudija) {
	this.smerDoktorskihStudija = smerDoktorskihStudija;
}

@Override
public String toString() {
	return super.toString() + " Asistent je na smeru" + smerDoktorskihStudija + ".";
} 
 
 
 
}
