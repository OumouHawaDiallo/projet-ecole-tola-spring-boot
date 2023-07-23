package sn.esp.tola.services;

import java.util.List;

import sn.esp.tola.entities.Utilisateur;

public interface UtilisateurService {

	Utilisateur saveUtilisateur(Utilisateur u);
	Utilisateur updateUtilisateur(Utilisateur u);
	void deleteUtilisateur(Utilisateur u);
	void deleteUtilisateurById(Long id);
	Utilisateur getUtilisateur(Long id);
	List<Utilisateur> getAllUtilisateurs();
	
	
	//
	Utilisateur getUtilisateurByEmail(String email);
	Utilisateur getUtilisateurByEmailMotdepasse(String email, String motdepasse);
}
