package domaine;

public class EpisodeTelechargeable extends Episode implements Telechargeable{
    private boolean eligible = false;

    public EpisodeTelechargeable(String _titre, String _url) {
        super(_titre, _url);
    }

    public EpisodeTelechargeable(String _titre, String _url, Saison _s, int _numero) {
        super(_titre, _url, _s, _numero);
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
