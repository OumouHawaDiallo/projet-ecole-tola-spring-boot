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
@Table(name = "questionreponse")
public class QuestionReponse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long  id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idquestion")
	private Question question;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idreponse")
	private Reponse reponse;

	public QuestionReponse() {
	}

	public QuestionReponse(Long id, Question question, Reponse reponse) {
		this.id = id;
		this.question = question;
		this.reponse = reponse;
	}
	
	public QuestionReponse(Question question, Reponse reponse) {
		this.question = question;
		this.reponse = reponse;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Reponse getReponse() {
		return reponse;
	}

	public void setReponse(Reponse reponse) {
		this.reponse = reponse;
	}

	@Override
	public String toString() {
		return "QuestionReponse [id=" + id + ", question=" + question + ", reponse=" + reponse + "]";
	}
		
}
