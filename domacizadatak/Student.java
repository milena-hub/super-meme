package domacizadatak;

import java.util.ArrayList;

public class Student {

	private String potpis;
	private String jmbg;
	private Ocena[] upisaneOcene;

	public Student(String potpis, String jmbg, Ocena[] upisaneOcene) {
		super();
		this.potpis = potpis;
		this.jmbg = jmbg;
		this.upisaneOcene = upisaneOcene;
	}

	public String getPotpis() {
		return potpis;
	}

	public String getJmbg() {
		return jmbg;
	}

	public Ocena[] getUpisaneOcene() {
		return upisaneOcene;
	}

	public double getProsecnaOcena() {
		double prosek = 0;
		int suma = 0;

		for (int i = 0; i < this.upisaneOcene.length; i++) {
			suma += upisaneOcene[i].getOcena();
		}
		return prosek = (double) suma / this.upisaneOcene.length;
	}

	public String getDatumRodjenja() {
		String datumRodjenja, dan, mesec, godina = "";

		dan = this.jmbg.substring(0, 2);
		mesec = this.jmbg.substring(2, 4);
		if (jmbg.charAt(4) == '9') {
			godina = 1 + this.jmbg.substring(4, 7);
		} else {
			godina = 2 + this.jmbg.substring(4, 7);
		}
		return datumRodjenja = dan + ". " + mesec + "." + godina + ".";

	}

	public String getIme() {
		String[] niz=this.potpis.split(" ");
		
		return niz[0];
		
	}

	public String getPrezime() {
		String[] niz = this.potpis.split(" ");
		
		return niz[1];
	}

	public String najboljaOcena() {
		String nazivPredmeta = "";
		int najvecaOcena = 0;
		for (int i = 0; i < this.upisaneOcene.length; i++) {
			if (najvecaOcena < upisaneOcene[i].getBodovi()) {
				najvecaOcena = upisaneOcene[i].getBodovi();
				nazivPredmeta = upisaneOcene[i].getPr().getIme();
			}
		}
		return nazivPredmeta;
	}

	static boolean starijiOd(Student s, int god) {
		int godina;
		if (s.jmbg.charAt(4) == '9') {
			godina = 1000 +Integer.parseInt(s.jmbg.substring(4, 7));
		} else {
			godina = 2000 +Integer.parseInt(s.jmbg.substring(4, 7)); 
		}
		if(2019 - god >=godina) {
			return true;
		}
		return false;
		
	}

	static Student[] prosekVeciOd(Student[] nizStudenata, double ocena) {
    	Student[] tempNiz = new Student[nizStudenata.length];
         int brojac=0;
    	for(int i =0;i<nizStudenata.length;i++) {
    		if(nizStudenata[i].getProsecnaOcena()>ocena) {
    			brojac++;
    			for(int j =0;j<tempNiz.length;j++) {	
    				if(tempNiz[j] == null) {
    					tempNiz[j] = nizStudenata[i];
    					break;
    				}
    			}
    		}
    	}
    		Student[] veciProsek = new Student[brojac];
    		for(int i=0;i < brojac; i++) {
    			veciProsek[i]=tempNiz[i];
    	}
    	
    	return veciProsek;
    }
}

