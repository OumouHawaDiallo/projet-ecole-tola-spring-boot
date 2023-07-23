package sn.esp.tola.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "communication")
public class Communication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcommunication")
	private Long  idcommunication;

	private String  description;
	
	public Communication() {
	}

	public Communication(Long idcommunication, String description) {
		this.idcommunication = idcommunication;
		this.description = description;
	}

	public Long getIdcommunication() {
		return idcommunication;
	}

	public void setIdcommunication(Long idcommunication) {
		this.idcommunication = idcommunication;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Communication [idcommunication=" + idcommunication + ", description=" + description + "]";
	}

		
}
