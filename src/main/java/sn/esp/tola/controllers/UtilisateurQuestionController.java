package sn.esp.tola.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sn.esp.tola.entities.Question;
import sn.esp.tola.entities.Utilisateur;
import sn.esp.tola.entities.UtilisateurQuestion;
import sn.esp.tola.repositories.UtilisateurQuestionRepository;
import sn.esp.tola.services.QuestionService;
import sn.esp.tola.services.UtilisateurQuestionService;
import sn.esp.tola.services.UtilisateurService;

@RestController
@CrossOrigin("http://localhost:4200")
public class UtilisateurQuestionController {

	@Autowired
	UtilisateurQuestionRepository utilisateurQuestionRepository;
	
	@Autowired
	UtilisateurQuestionService utilisateurQuestionService;
	
	@Autowired
	UtilisateurService utilisateurService;
	
	@Autowired
	QuestionService questionService;
	
	@GetMapping("/UtilisateurQuestions")	
	@ResponseBody
	public List<UtilisateurQuestion> getAllUtilisateurQuestions() {
		List<UtilisateurQuestion> list = utilisateurQuestionService.getAllUtilisateurQuestions();
		return list;
	}
	
	@PostMapping("/AjouterUtilisateurQuestionById/{idutulisateur}/{idquestion}")
	@ResponseBody
	public void AjouterUtilisateurQuestionById(@PathVariable long idutulisateur, @PathVariable long idquestion) {
		
		Utilisateur utilisateur = utilisateurService.getUtilisateur(idutulisateur);
		Question question = questionService.getQuestion(idquestion);
		
		if(utilisateur != null && question != null)
			utilisateurQuestionRepository.save(new UtilisateurQuestion(utilisateur, question));
	}
}
