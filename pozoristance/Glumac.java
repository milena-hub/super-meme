package pozoristance;

public class Glumac extends Zaposleni {

	
	
	public Glumac(String ime, Pozoriste pozoriste) {
		super(ime, pozoriste);
		
	}

	@Override
	public String imePosla() {
		
		return this.getClass().getSimpleName();
	}

}
