package dao;

import domaine.*;

import java.util.ArrayList;
import java.util.List;


public class Bdd {

	public static List<Telechargeable> GetMediaCatalogue() {
		List<Telechargeable> cat = new ArrayList<>();

		FilmTelechargeable f = null;

		cat.add(new FilmTelechargeable("Citizen Kane", "media.hflix.ch/cKane", domaine.Genre.DRAME, "Orson Welles", 1941));
		cat.add(new FilmTelechargeable("2001, l'odyssée de l'espace", "media.hflix.ch/2001", domaine.Genre.FANTASY, "Stanley Kubrick", 1968));

		f = new FilmTelechargeable("Les Temps modernes", "media.hflix.ch/tempsMod", domaine.Genre.COMEDIE, "Charlie Chaplin", 1936);
		f.makeEligible();
		cat.add(f);

		cat.add(new FilmTelechargeable("Il était une fois dans l'Ouest", "media.hflix.ch/iletaitouest", domaine.Genre.ACTION, "Sergio Leone", 1968));

		SerieTelechargeable s = null;
		EpisodeTelechargeable e = null;
		SaisonTelechargeable sai = null;

		s = new SerieTelechargeable("Breaking Bad", "media.hflix.ch/bbad", domaine.Genre.DRAME, "Vince Gilligan");
		cat.add(s);

		sai = new SaisonTelechargeable(s, 1, "media.hflix.ch/bbadS1");
		cat.add(sai);

		e = new EpisodeTelechargeable("Pilot", "media.hflix.ch/bbadS1E01", sai, 1);
		e.makeEligible();
		cat.add(e);

		e = new EpisodeTelechargeable("Cat's in the Bag...", "media.hflix.ch/bbadS1E02", sai, 2);
		e.makeEligible();
		cat.add(e);

		sai = new SaisonTelechargeable(s, 2, "media.hflix.ch/bbadS2");
		cat.add(sai);
		cat.add(new EpisodeTelechargeable("Seven Thirty-Seven", "media.hflix.ch/bbadS2E01", sai, 1));
		cat.add(new EpisodeTelechargeable("Grilled", "media.hflix.ch/bbadS2E02", sai, 2));
		cat.add(new EpisodeTelechargeable("Bit by a Dead Bee", "media.hflix.ch/bbadS2E03", sai, 3));
		


		return cat;	
	}

}