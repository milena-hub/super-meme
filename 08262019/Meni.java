package ponedeljak_26_08;

import java.util.Arrays;

public class Meni {
  private Namirnica[] niz;
  private int brNam=0;

  public Meni(int kapacitet) {
	super();
	this.niz=new Namirnica[kapacitet];
}
  
  public void dodaj(Namirnica namirnica) {
	  for(int i=0;i<niz.length;i++) {
		  if(niz[i]==null) {
			  niz[i]=namirnica;
			  brNam++;
			  return;
		  }
	  }
  }
  public double energVr() {
	  double rez=0;
	  for(int i=0;i<niz.length;i++) {
		  if(niz[i]==null) {
			  return rez;
		  }
		  rez +=niz[i].energVr();
  }
	return rez;
  }

@Override
public String toString() {
	
	StringBuilder stb = new StringBuilder("Meni " +  "\n\t");
	stb.append("Meni(" +energVr() + "kJ):\n\t");
	
	for(int i=0;i<niz.length;i++) {
		if(niz[i]==null) {
			break;
		}
		stb.append(niz[i].toString() + "\n\t");
	
}
  return stb.toString();
}
}

