package sn.esp.tola.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esp.tola.entities.Theme;
import sn.esp.tola.repositories.ThemeRepository;
import sn.esp.tola.services.ThemeService;

@Service
public class ThemeServiceImpl  implements ThemeService {

	@Autowired
	ThemeRepository ThemeRepository;
	
	@Override
	public Theme saveTheme(Theme t) {
		return ThemeRepository.save(t);
	}

	@Override
	public Theme updateTheme(Theme t) {
		return ThemeRepository.save(t);
	}

	@Override
	public void deleteTheme(Theme t) {
		ThemeRepository.delete(t);
	}

	@Override
	public void deleteThemeById(Long id) {
		ThemeRepository.deleteById(id);
	}

	@Override
	public Theme getTheme(Long id) {
		return ThemeRepository.findById(id).get();
	}

	@Override
	public List<Theme> getAllThemes() {
		return ThemeRepository.findAll();
	}

}
