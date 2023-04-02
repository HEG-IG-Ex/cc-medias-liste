package domaine;

public class FilmTelechargeable extends Film implements Telechargeable{
    private boolean eligible = false;

    public FilmTelechargeable(String _titre, String _url) {
        super(_titre, _url);
    }

    public FilmTelechargeable(String _titre, String _url, Genre _genre, String _realisateur, int _sortie) {
        super(_titre, _url, _genre, _realisateur, _sortie);
    }

    @Override
    public void makeEligible() {
        this.eligible = true;
    }

    @Override
    public boolean checkEligibility() {
        return this.eligible;
    }

    @Override
    public String telecharger() {
        return super.GetURL();
    }

    @Override
    public String toString() {
        return super.toString() + (this.checkEligibility() ? "{Télécharger}" : "");
    }
}
