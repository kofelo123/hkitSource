package com.jeongwon.prob;

public class Plane {

	private String production;
	private String model;
	private int maxPerson;
	private static int planes;
	
	public Plane() {
		// TODO Auto-generated constructor stub
		planes++;
	}
	public Plane(String production,String model) {
		this.production = production;
		this.model = model;
		planes++;
	}
	public Plane(String production,String model,int maxPerson) {
		this.production = production;
		this.model = model;
		this.maxPerson = maxPerson;
		planes++;
	}
	
	
	public static int getPlanes() {
		return planes;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxPerson() {
		return maxPerson;
	}
	public void setMaxPerson(int maxPerson) {
		this.maxPerson = maxPerson;
	}
	
	
}

class planeTest{
	public static void main(String[] args) {
		 Plane plane = new Plane();
		 Plane plane2 = new Plane("대한항공","A550");
		 Plane plane3 = new Plane("유나이티드","B55",400);
		 
		 plane.getModel();
		 plane2.setMaxPerson(44);
		 plane3.setProduction("아시아나");
		 
		 System.out.println(Plane.getPlanes());
	}
}
