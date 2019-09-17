package zadatak_29_08;

public class Sabiranje extends BinarnaOperacija {

	public Sabiranje(Izraz levi, Izraz desni) {
		super(levi, desni);
		
	}

	@Override
	public double izracunaj() {
		double vrednostLevogIzraza= levi.izracunaj();
		double vrednostDesnogIzraza=desni.izracunaj();
		return vrednostLevogIzraza + vrednostDesnogIzraza;
	}

	@Override
	public String toString() {
		return levi.toString() + " + " + desni.toString() + " = " + izracunaj();
	}

	
    
}
