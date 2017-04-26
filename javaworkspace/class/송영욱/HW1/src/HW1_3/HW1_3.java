package HW1_3;
import java.util.*;
public class HW1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별과 토익성적을 입력하세요");
		String gender = sc.nextLine();
		int toeic = sc.nextInt();
		
		if((gender.charAt(0) == 'F' && toeic >= 700) || (gender.charAt(0) == 'M' && toeic >= 800))
			System.out.println("항공 승무원 지원 자격 가능자입니다.");
		sc.close();
	}

}
