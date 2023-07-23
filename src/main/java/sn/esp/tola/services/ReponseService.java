package sn.esp.tola.services;

import java.util.List;

import sn.esp.tola.entities.Reponse;

public interface ReponseService {
	
	Reponse saveReponse(Reponse r);
	Reponse updateReponse(Reponse r);
	void deleteReponse(Reponse r);
	void deleteReponseById(Long id);
	Reponse getReponse(Long id);
	List<Reponse> getAllReponses();

}
