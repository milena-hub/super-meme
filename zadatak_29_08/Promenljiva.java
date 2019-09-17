package zadatak_29_08;

public class Promenljiva extends Izraz {
     private String ime;
     private int vrednost;
    
     public Promenljiva(String ime, int vrednost) {
 		super();
 		this.ime = ime;
 		this.vrednost = vrednost;
 	}

     @Override
  	public double izracunaj() {
  		
  		return this.vrednost;
  	}

	@Override
	public String toString() {
		return "" + ime;
	}

  	
  	}




 	
     
     
     
     
	


