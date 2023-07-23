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
@Table(name = "publicationcommentaire")
public class PublicationCommentaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long  id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idpublication")
	private Publication publication;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idcommentaire")
	private Commentaire commentaire;

	public PublicationCommentaire() {
	}

	public PublicationCommentaire(Long id, Publication publication, Commentaire commentaire) {
		this.id = id;
		this.publication = publication;
		this.commentaire = commentaire;
	}

	public PublicationCommentaire(Publication publication, Commentaire commentaire) {
		this.publication = publication;
		this.commentaire = commentaire;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public Commentaire getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}

	@Override
	public String toString() {
		return "QuestionReponse [id=" + id + ", publication=" + publication + ", commentaire=" + commentaire + "]";
	}
			
}
