package biblioteka;

import java.util.Arrays;

public class Knjiga {
   
	private String naziv;
    private ListPapira[] brojListova = new ListPapira[0];
    private  int dodatList=0;
	
    
    public Knjiga(String naziv) {
		super();
		this.naziv = naziv;
		
	}


	public String getNaziv() {
		return naziv;
	}
    
    public void dodajList(ListPapira list) {
    	if(dodatList>0) {
    	for(int i=0;i<dodatList;i++) {
    		if(brojListova[i].poredjenje(list)) {
    			brojListova[i]=list;
    			return;
    			
    		}
    	}
    	}
    	if(dodatList<10) {
    	dodatList++;
    	ListPapira[] temp = brojListova;
    	brojListova = new ListPapira[dodatList];
    	
    	for(int i=0;i<temp.length;i++) {
    		brojListova[i]=temp[i];
    		
    	}
    	brojListova[(dodatList-1)]= list;
    	sortirajBrojListova();
    	}
    }


	
	public int getDodatList() {
		return dodatList;
	}



   public ListPapira getListPoRednomBroju(int redniBroj) {
	   for(int i=0;i<brojListova.length-1;i++) {
		   if(brojListova[i].getRedniBroj()==redniBroj) {
			   
		   }
	   }
	return null;
   		
   		
   }
   public void sortirajBrojListova(){
	   if(dodatList<2) 
		   return;
	   
	   ListPapira temp = new ListPapira();
	 
	   for(int i=0;i<brojListova.length-1;i++) {
		   for(int j=i+1;j<brojListova.length;j++) {
			   if(brojListova[i].getRedniBroj() > brojListova[j].getRedniBroj()) {
				   temp=brojListova[j];
				   brojListova[j] =  brojListova[i];
				   brojListova[i]= temp;
				   
			   }
			   
		   }
		   
	   }
   }


@Override
public String toString() {
	String s="";
	for(int i=0;i<brojListova.length;i++) {
	s +="\n\t" + brojListova[i].toString();
		
	}
	return "Knjiga se zove " + naziv + ", brojListova:" + s;
}
   
}
