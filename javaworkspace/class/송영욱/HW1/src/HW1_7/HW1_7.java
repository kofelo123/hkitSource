package HW1_7;
import java.util.*;
public class HW1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("키, 몸무게, 성별을 입력해주세요");
		int height = sc.nextInt();
		int weight = sc.nextInt();
		String gender = sc.nextLine();
		int std = 0;
		
		if(gender.charAt(1) == 'm' || gender.charAt(1) == 'M')
			std = height - 100;
		if(gender.charAt(1) == 'F' || gender.charAt(1) == 'f')
			std = height - 105;
		
		if(weight >= std + 5)
			System.out.println("비만");
		else if(weight < std - 5)
			System.out.println("약체");
		else
			System.out.println("표준체형");
	}

}
