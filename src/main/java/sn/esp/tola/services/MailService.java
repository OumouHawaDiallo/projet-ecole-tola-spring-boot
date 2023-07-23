package sn.esp.tola.services;

import java.util.List;

import sn.esp.tola.entities.Mail;


public interface MailService {

	Mail saveMail(Mail m);
	Mail updateMail(Mail m);
	void deleteMail(Mail m);
	void deleteMailById(Long id);
	Mail getMail(Long id);
	List<Mail> getAllMails();

	
	//
	Long sendEmail(Mail mail);
	void sendEmail(String destinataire, String objet, String corps);
}
