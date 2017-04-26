package quiz3;

			import java.util.Scanner;
			public class quiz3 {
			public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a, toic;
			System.out.println("성별을 선택해주세요.");
			System.out.println("1.남자 2.여자");
			 a = sc.nextInt();
			 System.out.println(a);
			 if(a==1 || a==2){
			 System.out.println("토익점수를입력해주세요.");
			 toic = sc.nextInt();
			 if(a==1&800<toic || a==2&700<toic){System.out.println("항공 승무원 지원 자격 가능자입니다.");}
			 else System.out.println("죄송합니다.항공 승무원 지원 자격이 불가능 합니다");
				}
			
		}
	}
