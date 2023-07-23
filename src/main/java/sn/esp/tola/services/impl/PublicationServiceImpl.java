package sn.esp.tola.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esp.tola.entities.Publication;
import sn.esp.tola.repositories.PublicationRepository;
import sn.esp.tola.services.PublicationService;

@Service
public class PublicationServiceImpl implements PublicationService {

	@Autowired
	PublicationRepository publicationRepository;
	
	@Override
	public Publication savePublication(Publication p) {
		return publicationRepository.save(p);
	}

	@Override
	public Publication updatePublication(Publication p) {
		return publicationRepository.save(p);
	}

	@Override
	public void deletePublication(Publication p) {
		publicationRepository.delete(p);
	}

	@Override
	public void deletePublicationById(Long id) {
		publicationRepository.deleteById(id);
	}

	@Override
	public Publication getPublication(Long id) {
		return publicationRepository.findById(id).get();
	}

	@Override
	public List<Publication> getAllPublications() {
		return publicationRepository.findAll();
	}
}
