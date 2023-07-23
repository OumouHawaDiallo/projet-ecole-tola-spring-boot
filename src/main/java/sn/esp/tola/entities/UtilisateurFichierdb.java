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
@Table(name = "utilisateurfichierdb")
public class UtilisateurFichierdb {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long  id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idutilisateur")
	private Utilisateur utilisateur;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idfichierdb")
	private FichierDB fichierdb;

	public UtilisateurFichierdb() {
	}

	public UtilisateurFichierdb(Long id, Utilisateur utilisateur, FichierDB fichierdb) {
		this.id = id;
		this.utilisateur = utilisateur;
		this.fichierdb = fichierdb;
	}

	public UtilisateurFichierdb(Utilisateur utilisateur, FichierDB fichierdb) {
		this.utilisateur = utilisateur;
		this.fichierdb = fichierdb;
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

	public FichierDB getFichierdb() {
		return fichierdb;
	}

	public void setFichierdb(FichierDB fichierdb) {
		this.fichierdb = fichierdb;
	}

	@Override
	public String toString() {
		return "UtilisateurFichierdb [id=" + id + ", utilisateur=" + utilisateur + ", fichierdb=" + fichierdb + "]";
	}
	
}
