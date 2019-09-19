package domaci_22_08;

import java.time.LocalDate;
import java.util.Arrays;

public class Nastavnik extends Zaposleni {
	
	private String omiljeniPredmet;
	private String[] predmeti;
	
	public Nastavnik(String imePrezime, LocalDate datumRodjenja, int godinaZaposlenja, int plata,
			String omiljeniPredmet, String[] predmeti) {
		super(imePrezime, datumRodjenja, godinaZaposlenja, plata);
		this.omiljeniPredmet = omiljeniPredmet;
		this.predmeti = predmeti;
	}

	public String getOmiljeniPredmet() {
		return omiljeniPredmet;
	}

	public void setOmiljeniPredmet(String omiljeniPredmet) {
		this.omiljeniPredmet = omiljeniPredmet;
	}

	public String[] getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(String[] predmeti) {
		this.predmeti = predmeti;
	}

	@Override
	public String toString() {
		return super.toString() + "Nastavniku je omiljeniPredmet=" + omiljeniPredmet + ", predmeti=" + Arrays.toString(predmeti) + ".";
	}
    
	
	
}
