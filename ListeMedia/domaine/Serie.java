package domaine;

import java.util.ArrayList;
import java.util.List;


public class Serie extends Media{
    protected String showrunner;
	protected List<Saison> saisons;

    public Serie(String _titre, String _url) {
        this.titre = _titre;
        this.url = _url;
        this.saisons = new ArrayList<Saison>();
    }

    public Serie(String _titre, String _url, Genre _genre, String _showrunner) {
        this.titre = _titre;
        this.url = _url;
        this.genre = _genre;
        this.showrunner = _showrunner;
        this.saisons = new ArrayList<Saison>();
    }

	
    public String GetShowRunner() { return showrunner; }
    public void SetShowRunner(String _s) { showrunner = _s; }

	public void AddSaison(Saison _s) { saisons.add(_s); }

	public List<Saison> ListerSaisons() { return saisons; }


    @Override
    public void Lecture() { System.out.println("Démarrage de la lecture de : " + titre); }

    @Override
    public String toString() {
        return titre + " (" + showrunner + ") - " + genre + " [Serie]";
    }
}