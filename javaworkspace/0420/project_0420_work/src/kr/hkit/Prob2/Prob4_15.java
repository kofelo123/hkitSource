package kr.hkit.Prob2;

public class Prob4_15 {
	public static void main(String[] args) {
		
		int number =12321;
		int tmp = number;
		
		int result =0;
		
		while(tmp !=0){// tmp->result & tmp 지워낸다.
			for(int i=10; i<=100000;i=i*10){
				
				/*
				if(i==10){
					result+=(tmp%i)*(k/i);
				}else if(i==100)
				result+=(tmp%i)*(k/(i*10));
				
				tmp-=(tmp%i);
				*/
				switch (i) {
				case 10:
					result+=(tmp%i)*10000;
					tmp-=(tmp%i);
					break;
				case 100:
					result+=(tmp%i)*100;
					tmp-=(tmp%i);
					break;
				case 1000:
					result+=(tmp%i);
					tmp-=(tmp%i);
					break;
				case 10000:
					result+=(tmp%i)/100;
					tmp-=(tmp%i);
					break;
				case 100000:
					result+=(tmp%i)/10000;
					tmp-=(tmp%i);
					break;
				
				}
				
				
				/*if(i>10){
					result+=(number%i/(i/10));
					number-=result;
				}else
					result+=number%i;
					number-=result;
				*/
			}
			
		}
		
		
		if(number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	}
}
