package Test1;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1; 
		int num2;
		
		System.out.println("첫번째 숫자를 입력하세요");
		num1 = sc.nextInt();
		System.out.println("두번째숫자를 입력하세요");
		num2=sc.nextInt();
				if((num1+num2)%2==0) {
					System.out.println("두 숫자는 같은 짝수 또는 홀수 입니다.");
				} else {
					System.out.println("두 숫자는 다른 수 입니다.");
				}
			}

		}
