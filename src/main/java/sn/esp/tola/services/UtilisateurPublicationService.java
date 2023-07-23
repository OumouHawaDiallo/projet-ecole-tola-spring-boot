package sn.esp.tola.services;

import java.util.List;

import sn.esp.tola.entities.UtilisateurPublication;

public interface UtilisateurPublicationService {

	UtilisateurPublication saveUtilisateurPublication(UtilisateurPublication u);
	UtilisateurPublication updateUtilisateurPublication(UtilisateurPublication u);
	void deleteUtilisateurPublication(UtilisateurPublication u);
	void deleteUtilisateurPublicationById(Long id);
	UtilisateurPublication getUtilisateurPublication(Long id);
	List<UtilisateurPublication> getAllUtilisateurPublications();
}
