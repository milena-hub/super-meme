package domaci_22_08;

import java.time.LocalDate;

public class Sluzbenik extends Zaposleni{
	
	private String odsek;

	public Sluzbenik(String imePrezime, LocalDate datumRodjenja, int godinaZaposlenja, int plata, String odsek) {
		super(imePrezime, datumRodjenja, godinaZaposlenja, plata);
		this.odsek = odsek;
	}

	public String getOdsek() {
		return odsek;
	}

	public void setOdsek(String odsek) {
		this.odsek = odsek;
	}

	@Override
	public String toString() {
		return super.toString() +  "Sluzbenik je na odseku " +  odsek  + ".";
	}
	
	

}
