package com.titanium.models;

import org.springframework.stereotype.Component;

@Component("subjectType")
public class SubjectTypes {

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

	@Override
	public String toString() {
		return "SubjectTypes [subject_type_id=" + subject_type_id + ", subject_type=" + subject_type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subject_type == null) ? 0 : subject_type.hashCode());
		result = prime * result + ((subject_type_id == null) ? 0 : subject_type_id.hashCode());
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
		SubjectTypes other = (SubjectTypes) obj;
		if (subject_type == null) {
			if (other.subject_type != null)
				return false;
		} else if (!subject_type.equals(other.subject_type))
			return false;
		if (subject_type_id == null) {
			if (other.subject_type_id != null)
				return false;
		} else if (!subject_type_id.equals(other.subject_type_id))
			return false;
		return true;
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
