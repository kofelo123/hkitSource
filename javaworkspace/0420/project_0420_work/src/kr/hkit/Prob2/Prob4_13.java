package kr.hkit.Prob2;

public class Prob4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "12o34";
		char ch = ' ' ;//???
		boolean isNumber = true;
		
		
		for(int i =0; i < value.length(); i++){
			if((value.charAt(i)<48) || (value.charAt(i)>58))//아스키 숫자범위에 들어오는지
				isNumber=true;
			else
				isNumber=false;
		
		}
		
		if(isNumber){
			System.out.println(value+"는 숫자입니다.");//true
		}else{
			System.out.println(value+"는 숫자가 아닙니다.");//false
		}
	}

}
