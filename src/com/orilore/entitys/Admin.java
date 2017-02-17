package com.orilore.entitys;
public class Admin{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private String username;
	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
		return this.username;
	}
	private String password;
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return this.password;
	}
	private String loginip;
	public void setLoginip(String loginip){
		this.loginip=loginip;
	}
	public String getLoginip(){
		return this.loginip;
	}
	private String logintime;
	public void setLogintime(String logintime){
		this.logintime=logintime;
	}
	public String getLogintime(){
		return this.logintime;
	}
}