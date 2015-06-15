package com.homepage.web.beans;

public class KaupBean {
	private String name;
	private String msg;
	private double Height;
	private double Weight;
	private int idx;
	
		
	public KaupBean(double Height, double Weight) {
		// TODO Auto-generated constructor stub
		this.Height=Height;
		this.Weight=Weight;
	}

	public KaupBean() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return Height;
	}
	
	public void setHeight(double height) {
		this.Height = height;
	}
	
	public double getWeight() {
		return Weight;
	}
	
	public void setWeight(double weight) {
		this.Weight = weight;
	}
			
	public int getIdx() {
		return idx;
	}
	
	public void setIdx() {
		this.idx =(int)((getWeight()/(getHeight()*getHeight()))*10000);;
	}

	public void setMsg(){
		if(idx>30) { this.msg="비만"; }
		else if(idx>24){ this.msg="과체중"; }
		else if(idx>20){ this.msg="정상"; }
		else if(idx>15){ this.msg="저체중"; }
		else if(idx>13){ this.msg="마름"; }
		else if(idx>10){ this.msg="영양실종"; }
		else{ this.msg="소모증";}
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void PrintingKoup() {
		System.out.println("이름->"+getName()+"\t키->"+getHeight()+"\t몸무게->"+getWeight()+"\t카우프지수->"+getIdx()+"\t상태->"+getMsg());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\t카우프지수->"+getIdx()+"\t상태->"+getMsg();
	}
	
}
