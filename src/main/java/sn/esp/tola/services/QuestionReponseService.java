package sn.esp.tola.services;

import java.util.List;

import sn.esp.tola.entities.QuestionReponse;

public interface QuestionReponseService {

	QuestionReponse saveQuestionReponse(QuestionReponse u);
	QuestionReponse updateQuestionReponse(QuestionReponse u);
	void deleteQuestionReponse(QuestionReponse u);
	void deleteQuestionReponseById(Long id);
	QuestionReponse getQuestionReponse(Long id);
	List<QuestionReponse> getAllQuestionReponses();
}
