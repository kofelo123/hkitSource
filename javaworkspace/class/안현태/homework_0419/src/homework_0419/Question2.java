package homework_0419;


public class Question2 {

	public static void main(String[] args) {
		
		System.out.println("������ �Է��Ͻÿ�: ");
		
		int i=1;
		int total=0;
		do{		
			if(i%2==1)
				total+=i;
			i++;
		}
		while(i<=100);
		
		System.out.println("���� "+ total);

	}
	
}

