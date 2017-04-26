package quiz7;

import java.util.Scanner;

public class quiz7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int kg; int cm; double skg; int a; double b;
		
		System.out.println("성별을 선택하여주십시오.");
		System.out.println("1.남자 2.여자");
		
		a = sc.nextInt();
		if(a==1){ System.out.println("키를 입력해 주세요.");
		 cm = sc.nextInt();
		 skg =cm-100;
		 System.out.println("몸무게를 입력해주세요.");
		 kg = sc.nextInt();
		 b = skg/20;
		 System.out.println("표준몸무게기준은"+(skg+b)+"~"+(skg-b)+"kg입니다"); 
		 if(kg-skg+b>5){ System.out.println(kg-skg+b+"% 초과이므로 당신은 과체중입니다");}
		 else if(kg-skg+b<0){System.out.println(kg-skg+b+"% 부족하므로 당신은 표준미달입니다.");}
		 else System.out.println("당신은 표준체중입니다.");
		}
		 else if(a==2){ System.out.println("키를 입력해 주세요.");
		 cm = sc.nextInt();
		 skg =cm-105;
		 b = skg/20;
		 System.out.println("몸무게를 입력해주세요.");
		 kg = sc.nextInt();
		 System.out.println("표준몸무게기준은"+(skg+b)+"~"+(skg-b)+"kg입니다"); 
		 if(kg-skg+b>5){ System.out.println(kg-skg+b+"% 초과이므로 당신은 과체중입니다");}
		 else if(kg-skg+b<0){System.out.println(kg-skg+b+"% 부족하므로 당신은 표준미달입니다.");}
		 else System.out.println("당신은 표준체중입니다.");
	}
	}

}
