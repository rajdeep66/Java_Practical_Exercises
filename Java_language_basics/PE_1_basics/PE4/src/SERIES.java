import java.util.Scanner;



public class SERIES {

	public static void main(String[] args) {
		
       int repeat=1;
		Scanner ne=new Scanner(System.in); 
		
      System.out.println("Please enter a NUMBER  ");
		
		int input=ne.nextInt(); 
		
		for(int i=1; i<=input ;i++)
		{for(int j=0; j<repeat;j++)
			System.out.print(i);
		repeat++;
		}
		
		
	}

}
