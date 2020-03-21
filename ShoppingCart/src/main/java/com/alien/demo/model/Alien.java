package com.alien.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	private Integer aid;
	private String aname;
	private String tech;
	private boolean incart;
	private String path;
	
	public boolean isIncart() {
		return incart;
	}
	public void setIncart(boolean incart) {
		this.incart = incart;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
//	public Alien(Integer aid, String aname, String tech) {
//		super();
//		this.aid = aid;
//		this.aname = aname;
//		this.tech = tech;
//	}
	
	
	public Alien () {}
	
}
