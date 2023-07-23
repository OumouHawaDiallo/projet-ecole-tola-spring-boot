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

import sn.esp.tola.entities.Utilisateur;
import sn.esp.tola.services.UtilisateurService;

@RestController
@CrossOrigin("http://localhost:4200")
public class UtilisateurController {

	@Autowired
	UtilisateurService utilisateurService;
	
	@GetMapping("/Utilisateurs")	
	@ResponseBody
	public List<Utilisateur> getAllUtilisateurs() {
		List<Utilisateur> list = utilisateurService.getAllUtilisateurs();
		return list;
	}
	
	@GetMapping("/UtilisateurById/{id}")	
	@ResponseBody
	public Utilisateur UtilisateurById(@PathVariable long id) {
		Utilisateur utilisateur = utilisateurService.getUtilisateur(id);
		return utilisateur;
	}
	
	@PostMapping("/UtilisateurByEmail")	
	@ResponseBody
	public Utilisateur UtilisateurByEmail(@RequestBody Utilisateur u) {
		Utilisateur utilisateur = utilisateurService.getUtilisateurByEmail(u.getEmail());
		return utilisateur;
	}
	
//	@PostMapping("/UtilisateurByEmailAndMotdepasse")	
//	@ResponseBody
//	public Utilisateur getUtilisateurByEmailMotdepasse(@RequestBody Utilisateur u) {
//		Utilisateur utilisateur = utilisateurService.getUtilisateurByEmailMotdepasse(u.getEmail(), u.getMotdepasse());
//		return utilisateur;
//	}
		
	@PostMapping("/UtilisateurByEmailAndMotdepasse")	
	@ResponseBody
	public Utilisateur UtilisateurByEmailAndMotdepasse(@RequestBody Utilisateur u)  throws Exception{
		

		String tempEmail = u.getEmail();
		String tempMotdepasse = u.getMotdepasse();
		
		Utilisateur utilisateur = null;
		if(tempEmail != null && tempMotdepasse != null) {
			utilisateur = utilisateurService.getUtilisateurByEmailMotdepasse(tempEmail,tempMotdepasse );
		}
		
		if( utilisateur == null) {
			throw new Exception("Le login ou le mot de passe est incorrecte");
		}
		return  utilisateur;
	}
	
	@PostMapping("/AjouterUtilisateur")
	@ResponseBody
	public Utilisateur AjouterUtilisateur(@RequestBody Utilisateur u) {
		return utilisateurService.saveUtilisateur(u);
	}
	
	@PutMapping("/ModifierUtilisateur/{id}")
	@ResponseBody
	public Utilisateur ModifierUtilisateur(@PathVariable long id, @RequestBody Utilisateur u) {
		u.setIdutilisateur(id);
		return utilisateurService.updateUtilisateur(u);
	}
	
	@DeleteMapping("SupprimerUtilisateur/{id}")
	public void SupprimerUtilisateur(@PathVariable("id") Long Id_utilisateur) {
		utilisateurService.deleteUtilisateurById(Id_utilisateur);
	}
}
