package hw01;

public class Test01 {

	public static void main(String[] args) {
		int a=1, total=0, plus =0;
		
		for(int i=0; i<15; i++) {
			
			plus += 1;
			System.out.print(a + ", ");
			a += plus;
		}
	}

}
