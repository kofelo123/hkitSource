package kr.hkit.Prob2;

public class Prob4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++){ //charAt(����),�ƽ�Ű�ڵ�
			
//		sum=sum+str.charAt(i); sum�� ������ �ƽ�Ű�ڵ�� ���ȴ�. 48�� ����ߵȴ�.char�� ��� �ٲٴ°� ���°Ͱ���.
			sum=sum+((int)str.charAt(i)-48);
		}

		
		System.out.println("sum="+sum);
	}
}