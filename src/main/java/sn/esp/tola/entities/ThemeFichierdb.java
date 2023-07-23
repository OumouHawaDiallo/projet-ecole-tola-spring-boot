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
@Table(name = "themefichierdb")
public class ThemeFichierdb {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long  id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idtheme")
	private Theme theme;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idfichierdb")
	private FichierDB fichierdb;

	public ThemeFichierdb() {
	}

	public ThemeFichierdb(Theme theme, FichierDB fichierdb) {
		this.theme = theme;
		this.fichierdb = fichierdb;
	}

	public ThemeFichierdb(Long id, Theme theme, FichierDB fichierdb) {
		this.id = id;
		this.theme = theme;
		this.fichierdb = fichierdb;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public FichierDB getFichierdb() {
		return fichierdb;
	}

	public void setFichierdb(FichierDB fichierdb) {
		this.fichierdb = fichierdb;
	}

	@Override
	public String toString() {
		return "ThemeFichierdb [id=" + id + ", theme=" + theme + ", fichierdb=" + fichierdb + "]";
	}
	
}
