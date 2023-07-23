package sn.esp.tola.services;

import java.util.List;

import sn.esp.tola.entities.UtilisateurTheme;

public interface UtilisateurThemeService {

	UtilisateurTheme saveUtilisateurTheme(UtilisateurTheme u);
	UtilisateurTheme updateUtilisateurTheme(UtilisateurTheme u);
	void deleteUtilisateurTheme(UtilisateurTheme u);
	void deleteUtilisateurThemeById(Long id);
	UtilisateurTheme getUtilisateurTheme(Long id);
	List<UtilisateurTheme> getAllUtilisateurThemes();
}
