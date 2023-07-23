package sn.esp.tola.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esp.tola.entities.Utilisateur;
import sn.esp.tola.repositories.UtilisateurRepository;
import sn.esp.tola.services.UtilisateurService;

@Service 
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	@Override
	public Utilisateur saveUtilisateur(Utilisateur u) {
		return utilisateurRepository.save(u);
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur u) {
		return utilisateurRepository.save(u);
	}

	@Override
	public void deleteUtilisateur(Utilisateur u) {
		utilisateurRepository.delete(u);
	}

	@Override
	public void deleteUtilisateurById(Long id) {
		utilisateurRepository.deleteById(id);
	}

	@Override
	public Utilisateur getUtilisateur(Long id) {
		return utilisateurRepository.findById(id).get();
	}

	@Override
	public List<Utilisateur> getAllUtilisateurs() {
		return utilisateurRepository.findAll();
	}
	
	
	//
	@Override
	public Utilisateur getUtilisateurByEmail(String email) {
		return utilisateurRepository.findByEmail(email);
	}
	
	@Override
	public Utilisateur getUtilisateurByEmailMotdepasse(String email, String motdepasse) {
		return utilisateurRepository.findByEmailAndMotdepasse(email, motdepasse);
	}
}
