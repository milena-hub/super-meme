package domaci_22_08;

import java.time.LocalDate;

public class Covek {
	private String imePrezime;
	LocalDate datumRodjenja;
	
	
	public Covek(String imePrezime, LocalDate datumRodjenja) {
		super();
		this.imePrezime = imePrezime;
		this.datumRodjenja = datumRodjenja;
	}


	public String getImePrezime() {
		return imePrezime;
	}


	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}


	public LocalDate getDatumRodjenja() {
		return datumRodjenja;
	}


	public void setDatumRodjenja(LocalDate datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}


	@Override
	public String toString() {
		return "Ime i Prezime=" + imePrezime + ", datumRodjenja=" + datumRodjenja + ".";
	}

	
	
}
