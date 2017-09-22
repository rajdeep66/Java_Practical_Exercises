import java.util.Scanner;
public class EvenNumTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int input =sc.nextInt();
		boolean y = isEven(input);
		if(y)
			System.out.println("Number is Even");
			else
				System.out.println("Number is Odd");
		

	}
	
	public static boolean isEven(int number) 
	{
		if(number%2==0)
			return true;
			else
				return false;
		
		
	}

}
