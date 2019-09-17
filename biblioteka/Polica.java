package biblioteka;

import java.util.Arrays;

public class Polica {
   
	
	private Knjiga[] polica= new Knjiga[10];
    
    public void staviKnjigu(Knjiga knjiga) {
    	for(int i=0;i<polica.length;i++) {
    		if(polica[i]==null) {
    			polica[i]=knjiga;
    			return;
    		}
    	}
    }

	@Override
	public String toString() {
		String str="";
	    
		for(int i=0;i<polica.length;i++) {
			 if(polica[i] !=null) {
			str +=polica[i].toString()+ "\n\t";
		}
		}
		return str;
	}
    
}
