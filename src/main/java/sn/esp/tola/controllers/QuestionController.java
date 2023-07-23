package sn.esp.tola.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sn.esp.tola.entities.Question;
import sn.esp.tola.services.QuestionService;

@RestController
@CrossOrigin("http://localhost:4200")
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	@GetMapping("/Questions")	
	@ResponseBody
	public List<Question> getAllQuestions() {
		List<Question> list = questionService.getAllQuestions();
		return list;
	}
	
	@GetMapping("/QuestionById/{id}")	
	@ResponseBody
	public Question QuestionById(@PathVariable long id) {
		Question question = questionService.getQuestion(id);
		return question;
	}
	
	@PostMapping("/AjouterQuestion")
	@ResponseBody
	public Question AjouterQuestion(@RequestBody Question q) {
		return questionService.saveQuestion(q);
	}
	
	@PutMapping("/ModifierQuestion/{id}")
	@ResponseBody
	public Question ModifierQuestion(@PathVariable long id, @RequestBody Question q) {
		q.setIdquestion(id);
		return questionService.updateQuestion(q);
	}
	
	@DeleteMapping("SupprimerQuestion/{id}")
	public void SupprimerQuestion(@PathVariable("id") Long idquestion) {
		questionService.deleteQuestionById(idquestion);
	}

}
