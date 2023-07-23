package sn.esp.tola.services;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.web.multipart.MultipartFile;

import sn.esp.tola.entities.FichierDB;

public interface FichierStockageService {

	public FichierDB store(MultipartFile file) throws IOException;
	  
	public FichierDB getFile(String id);
	
	public FichierDB getFileByNom(String id);
	  
	public void deleteFile(String id);
	  
	public Stream<FichierDB> getAllFiles();
	
	
	public Optional<FichierDB> getFileById(String id);
}
