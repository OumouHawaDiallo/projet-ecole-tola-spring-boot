package sn.esp.tola.message;

public class ReponseFichier {

	private String nom;
	private String url;
	private String type;
	private long taille;
	
	public ReponseFichier(String nom, String url, String type, long taille) {
		this.nom = nom;
		this.url = url;
		this.type = type;
		this.taille = taille;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getTaille() {
		return taille;
	}

	public void setTaille(long taille) {
		this.taille = taille;
	}
	
		
}
