package sn.esp.tola.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esp.tola.entities.PublicationFichierdb;
import sn.esp.tola.repositories.PublicationFichierdbRepository;
import sn.esp.tola.services.PublicationFichierdbService;

@Service
public class PublicationFichierdbServiceImpl implements PublicationFichierdbService {

	@Autowired
	PublicationFichierdbRepository PublicationFichierdbRepository;
	
	@Override
	public PublicationFichierdb savePublicationFichierdb(PublicationFichierdb u) {
		return PublicationFichierdbRepository.save(u);
	}

	@Override
	public PublicationFichierdb updatePublicationFichierdb(PublicationFichierdb u) {
		return PublicationFichierdbRepository.save(u);
	}

	@Override
	public void deletePublicationFichierdb(PublicationFichierdb u) {
		PublicationFichierdbRepository.delete(u);
	}

	@Override
	public void deletePublicationFichierdbById(Long id) {
		PublicationFichierdbRepository.deleteById(id);
	}

	@Override
	public PublicationFichierdb getPublicationFichierdb(Long id) {
		return PublicationFichierdbRepository.findById(id).get();
	}

	@Override
	public List<PublicationFichierdb> getAllPublicationFichierdbs() {
		return PublicationFichierdbRepository.findAll();
	}
}
