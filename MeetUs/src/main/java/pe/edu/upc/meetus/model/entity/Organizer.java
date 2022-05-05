package pe.edu.upc.meetus.model.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "organizer",
indexes = {@Index(columnList = "name, last_name",name = "organizer_index_name_last_name")})
@SequenceGenerator(name = "genOrganizer", initialValue = 11, allocationSize = 1)
public class Organizer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genOrganizer")
	@Column(name = "organizer_id", columnDefinition = "NUMERIC(6)")
	private Integer id;

	@Column(name = "name", length = 30, nullable = false)
	private String name;
	
	@Column(name = "last_name", length = 30, nullable = false)
	private String lastName;
	
	@Column(name = "phone", length = 9, nullable = false)
	private Integer phone;
	
	@Column(name = "dni", length = 8, nullable = false)
	private Integer dni;
	
	@Column(name = "address", nullable = false) 
	private String adress;
	
	@Column(name = "email", length = 30, nullable = false)
	private String email;
	
	@OneToMany(mappedBy = "organizer")
	private List<Meeting> meetings;
	
	public Organizer() {
	meetings = new ArrayList<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(List<Meeting> meetings) {
		this.meetings = meetings;
	}
	
}
