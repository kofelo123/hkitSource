package Test1;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1; 
		int num2;
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		num1 = sc.nextInt();
		System.out.println("�ι�°���ڸ� �Է��ϼ���");
		num2=sc.nextInt();
				if((num1+num2)%2==0) {
					System.out.println("�� ���ڴ� ���� ¦�� �Ǵ� Ȧ�� �Դϴ�.");
				} else {
					System.out.println("�� ���ڴ� �ٸ� �� �Դϴ�.");
				}
			}

		}
