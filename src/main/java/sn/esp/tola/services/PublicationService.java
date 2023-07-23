package sn.esp.tola.services;

import java.util.List;

import sn.esp.tola.entities.Publication;

public interface PublicationService {

	Publication savePublication(Publication p);
	Publication updatePublication(Publication p);
	void deletePublication(Publication p);
	void deletePublicationById(Long id);
	Publication getPublication(Long id);
	List<Publication> getAllPublications();
}
