package com.wipro.velocity.model;


import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection  = "ministry")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MinistryModel {
	
	private String ministryId;
	private String password;
	public MinistryModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MinistryModel(String ministryId, String password) {
		super();
		this.ministryId = ministryId;
		this.password = password;
	}
	public String getMinistryId() {
		return ministryId;
	}
	public void setMinistryId(String ministryId) {
		this.ministryId = ministryId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
