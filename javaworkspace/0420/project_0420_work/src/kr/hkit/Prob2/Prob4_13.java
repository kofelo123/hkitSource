package kr.hkit.Prob2;

public class Prob4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "12o34";
		char ch = ' ' ;//???
		boolean isNumber = true;
		
		
		for(int i =0; i < value.length(); i++){
			if((value.charAt(i)<48) || (value.charAt(i)>58))//�ƽ�Ű ���ڹ����� ��������
				isNumber=true;
			else
				isNumber=false;
		
		}
		
		if(isNumber){
			System.out.println(value+"�� �����Դϴ�.");//true
		}else{
			System.out.println(value+"�� ���ڰ� �ƴմϴ�.");//false
		}
	}

}