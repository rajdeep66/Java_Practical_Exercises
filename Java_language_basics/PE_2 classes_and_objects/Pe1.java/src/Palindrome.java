import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		
		
		System.out.println("enter the word");
	       Scanner sc = new Scanner(System.in);
	       String word = sc.next();
	     int a=word.length();
	     int j=(a-1);
	     char start,end;
	     int flag=0;
	     for(int i=0;i<(a/2);i++)
	    	 
	     {
	    	  start = word.charAt(i);
	          end=word.charAt(j);
	          j--;
	          
	          
	          if (start!=end)
	        	  
	        	  flag=1; 
	          else
	        	 continue; 
	     }
	     
	     if(flag==0)
	    	 System.out.println("Yea its  a palidrome");
	     else
	    	 System.out.println("No its not a palidrome");
	}

}
