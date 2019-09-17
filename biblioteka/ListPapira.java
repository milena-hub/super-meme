package biblioteka;

public class ListPapira {
     private  int redniBroj;
     private String tekst;
	
     
     public ListPapira() {
		
	}


	public ListPapira(int redniBroj, String tekst) {
		super();
		this.redniBroj = redniBroj;
		this.tekst = tekst;
	}


	public int getRedniBroj() {
		return redniBroj;
	}


	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	
    public boolean poredjenje(ListPapira list) {
    	if(this.redniBroj == list.getRedniBroj()) {
    		return true;
    	}else {
    		return false;
    	}
    }
     public  static boolean poredjenje(ListPapira list1, ListPapira list2) {
    	 if(list1.redniBroj == list2.redniBroj) {
    		 
    		 return true;
    	 }else {
    		 return false;
    	 }
     }
     public void ispisiTekst(int redniBroj) {
    	 if(this.redniBroj == redniBroj) {
    		 System.out.println(this.tekst);
     		
     	}
    	 return;
     }


	@Override
	public String toString() {
		return tekst + "(" + redniBroj + ")";
	}
     
     }
	
     
     
     

