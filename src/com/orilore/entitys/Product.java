package com.orilore.entitys;
public class Product{
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
	private String picture;
	public void setPicture(String picture){
		this.picture=picture;
	}
	public String getPicture(){
		return this.picture;
	}
	private String info;
	public void setInfo(String info){
		this.info=info;
	}
	public String getInfo(){
		return this.info;
	}
	private Integer status;
	public void setStatus(Integer status){
		this.status=status;
	}
	public Integer getStatus(){
		return this.status;
	}
    private String jianjie;
    public void setJianjie(String jianjie){
    	this.jianjie=jianjie;
    }
    public String getJianjie(){
    	return this.jianjie;
    }
}