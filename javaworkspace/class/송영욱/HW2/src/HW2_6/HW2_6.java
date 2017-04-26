package HW2_6;
import java.util.*;
public class HW2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 구구단을 입력해주세요.");
		int num = sc.nextInt();
		int i=8;
		System.out.println("사용자입력 : "+num);
		System.out.println("**"+num+"단**");
		do{
			System.out.println(i+" * "+num+" ="+i*num);
			i-=2;
		}while(i>1);
	}

}
