package housework;

public class sol2 {
	public static void main(String[] args){
		int num=100;
		int sum =0;
		do{
			num--;
			if(num%2==1){
				sum+=num;
			}
		}while(num>=1);
		System.out.println("100부터 1까지 홀수의 합:"+sum);
	}
}
