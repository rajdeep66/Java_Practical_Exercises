import java.util.Scanner;
import java.util.Arrays;
public class StudentINput {

	static int n;
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  Number of student ");
		 n=sc.nextInt();
		int[] grades;
		grades= new int[n];
		
		for(int i=0;i<n;i++)
			
		{	System.out.println("Enter Grades for student "+(i+1));	
	        grades[i]=sc.nextInt();	
		
		}
		
		average(grades);
		min(grades);
	    max(grades);
		
	}
	public static void average(int[] t) {
	
	int sum=0;
	
	for(int i=0;i<n;i++) {
	sum +=t[i];
			
	}
	
	float average= (sum/n);
	System.out.println("The average is  "+average);	
	
}
	
	public static void min(int[] t) 
	{
		int min =t[0];
		for(int i=0;i<n;i++)
		{
			if(min>=t[i])
				min=t[i];
			
		}
		System.out.println("Minimum score is  "+min);	
	}
	public static void max(int[] t) 
	{
		int max =t[0];
		for(int i=0;i<n;i++)
		{
			if(max>=t[i])
				max=t[i];
			
		}
		System.out.println("Max score  is  "+max);	
	}
	
	
	
	
}	


