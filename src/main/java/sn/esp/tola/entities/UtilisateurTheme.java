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
@Table(name = "utilisateurtheme")
public class UtilisateurTheme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long  id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idutilisateur")
	private Utilisateur utilisateur;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idtheme")
	private Theme theme;
		
	public UtilisateurTheme() {
	}
		
	public UtilisateurTheme(Long id, Utilisateur utilisateur, Theme theme) {
		this.id = id;
		this.utilisateur = utilisateur;
		this.theme = theme;
	}



	public UtilisateurTheme(Utilisateur utilisateur, Theme theme) {
		this.utilisateur = utilisateur;
		this.theme = theme;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	@Override
	public String toString() {
		return "UtilisateurTheme [utilisateur=" + utilisateur + ", theme=" + theme + "]";
	}
			
}
