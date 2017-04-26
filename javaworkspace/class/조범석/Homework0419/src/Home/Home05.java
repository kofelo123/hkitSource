package Home;

import java.util.Scanner;

public class Home05 {

	public static void main(String[] args) {
	
	int i, sum=0, j=3;
	
	Scanner sc = new Scanner(System.in);
		
	 System.out.print("숫자 입력");
     i = sc.nextInt();
	 
	 System.out.println("사용자 입력 : "+i);

	 do
	 {
	  sum = sum + j;
	  j = j + 3;
	 }while(j <= i);

	 System.out.println(i+"을 넘었을 때의 값 : "+j);
	 System.out.println(i+ "을 넘었을 때까지의 총합계 : "+sum);
	}

}
