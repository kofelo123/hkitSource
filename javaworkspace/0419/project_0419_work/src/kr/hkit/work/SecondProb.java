package kr.hkit.work;

public class SecondProb {

	
	public SecondProb() {
		sum();
	}
	
	public void sum(){
		int i=100;
		int sum=0;
		do{
			if(i%2==1)
			sum+=i;
			
			i--;
		}while(i>=1);
		System.out.println(sum);
	}
	public static void main(String[] args) {
	SecondProb secondProb = new SecondProb();
	

	}

}
