package com.acat.pojo;

import java.io.Serializable;

public class Province implements Serializable{
	private int id;
	private String province;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
}
