import java.util.Scanner;  
public class palindrom {
	
	
	
	public static void CheckNumber(int a) {
		  int result,sum=0;
		  int sum1=0;
		  int temp=a;    
		  while(a>0){    
		   result=a%10;
		   
		   if(result%2==0)sum1=sum1+result;
		   sum=(sum*10)+result;
		   a=a/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome"); 
		  
		  if(sum1>25)System.out.println("and the sum of even numbers is greater than 25");
		  else System.out.println("and the sum of even numbers is less than 25");
	}		
			

	public static void main(String[] args) {
			
		
		Scanner sc=new Scanner(System.in); 
		
		
		System.out.println("Please enter a number ");
		
		int input=sc.nextInt(); 
		
		
		System.out.println("You entered "+input);
		
		CheckNumber(input);
		

	}

}
