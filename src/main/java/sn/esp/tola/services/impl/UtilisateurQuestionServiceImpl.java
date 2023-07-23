package sn.esp.tola.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esp.tola.entities.UtilisateurQuestion;
import sn.esp.tola.repositories.UtilisateurQuestionRepository;
import sn.esp.tola.services.UtilisateurQuestionService;

@Service
public class UtilisateurQuestionServiceImpl implements UtilisateurQuestionService {

	@Autowired
	UtilisateurQuestionRepository utilisateurQuestionRepository;
	
	@Override
	public UtilisateurQuestion saveUtilisateurQuestion(UtilisateurQuestion u) {
		return utilisateurQuestionRepository.save(u);
	}

	@Override
	public UtilisateurQuestion updateUtilisateurQuestion(UtilisateurQuestion u) {
		return utilisateurQuestionRepository.save(u);
	}

	@Override
	public void deleteUtilisateurQuestion(UtilisateurQuestion u) {
		utilisateurQuestionRepository.delete(u);
	}

	@Override
	public void deleteUtilisateurQuestionById(Long id) {
		utilisateurQuestionRepository.deleteById(id);
	}

	@Override
	public UtilisateurQuestion getUtilisateurQuestion(Long id) {
		return utilisateurQuestionRepository.findById(id).get();
	}

	@Override
	public List<UtilisateurQuestion> getAllUtilisateurQuestions() {
		return utilisateurQuestionRepository.findAll();
	}
}
