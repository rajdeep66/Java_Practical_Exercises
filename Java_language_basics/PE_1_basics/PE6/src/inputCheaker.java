import java.util.Scanner;

public class inputCheaker {

	public static void main(String[] args) {
		
		
			Scanner ne=new Scanner(System.in); 
			
			System.out.println("Please enter a Character   ");
			
			char ch = ne.next().charAt(0) ;
			
//  System.out.println("you enetered "+ch);
  
  if (ch>=65 && ch<=90)
	  System.out.println("you enetered a Capital letter");
  else if (ch>=97 && ch<=122)
	  System.out.println("you enetered a Lowercase letter");
  else if (ch>=48 && ch<=57)
	  System.out.println("you enetered a Digit");
  else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)||
          (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
	  
	  System.out.println("you enetered a Special symbol");
	  
  
  
	}
	

}
