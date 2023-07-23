package sn.esp.tola.services;

import java.util.List;

import sn.esp.tola.entities.Communication;

public interface CommunicationService {
	
	Communication saveCommunication(Communication c);
	Communication updateCommunication(Communication c);
	void deleteCommunication(Communication c);
	void deleteCommunicationById(Long id);
	Communication getCommunication(Long id);
	List<Communication> getAllCommunications();

}
