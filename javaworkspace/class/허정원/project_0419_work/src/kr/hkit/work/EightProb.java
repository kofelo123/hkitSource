package kr.hkit.work;

import java.util.Scanner;

public class EightProb {
	private int season;

	public EightProb() {
		cal();
	}
	
	public void cal(){
		Scanner scanner = new Scanner(System.in);
		int i=1;
	
		
		do{
			System.out.println("===========================");
			System.out.print("가장 좋아하는 월은?(종료:0)");
			season=scanner.nextInt();
			System.out.println("===========================");
			
			if((season<6) && (season>2)){
				System.out.println("******** "+season+"월"+" ********");
				System.out.println(season+"월은 봄에 해당됩니다.");
			}else if((season<9) && (season>5)){
				System.out.println("******** "+season+"월"+" ********");
				System.out.println(season+"월은 여름에 해당됩니다.");
			}else if(((season<12) && (season>8))||season==1){
				System.out.println("******** "+season+"월"+" ********");
				System.out.println(season+"월은 가을에 해당됩니다.");
			}else if((season==12)||(season==1)||season==2){
				System.out.println("******** "+season+"월"+" ********");
				System.out.println(season+"월은 겨울에 해당됩니다.");
			}
			
		}while(season!=0);
		
		
	}
	
	public static void main(String[] args) {

		EightProb eightProb = new EightProb();
	}

}
