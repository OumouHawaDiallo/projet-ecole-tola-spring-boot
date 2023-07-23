package sn.esp.tola.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import sn.esp.tola.entities.Mail;
import sn.esp.tola.repositories.MailRepository;
import sn.esp.tola.repositories.UtilisateurRepository;
import sn.esp.tola.services.MailService;

@Service
public class MailServiceImpl implements MailService {

	@Autowired
	MailRepository mailRepository;
	
	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	@Autowired
	private JavaMailSender mailSender;


	@Override
	public Mail saveMail(Mail m) {
		return mailRepository.save(m);
	}

	@Override
	public Mail updateMail(Mail m) {
		return mailRepository.save(m);
	}

	@Override
	public void deleteMail(Mail m) {
		mailRepository.delete(m);
	}

	@Override
	public void deleteMailById(Long id) {
		mailRepository.deleteById(id);
	}

	@Override
	public Mail getMail(Long id) {
		return mailRepository.findById(id).get();
	}

	@Override
	public List<Mail> getAllMails() {
		return mailRepository.findAll();
	}
	
	
	// ---------------------------------------------------
	
	

	@Override
	public Long sendEmail(Mail message) {
		
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("ibou251099@gmail.com");
        simpleMailMessage.setTo(message.getDestinataire());
        simpleMailMessage.setSubject(message.getObjet());
        simpleMailMessage.setText(message.getCorps());

        this.mailSender.send(simpleMailMessage);
        
        System.out.println("Le message est envoyé avec succès...");
        
        return mailRepository.save(message).getIdmail();        		
     
	}
	
	
	
	@Override
	public void sendEmail(String destinataire, String objet, String corps) {
		
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("ibou251099@gmail.com");
        simpleMailMessage.setTo(destinataire);
        simpleMailMessage.setSubject(objet);
        simpleMailMessage.setText(corps);

        this.mailSender.send(simpleMailMessage);
        
        System.out.println("Le message est envoyé avec succès...");
        
        
        //return utilisateurRepository.findByEmail(destinataire);       		
     
	}
}
