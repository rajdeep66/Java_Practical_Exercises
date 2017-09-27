import java.util.Scanner;


public class StringRepeater {

	public static void main(String[] args) {
		
		
		Scanner ne=new Scanner(System.in);
		System.out.println("Enter a word");
		
		String word=ne.next();
		
		
		System.out.println("Enter a number");
		
		int number=ne.nextInt();
		System.out.print (word);
		for(int i=0;i<number;i++)
		{   int a=word.length();
			
			System.out.print (word.substring(a-number));
			
		}
		
	}

}
