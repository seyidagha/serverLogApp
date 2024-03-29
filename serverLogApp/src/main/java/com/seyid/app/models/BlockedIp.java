package com.seyid.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlockedIp {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String ip;
	private String comment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public BlockedIp(String ip, String comment) {
		super();
		this.ip = ip;
		this.comment = comment;
	}
}
