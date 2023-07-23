package sn.esp.tola.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "utilisateurpublication")
public class UtilisateurPublication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long  id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idutilisateur")
	private Utilisateur utilisateur;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idpublication")
	private Publication publication;

	public UtilisateurPublication() {
	}

	public UtilisateurPublication(Long id, Utilisateur utilisateur, Publication publication) {
		this.id = id;
		this.utilisateur = utilisateur;
		this.publication = publication;
	}
	
	public UtilisateurPublication(Utilisateur utilisateur, Publication publication) {
		this.utilisateur = utilisateur;
		this.publication = publication;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	@Override
	public String toString() {
		return "UtilisateurPublication [id=" + id + ", utilisateur=" + utilisateur + ", publication=" + publication
				+ "]";
	}
			
}
