package com.orilore.entitys;
public class Detail{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private String code;
	public void setCode(String code){
		this.code=code;
	}
	public String getCode(){
		return this.code;
	}
	private Integer pid;
	public void setPid(Integer pid){
		this.pid=pid;
	}
	public Integer getPid(){
		return this.pid;
	}
	private String size;
	public void setSize(String size){
		this.size=size;
	}
	public String getSize(){
		return this.size;
	}
	private Integer quantity;
	public void setQuantity(Integer quantity){
		this.quantity=quantity;
	}
	public Integer getQuantity(){
		return this.quantity;
	}
	private Float money;
	public void setMoney(Float money){
		this.money=money;
	}
	public Float getMoney(){
		return this.money;
	}
}