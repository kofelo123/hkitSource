package HW3_4;
import java.util.*;
public class HW3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int j=2; j<=num; j++){
			int cnt=1;
			for(int i=2; i<j; i++){
				if(j%i == 0)
					cnt = 0;
			}
			if(cnt == 1)
				System.out.println(j+" ");
		}
	}

}
