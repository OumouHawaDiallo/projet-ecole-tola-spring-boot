package sn.esp.tola.controllers;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import sn.esp.tola.entities.FichierDB;
import sn.esp.tola.entities.MockMultipartFile;
import sn.esp.tola.entities.Publication;
import sn.esp.tola.entities.PublicationFichierdb;
import sn.esp.tola.repositories.PublicationFichierdbRepository;
import sn.esp.tola.services.FichierStockageService;
import sn.esp.tola.services.PublicationFichierdbService;
import sn.esp.tola.services.PublicationService;

@RestController
@CrossOrigin("http://localhost:4200")
public class PublicationFichierdbController {

	@Autowired
	PublicationFichierdbRepository publicationFichierdbRepository;
	
	@Autowired
	PublicationFichierdbService publicationFichierdbService;
	
	@Autowired
	PublicationService publicationService;
	
	@Autowired
	FichierStockageService fichierStockageService;
	
	@GetMapping("/PublicationFichierdbs")	
	@ResponseBody
	public List<PublicationFichierdb> getAllPublicationFichierdbs() {
		List<PublicationFichierdb> list = publicationFichierdbService.getAllPublicationFichierdbs();
		return list;
	}
	
	@PostMapping("/AjouterPublicationFichierdbById/{idpublication}/{idfichierdb}")
	@ResponseBody
	public void AjouterPublicationFichierdbById(@PathVariable long idpublication, @PathVariable String idfichierdb) {
		
		Publication publication = publicationService.getPublication(idpublication);
		publication.setDate(LocalDate.now());
		FichierDB fichierDB = fichierStockageService.getFile(idfichierdb);
		
		String filename = fichierDB.getNom();
        String contentType = fichierDB.getType();
        byte[] content = fichierDB.getdonnee();
        //ByteArrayResource resource = new ByteArrayResource(content);
        MultipartFile  multipartFile = new MockMultipartFile(filename, filename, contentType, content);

        // fichierStockageService.store(multipartFile);
        
		if(publication != null && fichierDB != null && multipartFile != null) {
			System.out.println(multipartFile instanceof MultipartFile);
			
			UUID uuid = UUID.randomUUID();
	        long id = uuid.getLeastSignificantBits() ^ uuid.getMostSignificantBits();
	        
			PublicationFichierdb publicationFichierdb = new PublicationFichierdb(id, publication, fichierDB);
			publicationFichierdbRepository.save(publicationFichierdb);
	
		}
	}
}
