package sn.esp.tola.entities;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idutilisateur")
	private Long  idutilisateur;

	private String email;
	private String nom;
	private String motdepasse;

	@OneToOne(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	@JoinTable(	name = "utilisateurfichierdb", 
			joinColumns = { 
					@JoinColumn(name = "idutilisateur") 
	}, inverseJoinColumns = { 
			@JoinColumn(name = "idfichierdb") 
	}
			)
	private FichierDB fichierDB;

	//	@OneToOne(cascade = CascadeType.ALL)
	//	@JoinColumn(name = "idfichier")
	//	private FichierDB fichierDB;

	// ----------------------------------------------------
	@ManyToMany(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	@JoinTable(	name = "utilisateurtheme", 
	joinColumns = { 
			@JoinColumn(name = "idutilisateur") 
	}, inverseJoinColumns = { 
			@JoinColumn(name = "idtheme") 
	}
			)
	private List<Theme> themes;
	// ----------------------------------------------------
	@OneToMany(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	@JoinTable(	name = "utilisateurquestion", 
	joinColumns = { 
			@JoinColumn(name = "idutilisateur") 
	}, inverseJoinColumns = { 
			@JoinColumn(name = "idquestion") 
	}
			)
	private List<Question> questions;
	// ----------------------------------------------------
	@OneToMany(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	@JoinTable(	name = "utilisateurpublication", 
	joinColumns = { 
			@JoinColumn(name = "idutilisateur") 
	}, inverseJoinColumns = { 
			@JoinColumn(name = "idpublication") 
	}
			)
	private List<Publication> Publications;
	// ----------------------------------------------------

	public Utilisateur() {
	}
	public Utilisateur(Long idutilisateur, String email, String nom, String motdepasse, FichierDB fichierDB,
			List<Theme> themes, List<Question> questions, List<Publication> publications) {
		super();
		this.idutilisateur = idutilisateur;
		this.email = email;
		this.nom = nom;
		this.motdepasse = motdepasse;
		this.fichierDB = fichierDB;
		this.themes = themes;
		this.questions = questions;
		Publications = publications;
	}
	public Long getIdutilisateur() {
		return idutilisateur;
	}
	public void setIdutilisateur(Long idutilisateur) {
		this.idutilisateur = idutilisateur;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMotdepasse() {
		return motdepasse;
	}
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	public FichierDB getFichierDB() {
		return fichierDB;
	}
	public void setFichierDB(FichierDB fichierDB) {
		this.fichierDB = fichierDB;
	}
	public List<Theme> getThemes() {
		return themes;
	}
	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public List<Publication> getPublications() {
		return Publications;
	}
	public void setPublications(List<Publication> publications) {
		Publications = publications;
	}
	@Override
	public String toString() {
		return "Utilisateur [idutilisateur=" + idutilisateur + ", email=" + email + ", nom=" + nom + ", motdepasse="
				+ motdepasse + ", fichierDB=" + fichierDB + ", themes=" + themes + ", questions=" + questions
				+ ", Publications=" + Publications + "]";
	}
}
