package sn.esp.tola.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esp.tola.entities.Question;
import sn.esp.tola.repositories.QuestionRepository;
import sn.esp.tola.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionRepository questionRepository;
	
	@Override
	public Question saveQuestion(Question q) {
		return questionRepository.save(q);
	}

	@Override
	public Question updateQuestion(Question q) {
		return questionRepository.save(q);
	}

	@Override
	public void deleteQuestion(Question q) {
		questionRepository.delete(q);
	}

	@Override
	public void deleteQuestionById(Long id) {
		questionRepository.deleteById(id);
	}

	@Override
	public Question getQuestion(Long id) {
		return questionRepository.findById(id).get();
	}

	@Override
	public List<Question> getAllQuestions() {
		return questionRepository.findAll();
	}
}
