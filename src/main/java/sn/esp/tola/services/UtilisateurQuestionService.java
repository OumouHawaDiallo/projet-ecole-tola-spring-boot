package sn.esp.tola.services;

import java.util.List;

import sn.esp.tola.entities.UtilisateurQuestion;

public interface UtilisateurQuestionService {

	UtilisateurQuestion saveUtilisateurQuestion(UtilisateurQuestion u);
	UtilisateurQuestion updateUtilisateurQuestion(UtilisateurQuestion u);
	void deleteUtilisateurQuestion(UtilisateurQuestion u);
	void deleteUtilisateurQuestionById(Long id);
	UtilisateurQuestion getUtilisateurQuestion(Long id);
	List<UtilisateurQuestion> getAllUtilisateurQuestions();
}
