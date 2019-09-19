package ponedeljak_26_08;

public class Hrana extends Namirnica{
   private double tezina;
   private double belancevine;
   private double masti;
   private double ugljHidrati;
   private int id;

  
public Hrana(String ime, double tezina, double belancevine, double masti, double ugljHidrati) {
	super(ime);
	this.tezina = tezina;
	this.belancevine = belancevine;
	this.masti = masti;
	this.ugljHidrati = ugljHidrati;
	this.id = super.getId();
}



public double getTezina() {
	return tezina;
}

public double getBelancevine() {
	
	return belancevine;
}

public double getMasti() {
	
	return masti;
}

public double getUgljHidrati() {
	
	return ugljHidrati;
}
public double getEnergijaBelancevina() {
	return(tezina*belancevine)/100;
}
public double getEnergijaMasti() {
	return(tezina*masti)/100;
	
}
public double getEnergijaUgljHidrata() {
	return (tezina*ugljHidrati)/100;
}


@Override
public double energVr() {
	
 if((belancevine + masti + ugljHidrati)>=100) {
		System.out.println("Greska prilikom unosa udela hranljivih materija");
		return 0;
		
 }
	double envr = getEnergijaBelancevina() *16.7+ getEnergijaMasti()*37.6+getEnergijaUgljHidrata()*17.2;
	return envr;

}



@Override
public String toString() {
	return "[" + this.id +"]" + super.getIme() +  "(" + tezina + " g," +    energVr() + "kJ)";
			
}
   
   
}
