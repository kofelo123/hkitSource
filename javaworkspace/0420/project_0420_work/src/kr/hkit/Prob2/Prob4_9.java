package kr.hkit.Prob2;

public class Prob4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++){ //charAt(인자),아스키코드
			
//		sum=sum+str.charAt(i); sum에 넣으면 아스키코드로 계산된다. 48을 뺴줘야된다.char의 경우 바꾸는게 없는것같다.
			sum=sum+((int)str.charAt(i)-48);
		}

		
		System.out.println("sum="+sum);
	}
}
