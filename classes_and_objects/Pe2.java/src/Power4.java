import java.util.Scanner;
public class Power4 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to cheak");
	       Scanner sc = new Scanner(System.in);
	       int a = sc.nextInt();
	       int c=0;
	       while(a!=1)
	       { 
	    	   if(a%4!=0)
	    	   { System.out.println("Its not a power of 4");}
	       
	    	   
	    	   a=a/4;
	    	  }
	       if(a==1)
	       System.out.println("Its  a power of 4");
	       }}
	       
	       


