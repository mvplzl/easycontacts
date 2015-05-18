package com.mvplzl.contacts;

public class Man {
	private int id;
	private String name;
	private String number;
	private String sort;
	private String email;
	public Man(int id, String name, String number, String sort, String email){
		this.id = id;
		this.name = name;
		this.number = number;
		this.sort = sort;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
