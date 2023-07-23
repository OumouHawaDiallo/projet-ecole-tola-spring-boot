package sn.esp.tola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.esp.tola.entities.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Long> {

}
