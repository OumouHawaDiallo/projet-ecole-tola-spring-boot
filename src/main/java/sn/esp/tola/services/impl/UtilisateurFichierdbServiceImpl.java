package sn.esp.tola.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esp.tola.entities.UtilisateurFichierdb;
import sn.esp.tola.repositories.UtilisateurFichierdbRepository;
import sn.esp.tola.services.UtilisateurFichierdbService;

@Service
public class UtilisateurFichierdbServiceImpl implements UtilisateurFichierdbService {

	@Autowired
	UtilisateurFichierdbRepository UtilisateurFichierdbRepository;
	
	@Override
	public UtilisateurFichierdb saveUtilisateurFichierdb(UtilisateurFichierdb u) {
		return UtilisateurFichierdbRepository.save(u);
	}

	@Override
	public UtilisateurFichierdb updateUtilisateurFichierdb(UtilisateurFichierdb u) {
		return UtilisateurFichierdbRepository.save(u);
	}

	@Override
	public void deleteUtilisateurFichierdb(UtilisateurFichierdb u) {
		UtilisateurFichierdbRepository.delete(u);
	}

	@Override
	public void deleteUtilisateurFichierdbById(Long id) {
		UtilisateurFichierdbRepository.deleteById(id);
	}

	@Override
	public UtilisateurFichierdb getUtilisateurFichierdb(Long id) {
		return UtilisateurFichierdbRepository.findById(id).get();
	}

	@Override
	public List<UtilisateurFichierdb> getAllUtilisateurFichierdbs() {
		return UtilisateurFichierdbRepository.findAll();
	}
}
