package com.sapient.marketdata.service.model;

import java.time.Instant;

public class MetalsModel {
	
	private Integer id;
	private String name;
	private Instant updatedDate;

	public MetalsModel() {
		super();
	}

	public MetalsModel(Integer id, String name, Instant updatedDate) {
		super();
		this.id = id;
		this.name = name;
		this.updatedDate = updatedDate;
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

	public Instant getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Instant updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}
