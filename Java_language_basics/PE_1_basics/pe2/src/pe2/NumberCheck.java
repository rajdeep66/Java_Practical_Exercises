package pe2;

import java.util.Scanner; 
public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
System.out.println("Please enter a number ");
		
		int input=sc.nextInt(); 
		
		
		System.out.println("You entered "+input);
		
		if(input%2==0 && input>20 && input<30)
			
		
		System.out.println("Jerry");
		
		
		else if (input%2 != 0 && input>20 && input<30)
			System.out.println("Tom");
		else
			System.out.println("Enter a number between 20 and 30 ");
	}

}
