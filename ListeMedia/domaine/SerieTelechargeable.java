package domaine;

public class SerieTelechargeable extends Serie implements Telechargeable{

    private boolean eligible = false;

    public SerieTelechargeable(String _titre, String _url) {
        super(_titre, _url);
    }

    public SerieTelechargeable(String _titre, String _url, Genre _genre, String _showrunner) {
        super(_titre, _url, _genre, _showrunner);
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
