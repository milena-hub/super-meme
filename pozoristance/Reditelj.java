package pozoristance;

public class Reditelj extends Zaposleni {

	
	
	public Reditelj(String ime, Pozoriste pozoriste) {
		super(ime, pozoriste);
		
	}

	@Override
	public String imePosla() {
		
		return this.getClass().getSimpleName();
	}
	
	

}
