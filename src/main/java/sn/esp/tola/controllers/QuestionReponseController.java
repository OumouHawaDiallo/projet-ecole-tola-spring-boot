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
import sn.esp.tola.entities.QuestionReponse;
import sn.esp.tola.entities.Reponse;
import sn.esp.tola.repositories.QuestionReponseRepository;
import sn.esp.tola.services.QuestionReponseService;
import sn.esp.tola.services.QuestionService;
import sn.esp.tola.services.ReponseService;


@RestController
@CrossOrigin("http://localhost:4200")
public class QuestionReponseController {

	@Autowired
	QuestionReponseRepository questionReponseRepository;
	
	@Autowired
	QuestionReponseService questionReponseService;
	
	@Autowired
	QuestionService questionService;
	
	@Autowired
	ReponseService reponseService;
	
	@GetMapping("/questionReponses")	
	@ResponseBody
	public List<QuestionReponse> getAllquestionReponses() {
		List<QuestionReponse> list = questionReponseService.getAllQuestionReponses();
		return list;
	}
	
	@PostMapping("/AjouterQuestionReponseById/{idquestion}/{idreponse}")
	@ResponseBody
	public void AjouterquestionReponseById(@PathVariable long idquestion, @PathVariable long idreponse) {
		
		Question question = questionService.getQuestion(idquestion);
		Reponse reponse = reponseService.getReponse(idreponse);
		
		if(question != null && reponse != null)
			questionReponseRepository.save(new QuestionReponse(question, reponse));
	}
}
