package sn.esp.tola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.esp.tola.entities.Mail;


public interface MailRepository extends JpaRepository<Mail, Long> {

}
