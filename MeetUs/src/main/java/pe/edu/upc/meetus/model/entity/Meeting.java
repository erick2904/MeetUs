package pe.edu.upc.meetus.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "meeting",
indexes = {@Index(columnList = "name",name = "meeting_index_name")})
public class Meeting {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name", length = 30, nullable = false)
	private String name;
	
	@Column(name = "date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(name = "hour", nullable = false)
	@Temporal(TemporalType.TIME)
	private Date hour;
	
	@Column(name = "type", length = 20, nullable = false)
	private String type;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	//@ManyToOne
	@Column(name = "local", length = 30, nullable = false)
	private String local;
	
	@ManyToOne
	@JoinColumn(name = "organizer_id", nullable = false)
	private Organizer organizer;

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getHour() {
		return hour;
	}

	public void setHour(Date hour) {
		this.hour = hour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Organizer getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}
	
}
