package sn.esp.tola.entities;



import java.util.Arrays;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fichiers")
public class FichierDB {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "id", nullable = false)
	private String idfichierdb;

	private String nom;
	private String type;

	//@Lob
	//@Column(columnDefinition = "BLOB")
	@Column(columnDefinition = "LONGBLOB")
	private byte[] donnee;

	public FichierDB() {
	}

	public FichierDB(String idfichierdb, String nom, String type, byte[] donnee) {
		this.idfichierdb = idfichierdb;
		this.nom = nom;
		this.type = type;
		this.donnee = donnee;
	}
	
	public FichierDB(String nom, String type, byte[] donnee) {
		this.nom = nom;
		this.type = type;
		this.donnee = donnee;
	}

	public String getIdfichierdb() {
		return idfichierdb;
	}

	public void setId(String idfichierdb) {
		this.idfichierdb = idfichierdb;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getdonnee() {
		return donnee;
	}

	public void setdonnee(byte[] donnee) {
		this.donnee = donnee;
	}

	@Override
	public String toString() {
		return "FichierDB [idfichierdb=" + idfichierdb + ", nom=" + nom + ", type=" + type + ", donnee=" + Arrays.toString(donnee) + "]";
	}
	
		
}
