package sn.esp.tola.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "commentaire")
public class Commentaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcommentaire")
	private Long  idcommentaire;
	
	private String description;
	private long likes;
	private long dislikes;
		
	public Commentaire() {
	}

	public Commentaire(Long idcommentaire, String description, long likes, long dislikes) {
		this.idcommentaire = idcommentaire;
		this.description = description;
		this.likes = likes;
		this.dislikes = dislikes;
	}

	public Long getIdcommentaire() {
		return idcommentaire;
	}

	public void setIdcommentaire(Long idcommentaire) {
		this.idcommentaire = idcommentaire;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Override
	public String toString() {
		return "Commentaire [idcommentaire=" + idcommentaire + ", description=" + description + ", likes=" + likes
				+ ", dislikes=" + dislikes + "]";
	}
		
}
