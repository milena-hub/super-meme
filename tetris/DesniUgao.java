package tetris;

public class DesniUgao extends Element {
	
	public DesniUgao(String polje) {
		super(polje);
		this.matrica = new String[3][2];
	}

	@Override
	public String[][] kreirajElement() {
		String polje = this.getPolje();
		return this.matrica = new String[][] { {polje,polje,polje}, {" ", " ", polje}};
	}

	
	
	
	
	
	

}
