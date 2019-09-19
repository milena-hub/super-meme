package ponedeljak_26_08;

public abstract class Namirnica extends Energent {
       private String ime;
       private static int id=0;
	
       
       protected Namirnica(String ime) {
		super();
		this.ime = ime;
		id++;
	}


	public String getIme() {
		return ime;
	}


	
	public static int getId() {
		return id;
	}



	


	@Override
	public String toString() {
		return "[" + id +"]" + ime;
	}
	
       
      
	}
       
       
       

