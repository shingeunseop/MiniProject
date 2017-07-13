package com.javaex.Project;

public class Profile {
	
	private String name;
	private String hp;
	private String company;
	
	public Profile() {}
	
	
	public Profile(String name, String hp, String company) {
		
		
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void showInfo(int k) {
		System.out.println(k + 1 + ". " +name + "      "+ hp + "   " + company);
	}
	
	

}