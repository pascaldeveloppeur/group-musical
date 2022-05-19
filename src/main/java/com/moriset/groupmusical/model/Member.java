package com.moriset.groupmusical.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="membres")
public class Member {
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", date=" + date
				+ ", monnie=" + monnie + "]";
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private Date date;
	
	@Column
	private long monnie;
	
	
	public Member() {
		super();
	}


	public Member( String firstName, String lastName, Date date, long monnie) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.monnie = monnie;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public long getMonnie() {
		return monnie;
	}


	public void setMonnie(long monnie) {
		this.monnie = monnie;
	}
	
	
	
	

}
