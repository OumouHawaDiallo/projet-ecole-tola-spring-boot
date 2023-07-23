package sn.esp.tola.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sn.esp.tola.entities.FichierDB;
import sn.esp.tola.entities.Utilisateur;
import sn.esp.tola.entities.UtilisateurFichierdb;
import sn.esp.tola.repositories.UtilisateurFichierdbRepository;
import sn.esp.tola.services.UtilisateurFichierdbService;
import sn.esp.tola.services.UtilisateurService;
import sn.esp.tola.services.FichierStockageService;

@RestController
@CrossOrigin("http://localhost:4200")
public class UtilisateurFichierdbController {

	@Autowired
	UtilisateurFichierdbRepository utilisateurFichierdbRepository;
	
	@Autowired
	UtilisateurFichierdbService utilisateurFichierdbService;
	
	@Autowired
	UtilisateurService utilisateurService;
	
	@Autowired
	FichierStockageService fichierStockageService;
	
	@GetMapping("/UtilisateurFichierdbs")	
	@ResponseBody
	public List<UtilisateurFichierdb> getAllUtilisateurFichierdbs() {
		List<UtilisateurFichierdb> list = utilisateurFichierdbService.getAllUtilisateurFichierdbs();
		return list;
	}
	
	@PostMapping("/AjouterUtilisateurFichierdbById/{idutilisateur}/{idfichierdb}")
	@ResponseBody
	public void AjouterUtilisateurFichierdbById(@PathVariable long idutilisateur, @PathVariable String idfichierdb) {
		
		Utilisateur utilisateur = utilisateurService.getUtilisateur(idutilisateur);
		FichierDB fichierDB = fichierStockageService.getFile(idfichierdb);
		
		if(utilisateur != null && fichierDB != null)
			utilisateurFichierdbRepository.save(new UtilisateurFichierdb(utilisateur, fichierDB));
	}
}
