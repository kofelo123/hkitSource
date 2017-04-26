package kr.hkit.chap1;

public class TestLoop03 {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++){
			if(i<30){
				continue;
			}
			System.out.println(i);
		}
		
	}
}
