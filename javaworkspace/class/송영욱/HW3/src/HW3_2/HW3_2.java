package HW3_2;
import java.util.*;
public class HW3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int cnt = sc.nextInt();
		int num = 1;
		for(int i=0; i<cnt; i++){
			System.out.println("");
			for(int j=0; j<cnt; j++){
				System.out.print(num+" ");
				num++;
			}
		}
	}

}
