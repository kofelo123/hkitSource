package chap06;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c;
		String duk;
		System.out.print("직급을 입력하시오 : ");
		a=in.nextInt();
		System.out.print("근무시간을 입력하시오 : ");
		b=in.nextInt();
		switch(a){
		case 5:
		case 6:
			if(b>40){
				c=b-40;
				System.out.println("직급 : "+a+"급");
				System.out.println("근무시간 : "+b+"시간");
				System.out.println("주급여 : "+(40*20000+c*20000*1.5));
			}else{
				System.out.println("직급 : "+a+"급");
				System.out.println("근무시간 : "+b+"시간");
				System.out.println("주급여 : "+40*20000);
			}
			break;
		case 7:
		case 8:
			if(b>40){
				c=b-40;
				System.out.println("직급 : "+a+"급");
				System.out.println("근무시간 : "+b+"시간");
				System.out.println("주급여 : "+(40*15000+c*15000*1.5));
			}else{
				System.out.println("직급 : "+a+"급");
				System.out.println("근무시간 : "+b+"시간");
				System.out.println("주급여 : "+40*15000);
			}
			break;	
		default:
			break;
		}

	}

}
