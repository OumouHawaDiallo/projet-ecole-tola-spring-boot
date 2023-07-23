package sn.esp.tola;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.esp.tola.entities.Theme;
import sn.esp.tola.repositories.FichierDBRepository;
import sn.esp.tola.repositories.ThemeFichierdbRepository;
import sn.esp.tola.repositories.ThemeRepository;
import sn.esp.tola.services.FichierStockageService;

@SpringBootApplication
public class TolaApplication implements CommandLineRunner {
	
	@Autowired
	ThemeRepository themeRepository;
	
	@Autowired
	FichierDBRepository fichierDBRepository;
	
	@Autowired
	ThemeFichierdbRepository themeFichierDBRepository;
	
	@Autowired
	FichierStockageService fichierStockageService;

	public static void main(String[] args) {
		SpringApplication.run(TolaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
//		FichierDB fichier;
//		
//		fichier = fichierDBRepository.findById("1");
//		if(fichier.isPresent())
//			themeRepository.save(new Theme((long)1, "Anglais", null, fichier.get()));
		
		themeRepository.save(new Theme((long)1, "Anglais", null, null));
//		fichier = fichierStockageService.getFile("1");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
			
		themeRepository.save(new Theme((long)2, "Réseau", null, null));
//		fichier = fichierStockageService.getFile("2");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
		
		themeRepository.save(new Theme((long)3, "Systèmes d'exploitation", null, null));
//		fichier = fichierStockageService.getFile("3");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
		
		themeRepository.save(new Theme((long)4, "Web", null, null));
//		fichier = fichierStockageService.getFile("4");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
		
		themeRepository.save(new Theme((long)5, "Cloud computing", null, null));
//		fichier = fichierStockageService.getFile("5");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
		
		themeRepository.save(new Theme((long)6, "Ingénierie des Processus de Développement Logiciel", null, null));
//		fichier = fichierStockageService.getFile("6");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
		
		themeRepository.save(new Theme((long)7, "Mathématique", null, null));
//		fichier = fichierStockageService.getFile("7");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
		
		themeRepository.save(new Theme((long)8, "Cyber Sécurité", null, null));
//		fichier = fichierStockageService.getFile("8");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
		
		themeRepository.save(new Theme((long)9, "Java", null, null));
//		fichier = fichierStockageService.getFile("9");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
		
		themeRepository.save(new Theme((long)10, "Python", null, null));
//		fichier = fichierStockageService.getFile("10");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
		
		themeRepository.save(new Theme((long)11, "Intelligence artificielle", null, null));
//		fichier = fichierStockageService.getFile("11");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
		
		themeRepository.save(new Theme((long)12, "Architecture logicielle", null, null));
//		fichier = fichierStockageService.getFile("12");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
		
		themeRepository.save(new Theme((long)13, "Algorithmique", null, null));
//		fichier = fichierStockageService.getFile("13");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
		
		themeRepository.save(new Theme((long)14, "Mobile", null, null));
//		fichier = fichierStockageService.getFile("14");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
		
		themeRepository.save(new Theme((long)15, "Programmation orientée objet", null, null));	
//		fichier = fichierStockageService.getFile("15");
//		if(fichier != null)
//			themeFichierDBRepository.save(new ThemeFichierdb(theme, fichier));
		
						
    }
	
	

}
