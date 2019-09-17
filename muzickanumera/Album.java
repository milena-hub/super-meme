package muzickanumera;


import java.util.Arrays;
import java.util.Date;





public class Album {
	private String naziv;
    private String izvodjac;
    private Date datum;
    private MuzickaNumera[] nizPesama;
    private String numera;
    private static int brojPesama;
	
    
    public Album(String naziv, String izvodjac, Date datum) {
		super();
		this.naziv = naziv;
		this.izvodjac = izvodjac;
		this.datum = datum;
		this.brojPesama=0;
		
		nizPesama = new MuzickaNumera[5];
		
		
	}
    

	public String getNaziv() {
		return naziv;
	}

     public String getIzvodjac() {
		return izvodjac;
	}
    
   public Date getDatum() {
		return datum;
	}
    
   public MuzickaNumera[] getNizPesama() {
		return nizPesama;
	}	
   public  void dodaj(MuzickaNumera numera) {
   	noviNiz(brojPesama);
   	for(int i=0; i<=nizPesama.length;i++) {
   		if(nizPesama[i]==null) {
   			nizPesama[i]=numera;
   			return;
   		}
   	}
   	
   }
   public void dodaj(String name,String trajanje) {
   	MuzickaNumera numera= new MuzickaNumera(name,this.izvodjac,trajanje);
   	dodaj(numera);
   }
   public String getTrajanje() {
   	int minuti=0;
   	int sekunde=0;
   	String ukupnoTrajanje=" ";
   	
   	for(int i=0;i<=brojPesama;i++) {
   		String trajanje= nizPesama[i].getTrajanje();
   		String[] minSec = trajanje.split(":");
   		
   		minuti += Integer.parseInt(minSec[0]);
   		sekunde += Integer.parseInt(minSec[1]);
   	}
   	minuti += sekunde/60;
   	sekunde +=sekunde%60;
   	
   	ukupnoTrajanje += Integer.toString(minuti) + ":" + Integer.toString(sekunde);
   	
   	
   	return ukupnoTrajanje;
   	
   }
	public void noviNiz(int brojPesama) {
	    if(brojPesama==5) {
	    	MuzickaNumera[] noviNizPesama=new MuzickaNumera[10];
	    	for(int i=0;i<nizPesama.length;i++) {
	    		noviNizPesama[i]=nizPesama[i];
	    	}
	    	nizPesama=noviNizPesama;
	    }
	}
    public MuzickaNumera getMuzickaNumera(int index) {
    	return nizPesama[index] ;
    }
	
    public MuzickaNumera getMuzickaNumera(String ime) {
    	MuzickaNumera numera = null;
		for(int i=0;i<=nizPesama.length;i++) {
    		if(nizPesama[i].equals(ime)) {
    			numera=nizPesama[i];
    		}
    	}
        return numera;
    	
    }

   
	
	
	
   @Override
    public String toString(){
     return  izvodjac + " -  " + naziv + "(datum)" + datum + "\n\t" 
    		  + Arrays.toString(nizPesama)  + getTrajanje();
	
	}
   }
    
    

