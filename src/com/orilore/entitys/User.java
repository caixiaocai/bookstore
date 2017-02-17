package com.orilore.entitys;
public class User{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private String name;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	private String password;
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return this.password;
	}
	private String phone;
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return this.phone;
	}
	private String address;
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return this.address;
	}
}