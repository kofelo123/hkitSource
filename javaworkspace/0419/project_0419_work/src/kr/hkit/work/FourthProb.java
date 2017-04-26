package kr.hkit.work;

public class FourthProb {
	
	public FourthProb() {
		cal();		
	}
	
	public void cal(){
		int i=1,k=0,sum=0;
		do{
			sum+=i;
			
			if(i%10==0){	
				k+=10;							
				if(sum!=5050){
					System.out.println("1~"+k+" : " + "0000");
				}else
					System.out.println("1~100 : "+sum);
			}
			i++;
		}while(i<101);
	}

	public static void main(String[] args) {

		FourthProb fourthProb = new FourthProb();
	}

}
