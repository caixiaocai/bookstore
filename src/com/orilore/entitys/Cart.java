package com.orilore.entitys;
public class Cart{
	private Integer Id;
	public void setId(Integer Id){
		this.Id=Id;
	}
	public Integer getId(){
		return this.Id;
	}
	private String username;
	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
		return this.username;
	}
	private String bookname;
	public void setBookname(String bookname){
		this.bookname=bookname;
	}
	public String getBookname(){
		return this.bookname;
	}
	private String num;
	public void setNum(String num){
		this.num=num;
	}
	public String getNum(){
		return this.num;
	}
	private Float price;
	public void setPrice(Float price){
		this.price=price;
	}
	public Float getPrice(){
		return this.price;
	}
	private Float discount;
	public void setDiscount(Float discount){
		this.discount=discount;
	}
	public Float getDiscount(){
		return this.discount;
	}
}