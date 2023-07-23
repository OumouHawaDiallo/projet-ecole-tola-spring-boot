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
import sn.esp.tola.entities.Theme;
import sn.esp.tola.entities.ThemeFichierdb;
import sn.esp.tola.repositories.ThemeFichierdbRepository;
import sn.esp.tola.services.FichierStockageService;
import sn.esp.tola.services.ThemeFichierdbService;
import sn.esp.tola.services.ThemeService;

@RestController
@CrossOrigin("http://localhost:4200")
public class ThemeFichierdbController {

	@Autowired
	ThemeFichierdbRepository themeFichierdbRepository;
	
	@Autowired
	ThemeFichierdbService themeFichierdbService;
	
	@Autowired
	ThemeService themeService;
	
	@Autowired
	FichierStockageService fichierStockageService;
	
	@GetMapping("/ThemeFichierdbs")	
	@ResponseBody
	public List<ThemeFichierdb> getAllThemeFichierdbs() {
		List<ThemeFichierdb> list = themeFichierdbService.getAllThemeFichierdbs();
		return list;
	}
	
	@PostMapping("/AjouterThemeFichierdbById/{idtheme}/{idfichierdb}")
	@ResponseBody
	public void AjouterThemeFichierdbById(@PathVariable long idtheme, @PathVariable String idfichierdb) {
		
		Theme theme = themeService.getTheme(idtheme);
		FichierDB fichierDB = fichierStockageService.getFile(idfichierdb);
		
		if(theme != null && fichierDB != null)
			themeFichierdbRepository.save(new ThemeFichierdb(theme, fichierDB));
	}
}
