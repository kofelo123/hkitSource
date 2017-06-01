package com.oop.oop_0510;

class Triangle {

	private int width;
	private int column;
	
	public Triangle(int width,int column) {
		this.width=width;
		this.column=column;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public double calArea(){
		return (double)(width * column / 2);
	}
	
	

}

public class TriangleTest{
	public static void main(String[] args) {
		Triangle triangle = new Triangle(10,5);
		triangle.setColumn(20);
		triangle.setWidth(50);
		System.out.println("¹Øº¯Àº: "+triangle.getWidth());
		System.out.println("³ôÀÌ´Â: "+triangle.getColumn());
		System.out.println("³ÐÀÌ´Â: "+triangle.calArea());
	}
}