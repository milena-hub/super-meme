package zadatak_29_08;

public abstract class BinarnaOperacija extends Izraz {
	protected Izraz levi;
	protected Izraz desni;
	
	

	public BinarnaOperacija(Izraz levi, Izraz desni) {
		super();
		this.levi = levi;
		this.desni = desni;
	}



	@Override
	public abstract double izracunaj();
		
		
	}
	


