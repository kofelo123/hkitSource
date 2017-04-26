package Test1;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int w;
		int h;
		int g;
		int r = 0;
		String x;
		System.out.println("성별입력:1.남자2.여자");
		g= sc.nextInt();
		System.out.println("키를 입력하세요");
		h=sc.nextInt();
		System.out.println("몸무게를 입력하세요");
		w=sc.nextInt();
		
		if(1==g){
			r=h-100;
		}else if(2==g){
		r=h-105;
		}else{
			System.out.println("잘못입력했습니다");
		}
		if(r<(w+5)){
			System.out.println("비만입니다");
		}else if(r<w-5){
			System.out.println("미달입니다");
		}else {
			System.out.println("표준입니다");
				
			}
	}

}
