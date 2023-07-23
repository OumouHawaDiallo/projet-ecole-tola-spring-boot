package sn.esp.tola.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.esp.tola.entities.Communication;
import sn.esp.tola.repositories.CommunicationRepository;
import sn.esp.tola.services.CommunicationService;

@Service 
public class CommunicationServiceImpl implements CommunicationService {
	
	@Autowired
	CommunicationRepository communicationRepository;
	
	@Override
	public Communication saveCommunication(Communication c) {
		return communicationRepository.save(c);
	}

	@Override
	public Communication updateCommunication(Communication c) {
		return communicationRepository.save(c);
	}

	@Override
	public void deleteCommunication(Communication c) {
		communicationRepository.delete(c);
	}

	@Override
	public void deleteCommunicationById(Long id) {
		communicationRepository.deleteById(id);
	}

	@Override
	public Communication getCommunication(Long id) {
		return communicationRepository.findById(id).get();
	}

	@Override
	public List<Communication> getAllCommunications() {
		return communicationRepository.findAll();
	}

}
