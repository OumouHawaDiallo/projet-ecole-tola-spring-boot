package sn.esp.tola.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sn.esp.tola.entities.Communication;
import sn.esp.tola.services.CommunicationService;

@RestController
@CrossOrigin("http://localhost:4200")
public class CommunicationController {
	
	@Autowired
	CommunicationService communicationService;
	
	@GetMapping("/Communications")	
	@ResponseBody
	public List<Communication> getAllCommunications() {
		List<Communication> list = communicationService.getAllCommunications();
		return list;
	}
	
	@GetMapping("/communicationById/{id}")	
	@ResponseBody
	public Communication CommunicationById(@PathVariable long id) {
		Communication communication = communicationService.getCommunication(id);
		return communication;
	}
	
	@PostMapping("/AjouterCommunication")
	@ResponseBody
	public Communication AjouterCommunication(@RequestBody Communication c) {
		return communicationService.saveCommunication(c);
	}
	
	@PutMapping("/ModifierCommunication/{id}")
	@ResponseBody
	public Communication ModifierCommunication(@PathVariable long id, @RequestBody Communication c) {
		c.setIdcommunication(id);
		return communicationService.updateCommunication(c);
	}
	
	@DeleteMapping("SupprimerCommunication/{id}")
	public void SupprimerCommunication(@PathVariable("id") Long Id_communication) {
		communicationService.deleteCommunicationById(Id_communication);
	}

}
