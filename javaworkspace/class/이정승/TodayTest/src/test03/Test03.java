package test03;

import java.util.Scanner;

public class Test03 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int m, w, temp, num;  //변수
		
		System.out.println("1은 남자, 2는 여자 입니다. 입력하세요");
		temp = sc.nextInt();
		
		System.out.println("토익점수를 입력하세요");
		num = sc.nextInt();
		
		switch(temp){
		case 1:
			if(num >= 800){
				System.out.println("항공 승무원 지원 자격 가능자 입니다.");
			}
			else
				System.out.println("지원 자격이 없습니다.");
			break;
		case 2:
			if(num >= 700){
				System.out.println("항공 승무원 지원 자격 가능자 입니다.");
			}
			else
				System.out.println("지원 자격이 없습니다.");
			break;
		}
				
	}

}
