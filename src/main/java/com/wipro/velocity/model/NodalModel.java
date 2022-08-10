package com.wipro.velocity.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "nodalofficer")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NodalModel {
	
	private String nodalId;
	private String password;
	public NodalModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NodalModel(String nodalId, String password) {
		super();
		this.nodalId = nodalId;
		this.password = password;
	}
	public String getNodalId() {
		return nodalId;
	}
	public void setNodalId(String nodalId) {
		this.nodalId = nodalId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
