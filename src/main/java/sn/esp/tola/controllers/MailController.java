package sn.esp.tola.controllers;

import java.security.SecureRandom;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sn.esp.tola.entities.Mail;
import sn.esp.tola.entities.Utilisateur;
import sn.esp.tola.services.MailService;
import sn.esp.tola.services.UtilisateurService;


@RestController
@CrossOrigin("http://localhost:4200")
public class MailController {

	@Autowired
	MailService mailService;

	@Autowired
	UtilisateurService utilisateurService;

	@GetMapping("/Mails")
	@ResponseBody
	public List<Mail> getAllMails() {
		List<Mail> list = mailService.getAllMails();
		return list;
	}

	@PostMapping("/AjouterMail")
	@ResponseBody
	public Mail AjouterMail(@RequestBody Mail m) {
		return mailService.saveMail(m);
	}


	@PostMapping("/EnvoyerMail")
	@ResponseBody
	public ResponseEntity<String> EnvoyerMail(@RequestBody Mail mail) {

		mailService.sendEmail(mail);
		return ResponseEntity.ok("Mail envoyé");

	}
	
	@PostMapping("/EnvoyerMailVerification")
	@ResponseBody
	public Utilisateur EnvoyerMailRecuperation(@RequestBody Utilisateur utilisateur) throws Exception {

		Utilisateur utilisateurObj = utilisateurService.getUtilisateurByEmail(utilisateur.getEmail());
		
		if(utilisateur.getEmail() != null && !"".equals(utilisateur.getEmail())) {
			
			// chercher si l'email existe
			if(utilisateurObj != null) {
				
				final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
				
				
				SecureRandom random = new SecureRandom();
		        StringBuilder sb = new StringBuilder();
		        
		        for (int i = 0; i < 10; i++)
		        {
		            int randomIndex = random.nextInt(chars.length());
		            sb.append(chars.charAt(randomIndex));
		        }
		        
		        String motdepasse = sb.toString();
		        
		        Utilisateur pers = utilisateurService.getUtilisateurByEmail(utilisateur.getEmail());
				pers.setMotdepasse(motdepasse);
				utilisateurService.updateUtilisateur(utilisateurObj);
				
				mailService.sendEmail(utilisateurObj.getEmail(), "Verification de mot de passe", "TOLA\nVotre mot de passe est :\n"+ motdepasse + "\n");
			
			} else {
				throw new Exception("L'email "+utilisateur.getEmail()+" n'existe pas");
			}
			
		} else {
			throw new Exception("Veiller renseigner un email");
		}
		
        return  utilisateurObj;
	}

//	@PostMapping("/EnvoyerMailVerification")
//	@ResponseBody
//	public void EnvoyerMailRecuperation(@RequestBody Utilisateur utilisateur) {
//
//		Utilisateur utilisateurObj = utilisateurService.getUtilisateur(utilisateur.getIdutilisateur());
//
//
//		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//
//		SecureRandom random = new SecureRandom();
//		StringBuilder sb = new StringBuilder();
//
//		for (int i = 0; i < 10; i++)
//		{
//			int randomIndex = random.nextInt(chars.length());
//			sb.append(chars.charAt(randomIndex));
//		}
//
//		String motdepasse = sb.toString();
//
//		utilisateurObj.setMotdepasse(motdepasse);
//		utilisateurService.updateUtilisateur(utilisateurObj);
//
//		mailService.sendEmail(utilisateurObj.getEmail(), "Recuperation de mot de passe", "GESTION DE STAGE\nVotre mot de passe est :\n"+ motdepasse + "\n");
//
//	}

	@DeleteMapping("SupprimerMail/{id}")
	public void SupprimerMail(@PathVariable("id") Long Id_Mail) {
		mailService.deleteMailById(Id_Mail);
	}
}
