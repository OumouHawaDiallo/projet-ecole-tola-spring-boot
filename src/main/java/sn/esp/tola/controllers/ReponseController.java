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

import sn.esp.tola.entities.Reponse;
import sn.esp.tola.services.ReponseService;

@RestController
@CrossOrigin("http://localhost:4200")
public class ReponseController {
	
	@Autowired
	ReponseService reponseService;
	
	@GetMapping("/Reponses")	
	@ResponseBody
	public List<Reponse> getAllReponses() {
		List<Reponse> list = reponseService.getAllReponses();
		return list;
	}
	
	@GetMapping("/ReponseById/{id}")	
	@ResponseBody
	public Reponse ReponseById(@PathVariable long id) {
		Reponse reponse = reponseService.getReponse(id);
		return reponse;
	}
	
	@PostMapping("/AjouterReponse")
	@ResponseBody
	public Reponse AjouterReponse(@RequestBody Reponse r) {
		return reponseService.saveReponse(r);
	}
	
	@PutMapping("/ModifierReponse/{id}")
	@ResponseBody
	public Reponse ModifierReponse(@PathVariable long id, @RequestBody Reponse r) {
		r.setIdreponse(id);
		return reponseService.updateReponse(r);
	}
	
	@DeleteMapping("SupprimerReponse/{id}")
	public void SupprimerReponse(@PathVariable("id") Long Id_reponse) {
		reponseService.deleteReponseById(Id_reponse);
	}

}
