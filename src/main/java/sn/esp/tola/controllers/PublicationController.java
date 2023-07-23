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

import sn.esp.tola.entities.Publication;
import sn.esp.tola.services.PublicationService;

@RestController
@CrossOrigin("http://localhost:4200")
public class PublicationController {

	@Autowired
	PublicationService publicationService;
	
	@GetMapping("/Publications")	
	@ResponseBody
	public List<Publication> getAllPublications() {
		List<Publication> list = publicationService.getAllPublications();
		return list;
	}
	
	@GetMapping("/PublicationById/{id}")	
	@ResponseBody
	public Publication PublicationById(@PathVariable long id) {
		Publication publication = publicationService.getPublication(id);
		return publication;
	}
	
	@PostMapping("/AjouterPublication")
	@ResponseBody
	public Publication AjouterPublication(@RequestBody Publication p) {
		return publicationService.savePublication(p);
	}
	
	@PutMapping("/ModifierPublication/{id}")
	@ResponseBody
	public Publication ModifierPublication(@PathVariable long id, @RequestBody Publication p) {
		p.setIdpublication(id);
		return publicationService.updatePublication(p);
	}
	
	@DeleteMapping("SupprimerPublication/{id}")
	public void SupprimerPublication(@PathVariable("id") Long Id_publication) {
		publicationService.deletePublicationById(Id_publication);
	}
}
