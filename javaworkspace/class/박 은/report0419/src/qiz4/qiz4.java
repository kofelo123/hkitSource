package qiz4;

public class qiz4 {

	public static void main(String[] args) {

		int a=0,sum=0;
		do{
			a++;
			sum=a+sum;
			if(a%10==0){
				System.out.println(1+"-"+a+":"+sum);
					
			}
				}while(a<100);		
	}

}
