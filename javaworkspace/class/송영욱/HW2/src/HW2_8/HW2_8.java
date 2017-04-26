package HW2_8;
import java.util.*;
public class HW2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String season = "";
		System.out.println("=====================");
		System.out.println("가장 좋아하는 월은?(종료:0)");
		System.out.println("=====================");
		int num = sc.nextInt();
		do{
			System.out.println("*****"+num+"월*****");
			if(num>12 || num == 0){
				System.out.println("잘못된 월을 입력하였습니다.");
				return;
			}
			if(num>=3 && num<=5)
				season = "봄";
			else if(num>=6 && num<=8)
				season = "여름";
			else if (num>=9 && num<=11)
				season = "가을";
			else
				season = "겨울";
				
			System.out.println(num+"월은 "+season+"에 해당됩니다.");
		}while(num == 0);
	}

}
