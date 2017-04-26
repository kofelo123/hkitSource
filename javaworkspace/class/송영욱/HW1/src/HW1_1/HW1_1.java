package HW1_1;
import java.util.*;
public class HW1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		double grade = sc.nextDouble();
		
		if(age < 30 && grade >= 3.5)
			System.out.println("추천 대상입니다.");
		else
			System.out.println("추천 대상이 아닙니다.");
		
		sc.close();
	}

}
