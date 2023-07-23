package sn.esp.tola.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sn.esp.tola.entities.Publication;
import sn.esp.tola.entities.Utilisateur;
import sn.esp.tola.entities.UtilisateurPublication;
import sn.esp.tola.repositories.UtilisateurPublicationRepository;
import sn.esp.tola.services.PublicationService;
import sn.esp.tola.services.UtilisateurPublicationService;
import sn.esp.tola.services.UtilisateurService;

@RestController
@CrossOrigin("http://localhost:4200")
public class UtilisateuPublicationController {

	@Autowired
	UtilisateurPublicationRepository utilisateurPublicationRepository;
	
	@Autowired
	UtilisateurPublicationService utilisateurPublicationService;
	
	@Autowired
	UtilisateurService utilisateurService;
	
	@Autowired
	PublicationService publicationService;
	
	@GetMapping("/UtilisateurPublications")	
	@ResponseBody
	public List<UtilisateurPublication> getAllUtilisateurPublications() {
		List<UtilisateurPublication> list = utilisateurPublicationService.getAllUtilisateurPublications();
		return list;
	}
	
	@PostMapping("/AjouterUtilisateurPublicationById/{idutulisateur}/{idpublication}")
	@ResponseBody
	public void AjouterUtilisateurPublicationnById(@PathVariable long idutulisateur, @PathVariable long idpublication) {
		
		Utilisateur utilisateur = utilisateurService.getUtilisateur(idutulisateur);
		Publication publication = publicationService.getPublication(idpublication);
		
		if(utilisateur != null && publication != null)
			utilisateurPublicationRepository.save(new UtilisateurPublication(utilisateur, publication));
	}
}
