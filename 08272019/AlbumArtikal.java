package prodavnicaalbuma;

public abstract class AlbumArtikal extends Artikal{
	
	private String izdavac;
	private Album album;
	
	public AlbumArtikal(double cena, int kolicina, String izdavac, Album album) {
		super(cena, kolicina);
		this.izdavac = izdavac;
		this.album = album;
	}
	
	
	public Album getAlbum() {
		return album;
	}


	@Override
	public abstract String ime();

}



