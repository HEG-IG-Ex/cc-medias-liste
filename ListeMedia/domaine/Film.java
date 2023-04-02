package domaine;

public class Film extends Media {
    private String realisateur;
    private int anneeSortie;


    public Film(String _titre, String _url) {
        this.titre = _titre;
        this.url = _url;
    }

    public Film(String _titre, String _url, Genre _genre, String _realisateur, int _sortie) {
        this.titre = _titre;
        this.url = _url;
        this.genre = _genre;
        this.realisateur = _realisateur;
        this.anneeSortie = _sortie;
    }


    public String GetRealisateur() { return realisateur; }
    public int GetDateSortie() { return anneeSortie; }
    public void SetRealisateur(String _r) { realisateur = _r; }
    public void SetDateSortie(int _d) { anneeSortie = _d; }


    @Override
    public void Lecture() { System.out.println("Démarrage de la lecture de : " + titre); }

    @Override
    public String toString() {
        return titre + " (" + anneeSortie + ") de " + realisateur + " [Film]";
    }
}