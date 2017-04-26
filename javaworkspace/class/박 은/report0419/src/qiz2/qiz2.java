package qiz2;

public class qiz2 {

	public static void main(String[] args) {
		int a=100;
		int total=0;
		do{
			a--;
			if(a%2==1){
				total= total+a;
			}else
			System.out.println(total);
			}while(a>0);
	}

}
