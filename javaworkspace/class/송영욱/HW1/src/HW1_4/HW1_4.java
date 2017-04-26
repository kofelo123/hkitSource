package HW1_4;
import java.util.*;
public class HW1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("직급과 본봉을 입력하세요.");
		int grade = sc.nextInt();
		int pay = sc.nextInt();
		int orgpay = pay;
		int tax = 0;
		
		if(grade == 5 || grade == 6){
			pay *= 0.88;
			tax = 12;
		}
		else if(grade == 7 || grade == 8){
			pay *= 0.92;
			tax = 8;
		}
		System.out.println("직급 : " + grade + "급");
		System.out.println("본봉 : " + orgpay);
		System.out.println("실수령액(세금"+ tax + "%적용) : "+ pay);
	}

}
