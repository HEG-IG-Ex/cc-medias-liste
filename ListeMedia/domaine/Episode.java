package domaine;

public class Episode extends Media {
    private int numero;
    private Saison sais;


    public Episode(String _titre, String _url) {
        this.titre = _titre;
        this.url = _url;
    }

    public Episode(String _titre, String _url, Saison _s, int _numero) {
        this.titre = _titre;
        this.url = _url;
        this.genre = _s.GetSerie().GetGenre();
        this.sais = _s;
        this.numero = _numero;
    }


    public int GetNumero() { return numero; }
    public void SetNumero(int _n) { numero = _n; }
    public Saison GetSaison() { return sais; }
    public void SetSaison(Saison _s) { sais = _s; sais.AddEpisode(this); }


    @Override
    public void Lecture() { System.out.println("Démarrage de la lecture de l'épisode " + numero + " de la saison " + sais.GetNumero() + " de : " + sais.GetSerie().GetTitre()); }

    @Override
    public String toString() {
        return titre + " - Episode " + numero + " ; saison " + sais.GetNumero() + " de " + sais.GetSerie().GetTitre() + " [Episode]";
    }

}