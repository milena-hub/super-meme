package prodavnicaalbuma;

public class CD extends AlbumArtikal {
	public CD(double cena, int kolicina, String izdavac, Album album) {
		super(cena, kolicina, izdavac, album);
		
	}
	
	@Override
	public boolean kupi() {
		if (super.getKolicina() > 0) {
			super.setKolicina(super.getKolicina() - 1);
			return true;
		}
		return false;

	}

	@Override
	public String ime() {
		String str = super.getAlbum().getIzvodjac() + " - " + super.getAlbum().getNaziv() + " (CD)";
		return str;
	}


}


