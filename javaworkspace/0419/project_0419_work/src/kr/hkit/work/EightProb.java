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
			System.out.print("���� �����ϴ� ����?(����:0)");
			season=scanner.nextInt();
			System.out.println("===========================");
			
			if((season<6) && (season>2)){
				System.out.println("******** "+season+"��"+" ********");
				System.out.println(season+"���� ���� �ش�˴ϴ�.");
			}else if((season<9) && (season>5)){
				System.out.println("******** "+season+"��"+" ********");
				System.out.println(season+"���� ������ �ش�˴ϴ�.");
			}else if(((season<12) && (season>8))||season==1){
				System.out.println("******** "+season+"��"+" ********");
				System.out.println(season+"���� ������ �ش�˴ϴ�.");
			}else if((season==12)||(season==1)||season==2){
				System.out.println("******** "+season+"��"+" ********");
				System.out.println(season+"���� �ܿ￡ �ش�˴ϴ�.");
			}
			
		}while(season!=0);
		
		
	}
	
	public static void main(String[] args) {

		EightProb eightProb = new EightProb();
	}

}