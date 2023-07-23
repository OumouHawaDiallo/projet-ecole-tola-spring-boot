package sn.esp.tola.services;

import java.util.List;

import sn.esp.tola.entities.Question;

public interface QuestionService {
	
	Question saveQuestion(Question q);
	Question updateQuestion(Question q);
	void deleteQuestion(Question q);
	void deleteQuestionById(Long id);
	Question getQuestion(Long id);
	List<Question> getAllQuestions();

}
