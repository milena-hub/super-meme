package domaci_22_08;

import java.time.LocalDate;

public class StudentOsnovnihStudija extends Student{
	
	private String smerOsnovnihStudija;

	public StudentOsnovnihStudija(String imePrezime, LocalDate datumRodjenja, int trenutnaGodinaStudija, double prosek,
			String smerOsnovnihStudija) {
		super(imePrezime, datumRodjenja, trenutnaGodinaStudija, prosek);
		this.smerOsnovnihStudija = smerOsnovnihStudija;
	}

	public String getSmerOsnovnihStudija() {
		return smerOsnovnihStudija;
	}

	public void setSmerOsnovnihStudija(String smerOsnovnihStudija) {
		this.smerOsnovnihStudija = smerOsnovnihStudija;
	}

	@Override
	public String toString() {
		return super.toString() + " StudentOsnovnihStudija je na smeru" + smerOsnovnihStudija + ".";
	}
	
	

}
