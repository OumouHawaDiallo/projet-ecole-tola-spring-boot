package sn.esp.tola.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esp.tola.entities.UtilisateurPublication;
import sn.esp.tola.repositories.UtilisateurPublicationRepository;
import sn.esp.tola.services.UtilisateurPublicationService;

@Service
public class UtilisateurPublicationServiceImpl implements UtilisateurPublicationService {

	@Autowired
	UtilisateurPublicationRepository utilisateurPublicationRepository;
	
	@Override
	public UtilisateurPublication saveUtilisateurPublication(UtilisateurPublication u) {
		return utilisateurPublicationRepository.save(u);
	}

	@Override
	public UtilisateurPublication updateUtilisateurPublication(UtilisateurPublication u) {
		return utilisateurPublicationRepository.save(u);
	}

	@Override
	public void deleteUtilisateurPublication(UtilisateurPublication u) {
		utilisateurPublicationRepository.delete(u);
	}

	@Override
	public void deleteUtilisateurPublicationById(Long id) {
		utilisateurPublicationRepository.deleteById(id);
	}

	@Override
	public UtilisateurPublication getUtilisateurPublication(Long id) {
		return utilisateurPublicationRepository.findById(id).get();
	}

	@Override
	public List<UtilisateurPublication> getAllUtilisateurPublications() {
		return utilisateurPublicationRepository.findAll();
	}
}
