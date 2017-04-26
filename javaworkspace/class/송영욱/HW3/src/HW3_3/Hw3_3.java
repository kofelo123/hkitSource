package HW3_3;
import java.util.*;
public class Hw3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		for(int i=0; i<num; i++){
			for(int j=num-i; j>0; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
