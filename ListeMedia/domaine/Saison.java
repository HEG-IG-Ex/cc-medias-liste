package domaine;

import java.util.ArrayList;
import java.util.List;


public class Saison extends Media{
    protected int numero;
    protected Serie s;
	protected List<Episode> episodes;

    public Saison(String _titre, String _url) {
        this.titre = _titre;
        this.url = _url;
        episodes = new ArrayList<Episode>();
    }

    public Saison( Serie _s, int _numero, String _url) {
        this.s = _s;
        this.titre = _s.GetTitre();
        this.url = _url;
        this.genre = _s.GetGenre();
        this.numero = _numero;
        episodes = new ArrayList<Episode>();
    }


    public int GetNumero() { return numero; }
    public void SetNumero(int _n) { numero = _n; }
    public Serie GetSerie() { return s; }
    public void SetSerie(Serie _s) { s = _s; _s.AddSaison(this); }

	public void AddEpisode(Episode _e) { episodes.add(_e); }
	public List<Episode> ListerEpisodes() { return episodes; }

    @Override
    public void Lecture() { System.out.println("Démarrage de la lecture de la saison " + numero + " de : " + s.GetTitre()); }

    @Override
    public String toString() {
        return s.GetTitre() + " Saison " + numero +  " [Saison]";
    }
}