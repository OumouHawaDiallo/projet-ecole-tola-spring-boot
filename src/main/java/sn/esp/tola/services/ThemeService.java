package sn.esp.tola.services;

import java.util.List;

import sn.esp.tola.entities.Theme;

public interface ThemeService {

	Theme saveTheme(Theme t);
	Theme updateTheme(Theme t);
	void deleteTheme(Theme t);
	void deleteThemeById(Long id);
	Theme getTheme(Long id);
	List<Theme> getAllThemes();
}
