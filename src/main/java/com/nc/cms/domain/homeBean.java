package com.nc.cms.domain;

import org.apache.ibatis.type.Alias;

//mapper resultType type name

@Alias("home")
public class homeBean {
	
	private String id;
	private String passWorld;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassWorld() {
		return passWorld;
	}
	public void setPassWorld(String passWorld) {
		this.passWorld = passWorld;
	}
	
	

}
