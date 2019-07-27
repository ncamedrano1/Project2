package com.revature.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SubjectTypes {
	@Id
	@GeneratedValue
	private Integer subject_type_id;
	private String subject_type;

	public SubjectTypes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubjectTypes(Integer subject_type_id, String subject_type) {
		super();
		this.subject_type_id = subject_type_id;
		this.subject_type = subject_type;
	}

	public String toString() {
		return "SubjectTypes [subject_type_id=" + subject_type_id + ", subject_type=" + subject_type + "]";
	}

	public Integer getSubject_type_id() {
		return subject_type_id;
	}

	public void setSubject_type_id(Integer subject_type_id) {
		this.subject_type_id = subject_type_id;
	}

	public String getSubject_type() {
		return subject_type;
	}

	public void setSubject_type(String subject_type) {
		this.subject_type = subject_type;
	}

}
