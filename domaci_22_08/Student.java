package domaci_22_08;

import java.time.LocalDate;

public class Student extends Covek{
   private int trenutnaGodinaStudija;
   private double prosek;

   
  
public Student(String imePrezime, LocalDate datumRodjenja, int trenutnaGodinaStudija, double prosek) {
	super(imePrezime, datumRodjenja);
	this.trenutnaGodinaStudija = trenutnaGodinaStudija;
	this.prosek = prosek;
}





public int getTrenutnaGodinaStudija() {
	return trenutnaGodinaStudija;
}


public void setTrenutnaGodinaStudija(int trenutnaGodinaStudija) {
	this.trenutnaGodinaStudija = trenutnaGodinaStudija;
}


public double getProsek() {
	return prosek;
}


public void setProsek(double prosek) {
	this.prosek = prosek;
}


@Override
public String toString() {
	return super.toString() 
			+ " Student na " + trenutnaGodinaStudija + ". godini,  sa prosekom " + prosek + ".";
}
   
   
}
