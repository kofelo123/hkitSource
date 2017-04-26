package Test1;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int time;
		int buy;
		double result = 0;
		double result2 = 0;
	
		System.out.println("구입시간을 입력하세요");
		time=sc.nextInt();
		System.out.println("총 구입금액을 입력하세요");
		buy=sc.nextInt();
		
		if(time<12){
			result=buy-buy*0.05;
		
		}else if(time>12){
		result2=buy-buy*0.025;
				
			}
		if(time<12){
			System.out.println("구입시간"+time);
			System.out.println("총 구입금액"+buy);
			System.out.println("실제지불금액"+result);
		}else if(time>12){
			System.out.println("직급"+time);
			System.out.println("본봉"+buy);
			System.out.println("실수령액"+result2);
		
	}

}
}