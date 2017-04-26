package pr5;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		
              int mg=0,gs=0;
			  double realgold=0.0,totalgold=0.0;
			  final double rate121= 0.05;
			  final double rate122= 0.025;
			  
			 
			  
			  Scanner sc = new Scanner(System.in);
			  
			  System.out.println("총구입 값은? ");
			  mg = sc.nextInt();
			  
			  System.out.println("구입 시간은? ");
			  gs = sc.nextInt();
			  
			  if (gs < 12){
				  
				  realgold = rate121;
				  
			  } else if(gs >= 12) {

			         realgold = rate122;
					  
					  /*totalgold= mg-(mg*realgold);
					  
					  
					  System.out.println("실제 지불금액은?" +totalgold );*/
					  
				  
			  }
			  
			  totalgold= mg-(mg*realgold);
			  
			  
			  System.out.println("실제 지불금액은?" +totalgold );
			  
					
				}

			}
