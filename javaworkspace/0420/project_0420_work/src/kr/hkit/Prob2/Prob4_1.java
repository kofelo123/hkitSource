package kr.hkit.Prob2;

public class Prob4_1 {

	
	public static boolean prob1(int x){
		
		if((x>10)&&(x<20))		
			return true;
		else return false;
		
	}
	
	public static boolean prob2(char ch){
		 if(!(ch == ' ' || ch == '\t'))
			 return true;
		
		 return false;
			
	}
	
	public static boolean prob3(char ch){
		if((ch=='x')||(ch=='X'))
			return true;
		
		return false;
	}
	
	public static boolean prob4(char ch){
		if(ch>='0'&&ch<='9')
			return true;
		
		return false;
	}
	
	public static boolean prob5(char ch){
		if(ch>='A'&&ch<='z')//아스키순서 A~z 
			return true;
		
		return false;
	}
	
	public static boolean prob6(int year){
		if((year%400==0)||(year%4==0)||(year%100==0))
			return true;
		
		return false;
	}
	
	public static boolean prob7(boolean powerOn){
		if(powerOn==false)
			return true;
		
		return false;
	}
	
	public static boolean prob8(String str){
		if(str=="yes")
			return true;
		return false;
		
	}
	
	public static void main(String[] args) {
		/*System.out.println(Prob4_1.prob3('X'));
		System.out.println(Prob4_1.prob4('1'));
		System.out.println(Prob4_1.prob5('A'));
		*/
	
	}
}
