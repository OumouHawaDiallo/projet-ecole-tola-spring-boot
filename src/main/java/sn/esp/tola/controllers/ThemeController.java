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

import sn.esp.tola.entities.Theme;
import sn.esp.tola.services.ThemeService;

@RestController
@CrossOrigin("http://localhost:4200")
public class ThemeController {
	
	@Autowired
	ThemeService themeService;
	
	@GetMapping("/Themes")	
	@ResponseBody
	public List<Theme> getAllThemes() {
		List<Theme> list = themeService.getAllThemes();
		return list;
	}
	
	@GetMapping("/ThemeById/{id}")	
	@ResponseBody
	public Theme ThemeById(@PathVariable long id) {
		Theme theme = themeService.getTheme(id);
		return theme;
	}
	
	@PostMapping("/AjouterTheme")
	@ResponseBody
	public Theme AjouterTheme(@RequestBody Theme t) {
		return themeService.saveTheme(t);
	}
	
	@PutMapping("/ModifierTheme/{id}")
	@ResponseBody
	public Theme ModifierTheme(@PathVariable long id, @RequestBody Theme t) {
		t.setIdtheme(id);
		return themeService.updateTheme(t);
	}
	
	@DeleteMapping("SupprimerTheme/{id}")
	public void SupprimerTheme(@PathVariable("id") Long Id_theme) {
		themeService.deleteThemeById(Id_theme);
	}

}
