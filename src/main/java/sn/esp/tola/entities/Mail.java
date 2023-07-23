package sn.esp.tola.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mail")
public class Mail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idmail")
	private Long  idmail;
	private String destinataire;
	private String objet;
	private String corps;
	
	public Mail() {
	}

	public Mail(String destinataire, String objet, String corps) {
		this.destinataire = destinataire;
		this.objet = objet;
		this.corps = corps;
	}

	public Long getIdmail() {
		return idmail;
	}

	public void setIdmail(Long idmail) {
		this.idmail = idmail;
	}

	public String getDestinataire() {
		return destinataire;
	}

	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getCorps() {
		return corps;
	}

	public void setCorps(String corps) {
		this.corps = corps;
	}

	@Override
	public String toString() {
		return "Mail [idmail=" + idmail + ", destinataire=" + destinataire + ", objet=" + objet + ", corps=" + corps
				+ "]";
	}
}
