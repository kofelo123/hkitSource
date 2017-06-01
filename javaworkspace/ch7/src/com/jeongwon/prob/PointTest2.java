package com.jeongwon.prob;

public class PointTest2 {

	public static void main(String[] args) {
		
	}
}

class Point {
	int x=10;
	int y=20;
	
	public Point() {
		// TODO Auto-generated constructor stub
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
}

class Point3D extends Point {
	int z=30;
	
	public Point3D() {
		this(100, 200, 300);
	}
	
	public Point3D(int x, int y , int z){
		this.x=x;
		this.y=y;
		this.z = z;
	}
}