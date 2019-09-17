package domaci_22_08;

import java.time.LocalDate;

public class Profesor extends Nastavnik {
	
	private String titula;

	public Profesor(String imePrezime, LocalDate datumRodjenja, int godinaZaposlenja, int plata, String omiljeniPredmet,
			String[] predmeti, String titula) {
		super(imePrezime, datumRodjenja, godinaZaposlenja, plata, omiljeniPredmet, predmeti);
		setTitula(titula);
	}

	public String getTitula() {
		return titula;
	}

	public void setTitula(String titula) {
		if(titula.equals("Doxent") || titula.equals("Redovni") || titula.equals("Vanredni")) {
			this.titula=titula;
		}
		this.titula = null;
	}

	@Override
	public String toString() {
		return "Profesor ima titulu" + titula + ".";
	}
	
	

}
