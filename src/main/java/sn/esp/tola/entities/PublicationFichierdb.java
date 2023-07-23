package sn.esp.tola.entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "publicationfichierdb")
public class PublicationFichierdb {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
	private Long  id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idpublication")
	private Publication publication;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idfichierdb")
	private FichierDB fichierdb;

	public PublicationFichierdb() {
	}

	public PublicationFichierdb(Publication publication, FichierDB fichierdb) {
		this.publication = publication;
		this.fichierdb = fichierdb;
	}

	public PublicationFichierdb(Long id, Publication publication, FichierDB fichierdb) {
		this.id = id;
		this.publication = publication;
		this.fichierdb = fichierdb;
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

	public FichierDB getFichierdb() {
		return fichierdb;
	}

	public void setFichierdb(FichierDB fichierdb) {
		this.fichierdb = fichierdb;
	}

	@Override
	public String toString() {
		return "PublicationFichierdb [id=" + id + ", publication=" + publication + ", fichierdb=" + fichierdb + "]";
	}

}
