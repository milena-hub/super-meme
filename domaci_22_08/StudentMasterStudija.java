package domaci_22_08;

import java.time.LocalDate;

public class StudentMasterStudija extends Student {

	private String smerMasterStudija;

	public StudentMasterStudija(String imePrezime, LocalDate datumRodjenja, int trenutnaGodinaStudija, double prosek,
			String smerMasterStudija) {
		super(imePrezime, datumRodjenja, trenutnaGodinaStudija, prosek);
		this.smerMasterStudija = smerMasterStudija;
	}

	public String getSmerMasterStudija() {
		return smerMasterStudija;
	}

	public void setSmerMasterStudija(String smerMasterStudija) {
		this.smerMasterStudija = smerMasterStudija;
	}

	@Override
	public String toString() {
		return super.toString() +  "StudentMasterStudija je na smeru" + smerMasterStudija + ".";
	}
	
	
	
}
