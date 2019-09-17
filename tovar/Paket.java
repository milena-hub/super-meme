package tovar;

import java.util.ArrayList;
import java.util.List;



public class Paket extends Tovar {
    
	private List<Tovar> listaTovara = new ArrayList<Tovar>();
	
	public void dodaj(Tovar tovar) {
		listaTovara.add(tovar);
		
	}
	
	@Override
	public String vrsta() {
		String vrste ="";
		for(Tovar tovar : listaTovara) {
			vrste += tovar.vrsta() + ", ";
		}
		vrste = vrste.substring(0,vrste.length()-2);
		return vrste;
	}

	@Override
	public double tezina() {
		double tezinaPaketa =0;
		for(Tovar tovar : listaTovara) {
			tezinaPaketa += tovar.tezina();
			
		}
		return tezinaPaketa;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("paket[" + vrsta()+ "], ("+ tezina() + ")");
		return sb.toString();
	}
	
	

}
