package HW2_7;
import java.util.*;
public class HW2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=1, num =0, sum = 0; 
		do{
			System.out.println(i+"번째 숫자를 입력하세요.");
			num = sc.nextInt();
			if(i%2 == 0){
				if(num>0 || num<0)
					num = num*(-1);
			}
			sum += num;
			i++;
		}while(i<11);
		System.out.println("총합은 :"+sum);
	}

}
