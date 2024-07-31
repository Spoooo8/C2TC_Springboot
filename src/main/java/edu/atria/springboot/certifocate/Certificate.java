package edu.atria.springboot.certifocate;
	
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name="certificate_db")
@NoArgsConstructor
@AllArgsConstructor
public class Certificate {
	
	public Certificate(int id, Date date, String course) {
		super();
		this.id = id;
		this.date = date;
		this.course = course;
	}

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "issue")
	private Date date;
	
	@Column(name = "course")
	private String course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}



	@Override
	public String toString() {
		return "Certificate [id=" + id + ", date=" + date + ", course=" + course + "]";
	}
	
	
	
}

