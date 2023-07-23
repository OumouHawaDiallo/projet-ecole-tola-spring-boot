package sn.esp.tola.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esp.tola.entities.UtilisateurTheme;
import sn.esp.tola.repositories.UtilisateurThemeRepository;
import sn.esp.tola.services.UtilisateurThemeService;

@Service
public class UtilisateurThemeServiceImpl implements UtilisateurThemeService {

	@Autowired
	UtilisateurThemeRepository utilisateurThemeRepository;
	
	@Override
	public UtilisateurTheme saveUtilisateurTheme(UtilisateurTheme u) {
		return utilisateurThemeRepository.save(u);
	}

	@Override
	public UtilisateurTheme updateUtilisateurTheme(UtilisateurTheme u) {
		return utilisateurThemeRepository.save(u);
	}

	@Override
	public void deleteUtilisateurTheme(UtilisateurTheme u) {
		utilisateurThemeRepository.delete(u);
	}

	@Override
	public void deleteUtilisateurThemeById(Long id) {
		utilisateurThemeRepository.deleteById(id);
	}

	@Override
	public UtilisateurTheme getUtilisateurTheme(Long id) {
		return utilisateurThemeRepository.findById(id).get();
	}

	@Override
	public List<UtilisateurTheme> getAllUtilisateurThemes() {
		return utilisateurThemeRepository.findAll();
	}
}
