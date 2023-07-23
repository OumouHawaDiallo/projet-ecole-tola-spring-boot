package sn.esp.tola.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reponse")
public class Reponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idreponse")
	private Long  idreponse;
	
	private String description;
	private long likes;
	private long dislikes;
	
	public Reponse() {
	}

	public Reponse(Long idreponse, String description, long likes, long dislikes) {
		this.idreponse = idreponse;
		this.description = description;
		this.likes = likes;
		this.dislikes = dislikes;
	}

	public Long getIdreponse() {
		return idreponse;
	}

	public void setIdreponse(Long idreponse) {
		this.idreponse = idreponse;
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
		return "Reponse [idreponse=" + idreponse + ", description=" + description + ", likes=" + likes + ", dislikes="
				+ dislikes + "]";
	}
	
}
