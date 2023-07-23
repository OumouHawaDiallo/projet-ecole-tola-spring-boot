package sn.esp.tola.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "publication")
public class Publication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpublication")
	private Long  idpublication;
	
	private String nom;
	@Column(columnDefinition = "TEXT")
	private String description;
	private LocalDate date;;
	private long likes;
	private long dislikes;
	
	@OneToOne(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	@JoinTable(	name = "publicationfichierdb", 
		joinColumns = { 
				@JoinColumn(name = "idpublication") 
		}, inverseJoinColumns = { 
				@JoinColumn(name = "idfichierdb") 
		}
	)
	private FichierDB fichierDB;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "idfichier")
//	private FichierDB fichierDB;
	
	@OneToMany(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	@JoinTable(	name = "publicationcommentaire", 
		joinColumns = { 
				@JoinColumn(name = "idpublication") 
		}, inverseJoinColumns = { 
				@JoinColumn(name = "idcommentaire") 
		}
	)
	private List<Commentaire> commentaires;
	
	public Publication() {
	}

	public Publication(Long idpublication, String nom, String description, LocalDate date, long likes, long dislikes,
			FichierDB fichierDB, List<Commentaire> commentaires) {
		this.idpublication = idpublication;
		this.nom = nom;
		this.description = description;
		this.date = date;
		this.likes = likes;
		this.dislikes = dislikes;
		this.fichierDB = fichierDB;
		this.commentaires = commentaires;
	}

	public Long getIdpublication() {
		return idpublication;
	}

	public void setIdpublication(Long idpublication) {
		this.idpublication = idpublication;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public long getLikes() {
		return likes;
	}

	public void setLikes(long likes) {
		this.likes = likes;
	}

	public long getDislikes() {
		return dislikes;
	}

	public void setDislikes(long dislikes) {
		this.dislikes = dislikes;
	}

	public FichierDB getFichierDB() {
		return fichierDB;
	}

	public void setFichierDB(FichierDB fichierDB) {
		this.fichierDB = fichierDB;
	}

	public List<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	@Override
	public String toString() {
		return "Publication [idpublication=" + idpublication + ", nom=" + nom + ", description=" + description
				+ ", date=" + date + ", likes=" + likes + ", dislikes=" + dislikes + ", fichierDB=" + fichierDB
				+ ", commentaires=" + commentaires + "]";
	}

}
