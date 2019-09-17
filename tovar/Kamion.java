package tovar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Kamion {
	private String regBroj;
	private LinkedList<Tovar> listaTovara = new LinkedList<Tovar>();
	private double nosivost;
	private double teret=0;
	
	public Kamion(String regBroj, double nosivost) {
		super();
		this.regBroj = regBroj;
		this.nosivost = nosivost;
		
	}
	
	public boolean stavi(Tovar tovar) {
		if(tovar instanceof Tovar) {
		listaTovara.add(tovar);
		teret +=tovar.tezina();
		return true;
		}
		return false;
	}
	public void skini() {
		teret -=listaTovara.getLast().tezina();
		listaTovara.removeLast();
		
	
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(regBroj + "(" + this.teret + "/" + this.nosivost +  ")\n\t");
		for(Tovar tovar : listaTovara) {
			sb.append(tovar.toString() + "\n\t");
		}
		
		return sb.toString();
	}
 
}
