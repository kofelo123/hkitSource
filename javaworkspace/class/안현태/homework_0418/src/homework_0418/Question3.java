package homework_0418;

import java.util.Scanner;

public class Question3 {
	public static void main(String args[]){
		String s;
		int jumsoo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력하세요 : ");
		s=sc.nextLine();
		
		System.out.println("토익점수를 입력하세요 : ");
		jumsoo=sc.nextInt();
		
		if( (s.equals("f") && jumsoo>=700)  || (s.equals("m") && jumsoo>=800) )
		System.out.println("항공 승무언 지원 자격 가능자입니다.");
	
		else
			System.out.println("지원 자격 가능자가 아닙니다.");
	}
}
