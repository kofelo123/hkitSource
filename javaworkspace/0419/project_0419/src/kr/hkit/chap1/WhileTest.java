package kr.hkit.chap1;

public class WhileTest {
	
	public static void main(String[] args) {
		int i=1;
		int b=1;
		int total=0;
		
		
		
		/*for(int j=1; j<10;j++){
			for(int k=1; k<10;k++){
				System.out.println(j+" x "+k+" = "+j*k);
			}
			System.out.println("----------------");
		}
		*/
	/*	while(i<10){
			while(b<10){
				
				System.out.println(i+" x "+b+" = "+i*b);
				b++;
			}
			i++;
			b=1;			
		}*/
		
		for(int j=1; j<11;j++){
			for(int k=1; k<=j;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		

		/*for(i=0; i<10; i++){
			total +=i;
		}
		System.out.println(total);
		
		*/
	/*	do{
			
			System.out.print("*");
			i++;
		}while(i<10);
		*/
//		System.out.println(total);

		/*
		for(int j=0; j<10; j++){
			System.out.print("*");
		}
		*/
	
		
		/*while(i < 100){
			total+=i+1;
			
			i++;
		}*/
		/*do {
			
		System.out.println("I like JAVA");
			i++;
		}while(i<5);*/
	}
}
