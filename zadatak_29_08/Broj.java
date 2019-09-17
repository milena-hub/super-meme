package zadatak_29_08;

public class Broj extends Izraz{
    private int broj;

	public Broj(int broj) {
		super();
		this.broj = broj;
	}

	@Override
	public double izracunaj() {
		
		return broj;
	}

	@Override
	public String toString() {
		return " " + broj;
	}
  
    
    
}
