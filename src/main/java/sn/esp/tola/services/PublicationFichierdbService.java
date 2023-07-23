package sn.esp.tola.services;

import java.util.List;

import sn.esp.tola.entities.PublicationFichierdb;

public interface PublicationFichierdbService {

	PublicationFichierdb savePublicationFichierdb(PublicationFichierdb u);
	PublicationFichierdb updatePublicationFichierdb(PublicationFichierdb u);
	void deletePublicationFichierdb(PublicationFichierdb u);
	void deletePublicationFichierdbById(Long id);
	PublicationFichierdb getPublicationFichierdb(Long id);
	List<PublicationFichierdb> getAllPublicationFichierdbs();
}
