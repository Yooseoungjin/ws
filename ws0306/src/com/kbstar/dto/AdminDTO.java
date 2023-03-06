package com.kbstar.dto;

public class AdminDTO {
	private String Aid;
	private String Apwd;
	private String Aname;

	public AdminDTO() {
	}

	public AdminDTO(String id, String pwd, String name) {
		Aid = id;
		Apwd = pwd;
		Aname = name;
	}

	public String getAid() {
		return Aid;
	}

	public void setAid(String aid) {
		Aid = aid;
	}

	public String getApwd() {
		return Apwd;
	}

	public void setApwd(String apwd) {
		Apwd = apwd;
	}

	public String getAname() {
		return Aname;
	}

	public void setAname(String aname) {
		Aname = aname;
	}

	@Override
	public String toString() {
		return "AdminDTO [Aid=" + Aid + ", Apwd=" + Apwd + ", Aname=" + Aname + "]";
	}
}