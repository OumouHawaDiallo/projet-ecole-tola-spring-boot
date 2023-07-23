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
@Table(name = "utilisateurquestion")
public class UtilisateurQuestion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long  id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idutilisateur")
	private Utilisateur utilisateur;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idquestion")
	private Question question;

	public UtilisateurQuestion() {
	}

	public UtilisateurQuestion(Long id, Utilisateur utilisateur, Question question) {
		this.id = id;
		this.utilisateur = utilisateur;
		this.question = question;
	}
	
	public UtilisateurQuestion(Utilisateur utilisateur, Question question) {
		this.utilisateur = utilisateur;
		this.question = question;
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

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "UtilisateurQuestion [id=" + id + ", utilisateur=" + utilisateur + ", question=" + question + "]";
	}
	
		
}
