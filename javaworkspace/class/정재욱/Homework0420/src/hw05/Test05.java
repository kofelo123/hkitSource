package hw05;

public class Test05 {

	public static void main(String[] args) {

		System.out.println("====for¹® »ï°¢Çü3====");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0  ; j--) {
				if(i>=j) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}

		System.out.println("====for¹® »ï°¢Çü4====");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 ; j++) {
				if(i<=j) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
	}

}
