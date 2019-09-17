package pozoristance;

public class Pozoriste {
     private int id;
     private String naziv;
     private static int globalID=0;
	
     public Pozoriste(String naziv) {
		super();
		globalID++;
		this.id = globalID;
		this.naziv = naziv;
	}

	public int getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}
     
     public String getSkraceniNaziv() {
    	 String skraceninaziv = String.valueOf(naziv.charAt(0));
    	 for(int i=1; i<naziv.length();i++) {
    		 if(naziv.charAt(i) == ' ') {
    			 i++;
    			 skraceninaziv += String.valueOf(naziv.charAt(i));
    		 }
    	 }
    	 return skraceninaziv.toUpperCase();
     }

	@Override
	public String toString() {
		return  naziv + "[" + id + "]";
	}
     
}
