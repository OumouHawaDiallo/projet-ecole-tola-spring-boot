package sn.esp.tola.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sn.esp.tola.entities.Theme;
import sn.esp.tola.entities.Utilisateur;
import sn.esp.tola.entities.UtilisateurTheme;
import sn.esp.tola.repositories.UtilisateurThemeRepository;
import sn.esp.tola.services.ThemeService;
import sn.esp.tola.services.UtilisateurService;
import sn.esp.tola.services.UtilisateurThemeService;

@RestController
@CrossOrigin("http://localhost:4200")
public class UtilisateurThemeController {

	@Autowired
	UtilisateurThemeRepository utilisateurThemeRepository;
	
	@Autowired
	UtilisateurThemeService utilisateurThemeService;
	
	@Autowired
	UtilisateurService utilisateurService;
	
	@Autowired
	ThemeService themeService;
	
	@GetMapping("/UtilisateurThemes")	
	@ResponseBody
	public List<UtilisateurTheme> getAllUtilisateurThemes() {
		List<UtilisateurTheme> list = utilisateurThemeService.getAllUtilisateurThemes();
		return list;
	}
	
	@PostMapping("/AjouterUtilisateurThemeById/{idutulisateur}/{idtheme}")
	@ResponseBody
	public void AjouterUtilisateurThemeById(@PathVariable long idutulisateur, @PathVariable long idtheme) {
		
		Utilisateur utilisateur = utilisateurService.getUtilisateur(idutulisateur);
		Theme theme = themeService.getTheme(idtheme);
		
		if(utilisateur != null && theme != null)
			utilisateurThemeRepository.save(new UtilisateurTheme(utilisateur, theme));
	}
	
}
