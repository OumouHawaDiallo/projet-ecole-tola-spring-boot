package sn.esp.tola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.esp.tola.entities.FichierDB;
import sn.esp.tola.entities.Publication;
import sn.esp.tola.entities.PublicationFichierdb;

public interface PublicationFichierdbRepository extends JpaRepository<PublicationFichierdb, Long> {
	
	PublicationFichierdb findByPublicationAndFichierdb(Publication publication, FichierDB fichierdb);
}
