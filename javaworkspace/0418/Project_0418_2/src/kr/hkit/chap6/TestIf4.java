package kr.hkit.chap6;

import java.util.Scanner;

public class TestIf4 {
	Scanner scanner = new Scanner(System.in);
	String gender;
	int height,weight,index,gap;
	
	
	public void input(){
		System.out.print("성별에 맞는 값을 입력(남자,여자): ");
		gender=scanner.nextLine();
		
		System.out.print("신장을 입력해주세요: ");
		height=scanner.nextInt();
		
		System.out.print("체중을 입력해주세요: ");
		weight=scanner.nextInt();
	}
	
	public void health(){		
		
		if(gender.equals("남자")){
			index=height-100;//표준몸무게
			gap=weight-index;//본인몸무게-표준몸무게 (범위측정)
			if(gap<-5){
				System.out.println("남성 미달입니다."+"(표준몸무게"+index+"와 몸무게차이="+gap+")");
			}else if(gap>5){
				System.out.println("남성 초과입니다."+"(표준몸무게"+index+"와 몸무게차이="+gap+")");
				
			}else {
				System.out.println("남성 표준입니다."+"(표준몸무게"+index+"와 몸무게차이="+gap+")");
			}
		
		}else if(gender.equals("여자")){
			index=height-105;//표준몸무게
			gap=weight-index;//본인몸무게-표준몸무게 (범위측정)
			if(gap<-5){
				System.out.println("여성 미달입니다."+"(표준몸무게"+index+"와 몸무게차이="+gap+")");
			}else if(gap>5){
				System.out.println("여성 초과입니다."+"(표준몸무게"+index+"와 몸무게차이="+gap+")");
				
			}else {
				System.out.println("여성 표준입니다."+"(표준몸무게"+index+"와 몸무게차이="+gap+")");
			}
		}
		
		
	}
	
	public void method2(){
		System.out.println("메소드2");
	}
	
	
	public static void main(String[] args) {
	
		TestIf4 testIf4 = new TestIf4();
		testIf4.input();
		testIf4.health();
		
	}
}
