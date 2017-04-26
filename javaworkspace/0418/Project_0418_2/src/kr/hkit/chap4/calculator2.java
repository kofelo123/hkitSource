package kr.hkit.chap4;

public class calculator2 {
	
	double radius=4.5;
	final double PI=3.141592;
	
		
	public double circum(){
		
		return (radius*2)*PI;
	}
	
	public double area(){
		
		return (radius*radius)*PI;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	calculator2 calculator2 = new calculator2();
	System.out.println("원둘레 구하기:"+calculator2.circum());
	System.out.println("원넓이 구하기:"+calculator2.area());
	}

}
