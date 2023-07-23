package sn.esp.tola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.esp.tola.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

	Utilisateur findByEmail(String email);
	Utilisateur findByEmailAndMotdepasse(String email, String motdepasse);
}
