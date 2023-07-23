package sn.esp.tola.entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "theme")
public class Theme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtheme")
	private Long  idtheme;

	private String nom;
	private String description;

	@OneToOne(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	@JoinTable(	name = "themefichierdb", 
			joinColumns = { 
					@JoinColumn(name = "idtheme") 
	}, inverseJoinColumns = { 
			@JoinColumn(name = "idfichierdb") 
	}
			)
	private FichierDB fichierDB;

	//	@OneToOne(cascade = CascadeType.ALL)
	//	@JoinColumn(name = "idfichier")
	//	private FichierDB fichierDB;

	public Theme() {
	}

	public Theme(Long idtheme, String nom, String description, FichierDB fichierDB) {
		this.idtheme = idtheme;
		this.nom = nom;
		this.description = description;
		this.fichierDB = fichierDB;
	}

	public Long getIdtheme() {
		return idtheme;
	}

	public void setIdtheme(Long idtheme) {
		this.idtheme = idtheme;
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

	public FichierDB getFichierDB() {
		return fichierDB;
	}

	public void setFichierDB(FichierDB fichierDB) {
		this.fichierDB = fichierDB;
	}

	@Override
	public String toString() {
		return "Theme [idtheme=" + idtheme + ", nom=" + nom + ", description=" + description + ", fichierDB="
				+ fichierDB + "]";
	}

}
