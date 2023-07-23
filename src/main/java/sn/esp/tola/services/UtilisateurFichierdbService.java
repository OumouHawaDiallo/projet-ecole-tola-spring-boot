package sn.esp.tola.services;

import java.util.List;

import sn.esp.tola.entities.UtilisateurFichierdb;

public interface UtilisateurFichierdbService {

	UtilisateurFichierdb saveUtilisateurFichierdb(UtilisateurFichierdb u);
	UtilisateurFichierdb updateUtilisateurFichierdb(UtilisateurFichierdb u);
	void deleteUtilisateurFichierdb(UtilisateurFichierdb u);
	void deleteUtilisateurFichierdbById(Long id);
	UtilisateurFichierdb getUtilisateurFichierdb(Long id);
	List<UtilisateurFichierdb> getAllUtilisateurFichierdbs();
}
