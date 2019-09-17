package pozoristance;

public class Kostimograf extends Zaposleni {
    
	
	
	public Kostimograf(String ime, Pozoriste pozoriste) {
		super(ime, pozoriste);
	
	}

	@Override
	public String imePosla() {
		
		return this.getClass().getSimpleName();
	}
   
	
}
