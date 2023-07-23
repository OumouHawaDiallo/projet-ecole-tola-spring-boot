package sn.esp.tola.services;

import java.util.List;

import sn.esp.tola.entities.ThemeFichierdb;

public interface ThemeFichierdbService {

	ThemeFichierdb saveThemeFichierdb(ThemeFichierdb t);
	ThemeFichierdb updateThemeFichierdb(ThemeFichierdb t);
	void deleteThemeFichierdb(ThemeFichierdb t);
	void deleteThemeFichierdbById(Long id);
	ThemeFichierdb getThemeFichierdb(Long id);
	List<ThemeFichierdb> getAllThemeFichierdbs();
}
