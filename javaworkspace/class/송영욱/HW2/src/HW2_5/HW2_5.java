package HW2_5;
import java.util.*;
public class HW2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int sum = 0, i=0, cnt=0, val = 0;
		do{
			i+=3;
			if(num >= i){
				val = i;
				sum += i;
			}
			cnt++;
		}while(num>=i);
		System.out.println("사용자 입력 : "+num);
		System.out.println(num+"을 넘었을 때의 값 : "+i);
		System.out.println(num+"을 넘었을 때까지의 총합계 : "+sum);
		System.out.println(num+"을 넘었을 때까지 몇 번째 3의 배수인가 : "+cnt);
	}

}
