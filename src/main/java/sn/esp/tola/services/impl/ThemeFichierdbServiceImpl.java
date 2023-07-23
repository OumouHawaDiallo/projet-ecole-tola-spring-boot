package sn.esp.tola.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esp.tola.entities.ThemeFichierdb;
import sn.esp.tola.repositories.ThemeFichierdbRepository;
import sn.esp.tola.services.ThemeFichierdbService;

@Service
public class ThemeFichierdbServiceImpl implements ThemeFichierdbService {

	@Autowired
	ThemeFichierdbRepository ThemeFichierdbRepository;
	
	@Override
	public ThemeFichierdb saveThemeFichierdb(ThemeFichierdb u) {
		return ThemeFichierdbRepository.save(u);
	}

	@Override
	public ThemeFichierdb updateThemeFichierdb(ThemeFichierdb u) {
		return ThemeFichierdbRepository.save(u);
	}

	@Override
	public void deleteThemeFichierdb(ThemeFichierdb u) {
		ThemeFichierdbRepository.delete(u);
	}

	@Override
	public void deleteThemeFichierdbById(Long id) {
		ThemeFichierdbRepository.deleteById(id);
	}

	@Override
	public ThemeFichierdb getThemeFichierdb(Long id) {
		return ThemeFichierdbRepository.findById(id).get();
	}

	@Override
	public List<ThemeFichierdb> getAllThemeFichierdbs() {
		return ThemeFichierdbRepository.findAll();
	}
}
