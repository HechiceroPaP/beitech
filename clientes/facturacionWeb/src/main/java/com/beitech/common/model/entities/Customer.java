package com.beitech.common.entities;

import java.io.Serializable;

public class Custumer implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long custumerId;
	private String name;
	private String email;

	public Long getCustumerId() {
		return custumerId;
	}

	public void setCustumerId(Long custumerId) {
		this.custumerId = custumerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
