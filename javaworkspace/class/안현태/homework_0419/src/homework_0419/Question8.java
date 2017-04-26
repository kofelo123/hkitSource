package homework_0419;

import java.util.Scanner;

public class Question8 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			do{	
				
				System.out.print("가장 좋아하는 월은? ");
				int gj=sc.nextInt();
				if(gj==0){
					break;
				}
				switch (gj) {
				case 3:
				case 4:
				case 5:
					System.out.println(gj+"월은 봄에 해당됩니다");
					break;
				case 6:
				case 7:
				case 8:
					System.out.println(gj+"월은 여름에 해당됩니다");
					break;
				case 9:
				case 10:
				case 11:
					System.out.println(gj+"월은 가을에 해당됩니다");
					break;
				case 12:
				case 1:
				case 2:
					System.out.println(gj+"월은 겨울에 해당됩니다");
					break;
					
					
				default:
					break;
				}
			}
			while(true);
			
		

	}

}
