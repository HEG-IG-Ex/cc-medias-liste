package domaine;

// ---------------------------------------------------------------------------
// Classe abstraite de base pour les différents types de media
// ---------------------------------------------------------------------------
public abstract class Media {
	// attributs
	protected String url;
	protected String titre;
	protected Genre genre;

	// getters & setters
	public String GetURL() { return url; };
	public void SetURL(String _u) { url = _u; };
	public String GetTitre() { return titre; };
	public void SetTitre(String _t) { titre = _t; };
	public Genre GetGenre() { return genre; };
	public void SetGentre(Genre _g) { genre = _g; };
	
	public Media() { url=""; titre=""; genre = Genre.NONE;  }
	
	// methode de visualisation du contenu
	public abstract void Lecture();

}
