package sn.esp.tola.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esp.tola.entities.Reponse;
import sn.esp.tola.repositories.ReponseRepository;
import sn.esp.tola.services.ReponseService;

@Service
public class ReponseServiceImpl implements ReponseService {

	@Autowired
	ReponseRepository reponseRepository;
	
	@Override
	public Reponse saveReponse(Reponse r) {
		return reponseRepository.save(r);
	}

	@Override
	public Reponse updateReponse(Reponse r) {
		return reponseRepository.save(r);
	}

	@Override
	public void deleteReponse(Reponse r) {
		reponseRepository.delete(r);
	}

	@Override
	public void deleteReponseById(Long id) {
		reponseRepository.deleteById(id);
	}

	@Override
	public Reponse getReponse(Long id) {
		return reponseRepository.findById(id).get();
	}

	@Override
	public List<Reponse> getAllReponses() {
		return reponseRepository.findAll();
	}
}
