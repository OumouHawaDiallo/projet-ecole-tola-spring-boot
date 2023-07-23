package sn.esp.tola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.esp.tola.entities.Communication;

public interface CommunicationRepository extends JpaRepository<Communication, Long> {

}
