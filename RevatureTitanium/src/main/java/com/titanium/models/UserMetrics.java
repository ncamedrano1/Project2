package com.titanium.models;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("userMetrics")
public class UserMetrics {
	Integer metrics_id;
	Integer user_id;
	Integer subject_id;
	float user_performance;
	Date dateTaken;

	public UserMetrics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserMetrics(Integer metrics_id, Integer user_id, Integer subject_id, float user_performance,
			Date dateTaken) {
		super();
		this.metrics_id = metrics_id;
		this.user_id = user_id;
		this.subject_id = subject_id;
		this.user_performance = user_performance;
		this.dateTaken = dateTaken;
	}

	@Override
	public String toString() {
		return "UserMetrics [metrics_id=" + metrics_id + ", user_id=" + user_id + ", subject_id=" + subject_id
				+ ", user_performance=" + user_performance + ", dateTaken=" + dateTaken + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateTaken == null) ? 0 : dateTaken.hashCode());
		result = prime * result + ((metrics_id == null) ? 0 : metrics_id.hashCode());
		result = prime * result + ((subject_id == null) ? 0 : subject_id.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		result = prime * result + Float.floatToIntBits(user_performance);
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
		UserMetrics other = (UserMetrics) obj;
		if (dateTaken == null) {
			if (other.dateTaken != null)
				return false;
		} else if (!dateTaken.equals(other.dateTaken))
			return false;
		if (metrics_id == null) {
			if (other.metrics_id != null)
				return false;
		} else if (!metrics_id.equals(other.metrics_id))
			return false;
		if (subject_id == null) {
			if (other.subject_id != null)
				return false;
		} else if (!subject_id.equals(other.subject_id))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		if (Float.floatToIntBits(user_performance) != Float.floatToIntBits(other.user_performance))
			return false;
		return true;
	}

	public Integer getMetrics_id() {
		return metrics_id;
	}

	public void setMetrics_id(Integer metrics_id) {
		this.metrics_id = metrics_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(Integer subject_id) {
		this.subject_id = subject_id;
	}

	public float getUser_performance() {
		return user_performance;
	}

	public void setUser_performance(float user_performance) {
		this.user_performance = user_performance;
	}

	public Date getDateTaken() {
		return dateTaken;
	}

	public void setDateTaken(Date dateTaken) {
		this.dateTaken = dateTaken;
	}

}
