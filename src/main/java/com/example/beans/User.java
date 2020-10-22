package com.example.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id @GeneratedValue
	private Long id;
	private String name;
	private int age;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String status;
	private Date AppointDate,ActiveDuration;
	public User(String name, int age, String status, Date appointDate, Date activeDuration) {
		super();
		this.name = name;
		this.age = age;
		this.status = status;
		AppointDate = appointDate;
		ActiveDuration = activeDuration;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getAppointDate() {
		return AppointDate;
	}
	public void setAppointDate(Date appointDate) {
		AppointDate = appointDate;
	}
	public Date getActiveDuration() {
		return ActiveDuration;
	}
	public void setActiveDuration(Date activeDuration) {
		ActiveDuration = activeDuration;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ActiveDuration == null) ? 0 : ActiveDuration.hashCode());
		result = prime * result + ((AppointDate == null) ? 0 : AppointDate.hashCode());
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (ActiveDuration == null) {
			if (other.ActiveDuration != null)
				return false;
		} else if (!ActiveDuration.equals(other.ActiveDuration))
			return false;
		if (AppointDate == null) {
			if (other.AppointDate != null)
				return false;
		} else if (!AppointDate.equals(other.AppointDate))
			return false;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + ", status=" + status + ", AppointDate="
				+ AppointDate + ", ActiveDuration=" + ActiveDuration + "]";
	}

	
	

	
}