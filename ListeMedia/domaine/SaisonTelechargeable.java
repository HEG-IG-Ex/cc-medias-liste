package domaine;

public class SaisonTelechargeable extends Saison implements Telechargeable{
    private boolean eligible = false;

    public SaisonTelechargeable(String _titre, String _url) {
        super(_titre, _url);
    }

    public SaisonTelechargeable(Serie _s, int _numero, String _url) {
        super(_s, _numero, _url);
    }

    @Override
    public void makeEligible() {

    }

    @Override
    public boolean checkEligibility() {
        return false;
    }

    @Override
    public String telecharger() {
        return null;
    }
}
