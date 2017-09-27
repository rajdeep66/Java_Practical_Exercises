import java.util.Scanner;
public class Guess {

	public static void main(String[] args) {
		Boolean  Y=true;
Scanner ne=new Scanner(System.in); 
		int targetNumber=56;
		System.out.println("Please enter a Number between(1-100) ");
		
		long a=ne.nextInt();
		if(a<0||a>100)
		{System.out.println("Number is our of range  ");
			}
		else
		{  while(Y)
			if(a==targetNumber)
			{Y=false;
			System.out.println("You guessed correct Number ");
			}
			else if(a<targetNumber) {
				System.out.println("Your number is less then Original Number");
				System.out.println("Please enter again ");
				
				 a=ne.nextInt();
				
			}
			else if(a>targetNumber) {
				System.out.println("Your number is greater then Original Number");
				System.out.println("Please enter again ");
				
				 a=ne.nextInt();
			
			}
		}
		

	}

}
