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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idquestion")
	private Long  idquestion;
	
	private String description;
	
	@OneToMany(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	@JoinTable(	name = "questionreponse", 
		joinColumns = { 
				@JoinColumn(name = "idquestion") 
		}, inverseJoinColumns = { 
				@JoinColumn(name = "idreponse") 
		}
	)
	private List<Reponse> reponses;

	public Question() {
	}

	public Question(Long idquestion, String description, List<Reponse> reponses) {
		this.idquestion = idquestion;
		this.description = description;
		this.reponses = reponses;
	}

	public Long getIdquestion() {
		return idquestion;
	}

	public void setIdquestion(Long idquestion) {
		this.idquestion = idquestion;
	}

	public String getDescription() {
		return description;
	}

	public void setNom(String description) {
		this.description = description;
	}

	public List<Reponse> getReponses() {
		return reponses;
	}

	public void setReponses(List<Reponse> reponses) {
		this.reponses = reponses;
	}

	@Override
	public String toString() {
		return "Question [idquestion=" + idquestion + ", description=" + description + ", reponses=" + reponses + "]";
	}
		
}
