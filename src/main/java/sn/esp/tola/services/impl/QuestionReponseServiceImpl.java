package sn.esp.tola.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esp.tola.entities.QuestionReponse;
import sn.esp.tola.repositories.QuestionReponseRepository;
import sn.esp.tola.services.QuestionReponseService;

@Service
public class QuestionReponseServiceImpl implements QuestionReponseService {

	@Autowired
	QuestionReponseRepository questionReponseRepository;
	
	@Override
	public QuestionReponse saveQuestionReponse(QuestionReponse u) {
		return questionReponseRepository.save(u);
	}

	@Override
	public QuestionReponse updateQuestionReponse(QuestionReponse u) {
		return questionReponseRepository.save(u);
	}

	@Override
	public void deleteQuestionReponse(QuestionReponse u) {
		questionReponseRepository.delete(u);
	}

	@Override
	public void deleteQuestionReponseById(Long id) {
		questionReponseRepository.deleteById(id);
	}

	@Override
	public QuestionReponse getQuestionReponse(Long id) {
		return questionReponseRepository.findById(id).get();
	}

	@Override
	public List<QuestionReponse> getAllQuestionReponses() {
		return questionReponseRepository.findAll();
	}
}
